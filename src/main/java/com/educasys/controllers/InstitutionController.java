package com.educasys.controllers;

import com.educasys.entitites.Institution;
import com.educasys.services.InstitutionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Institutions")
public class InstitutionController {

    private final InstitutionService service;

    public InstitutionController(InstitutionService service){
        this.service = service;
    }

    @PostMapping("/add")
    public ResponseEntity <String> createInstitution(@RequestBody Institution institution){
        Institution createdInstitution = service.createInstitution(institution);

        if(createdInstitution != null){
            return ResponseEntity.status(HttpStatus.CREATED).body("Institution Created");

        } else throw new RuntimeException("Institution not created.");
    }

    @GetMapping("/{id}")
    public ResponseEntity <Optional<Institution>> getInstitutionById(@PathVariable Long id){
        Optional <Institution> institution = service.getById(id);

        if(institution.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(institution);
        } else throw new RuntimeException("Id not found");
    }

    @GetMapping("/all")
    public ResponseEntity <List<Institution>> allInstitutions(){
        List <Institution> institutionList = service.getAll();

        if(institutionList != null){
            return ResponseEntity.status(HttpStatus.OK).body(institutionList);
        } else throw new RuntimeException("List Empty");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity <Institution> updateInstitution(@RequestBody Institution institution, @PathVariable Long id){
       Institution updatedInstitution = service.updateInstitution(institution, id);

       if(updatedInstitution != null){
           return ResponseEntity.status(HttpStatus.OK).body(institution);
       } else throw new RuntimeException("Id not found");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity <String> deleteInstitution(@PathVariable Long id){
        Optional <Institution> deletedInstitution = service.getById(id);

        if(deletedInstitution.isPresent()){
            service.deleteInstitution(id);

            return ResponseEntity.status(HttpStatus.OK).body("Institution successfully deleted!");
        } else throw new RuntimeException("Id not found :( ");
    }
}
