package com.educasys.controllers;

import com.educasys.entitites.SubjectAverage;
import com.educasys.services.SubjectAverageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/SubjectAverages")
public class SubjectAverageController {

    private final SubjectAverageService service;

    public SubjectAverageController(SubjectAverageService service){
        this.service = service;
    }

    @PostMapping("/add")
    public ResponseEntity <String> createSubjectAverage(@RequestBody SubjectAverage subjectAverage){
        SubjectAverage createdSubjectAverage = service.createSubjectAverage(subjectAverage);

        if(createdSubjectAverage != null){
            return ResponseEntity.status(HttpStatus.CREATED).body("SubjectAverage Created");

        } else throw new RuntimeException("SubjectAverage not created.");
    }

    @GetMapping("/{id}")
    public ResponseEntity <Optional<SubjectAverage>> getSubjectAverageById(@PathVariable Long id){
        Optional <SubjectAverage> subjectAverage = service.getById(id);

        if(subjectAverage.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(subjectAverage);
        } else throw new RuntimeException("Id not found");
    }

    @GetMapping("/all")
    public ResponseEntity <List<SubjectAverage>> allSubjectAverages(){
        List <SubjectAverage> subjectAverageList = service.getAll();

        if(subjectAverageList != null){
            return ResponseEntity.status(HttpStatus.OK).body(subjectAverageList);
        } else throw new RuntimeException("List Empty");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity <SubjectAverage> updateSubjectAverage(@RequestBody SubjectAverage SubjectAverage, @PathVariable Long id){
       SubjectAverage updatedSubjectAverage = service.updateSubjectAverage(SubjectAverage, id);

       if(updatedSubjectAverage != null){
           return ResponseEntity.status(HttpStatus.OK).body(SubjectAverage);
       } else throw new RuntimeException("Id not found");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity <String> deleteSubjectAverage(@PathVariable Long id){
        Optional <SubjectAverage> deletedSubjectAverage = service.getById(id);

        if(deletedSubjectAverage.isPresent()){
            service.deleteSubjectAverage(id);

            return ResponseEntity.status(HttpStatus.OK).body("SubjectAverage successfully deleted!");
        } else throw new RuntimeException("Id not found :( ");
    }
}
