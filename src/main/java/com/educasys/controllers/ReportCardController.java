package com.educasys.controllers;

import com.educasys.entitites.ReportCard;
import com.educasys.services.ReportCardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ReportCards")
public class ReportCardController {

    private final ReportCardService service;

    public ReportCardController(ReportCardService service){
        this.service = service;
    }

    @PostMapping("/add")
    public ResponseEntity <String> createReportCard(@RequestBody ReportCard reportCard){
        ReportCard createdReportCard = service.createReportCard(reportCard);

        if(createdReportCard != null){
            return ResponseEntity.status(HttpStatus.CREATED).body("ReportCard Created");

        } else throw new RuntimeException("ReportCard not created.");
    }

    @GetMapping("/{id}")
    public ResponseEntity <Optional<ReportCard>> getReportCardById(@PathVariable Long id){
        Optional <ReportCard> reportCard = service.getById(id);

        if(reportCard.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(reportCard);
        } else throw new RuntimeException("Id not found");
    }

    @GetMapping("/all")
    public ResponseEntity <List<ReportCard>> allReportCards(){
        List <ReportCard> reportCardList = service.getAll();

        if(reportCardList != null){
            return ResponseEntity.status(HttpStatus.OK).body(reportCardList);
        } else throw new RuntimeException("List Empty");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity <ReportCard> updateReportCard(@RequestBody ReportCard reportCard, @PathVariable Long id){
       ReportCard updatedReportCard = service.updateReportCard(reportCard, id);

       if(updatedReportCard != null){
           return ResponseEntity.status(HttpStatus.OK).body(reportCard);
       } else throw new RuntimeException("Id not found");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity <String> deleteReportCard(@PathVariable Long id){
        Optional <ReportCard> deletedReportCard = service.getById(id);

        if(deletedReportCard.isPresent()){
            service.deleteReportCard(id);

            return ResponseEntity.status(HttpStatus.OK).body("ReportCard successfully deleted!");
        } else throw new RuntimeException("Id not found :( ");
    }
}
