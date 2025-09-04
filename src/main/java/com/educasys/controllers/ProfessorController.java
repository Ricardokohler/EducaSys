package com.educasys.controllers;

import com.educasys.entitites.Professor;
import com.educasys.services.ProfessorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Professors")
public class ProfessorController {

    private final ProfessorService service;

    public ProfessorController(ProfessorService service){
        this.service = service;
    }

    @PostMapping("/add")
    public ResponseEntity <String> createProfessor(@RequestBody Professor professor){
        Professor createdProfessor = service.createProfessor(professor);

        if(createdProfessor != null){
            return ResponseEntity.status(HttpStatus.CREATED).body("Professor Created");

        } else throw new RuntimeException("Professor not created.");
    }

    @GetMapping("/{id}")
    public ResponseEntity <Optional<Professor>> getProfessorById(@PathVariable Long id){
        Optional <Professor> professor = service.getById(id);

        if(professor.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(professor);
        } else throw new RuntimeException("Id not found");
    }

    @GetMapping("/all")
    public ResponseEntity <List<Professor>> allProfessors(){
        List <Professor> professorList = service.getAll();

        if(professorList != null){
            return ResponseEntity.status(HttpStatus.OK).body(professorList);
        } else throw new RuntimeException("List Empty");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity <Professor> updateProfessor(@RequestBody Professor professor, @PathVariable Long id){
       Professor updatedProfessor = service.updateProfessor(professor, id);

       if(updatedProfessor != null){
           return ResponseEntity.status(HttpStatus.OK).body(professor);
       } else throw new RuntimeException("Id not found");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity <String> deleteProfessor(@PathVariable Long id){
        Optional <Professor> deletedProfessor = service.getById(id);

        if(deletedProfessor.isPresent()){
            service.deleteProfessor(id);

            return ResponseEntity.status(HttpStatus.OK).body("Professor successfully deleted!");
        } else throw new RuntimeException("Id not found :( ");
    }
}
