package com.educasys.controllers;

import com.educasys.entitites.Subject;
import com.educasys.services.SubjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Subjects")
public class SubjectController {

    private final SubjectService service;

    public SubjectController(SubjectService service){
        this.service = service;
    }

    @PostMapping("/add")
    public ResponseEntity <String> createSubject(@RequestBody Subject subject){
        Subject createdSubject = service.createSubject(subject);

        if(createdSubject != null){
            return ResponseEntity.status(HttpStatus.CREATED).body("Subject Created");

        } else throw new RuntimeException("Subject not created.");
    }

    @GetMapping("/{id}")
    public ResponseEntity <Optional<Subject>> getSubjectById(@PathVariable Long id){
        Optional <Subject> subject = service.getById(id);

        if(subject.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(subject);
        } else throw new RuntimeException("Id not found");
    }

    @GetMapping("/all")
    public ResponseEntity <List<Subject>> allSubjects(){
        List <Subject> subjectList = service.getAll();

        if(subjectList != null){
            return ResponseEntity.status(HttpStatus.OK).body(subjectList);
        } else throw new RuntimeException("List Empty");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity <Subject> updateSubject(@RequestBody Subject subject, @PathVariable Long id){
       Subject updatedSubject = service.updateSubject(subject, id);

       if(updatedSubject != null){
           return ResponseEntity.status(HttpStatus.OK).body(subject);
       } else throw new RuntimeException("Id not found");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity <String> deleteSubject(@PathVariable Long id){
        Optional <Subject> deletedSubject = service.getById(id);

        if(deletedSubject.isPresent()){
            service.deleteSubject(id);

            return ResponseEntity.status(HttpStatus.OK).body("Subject successfully deleted!");
        } else throw new RuntimeException("Id not found :( ");
    }
}
