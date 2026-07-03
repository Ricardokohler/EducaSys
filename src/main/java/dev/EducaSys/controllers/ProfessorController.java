package dev.EducaSys.controllers;

import dev.EducaSys.entities.Professor;
import dev.EducaSys.services.ProfessorService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/professors")
public class ProfessorController {

        private final ProfessorService service;

        public ProfessorController(ProfessorService service){
            this.service= service;
        }

        @PostMapping("/add")
        public ResponseEntity<Professor> create(@RequestBody Professor professor){
            Professor createdProfessor = service.create(professor);

            return new ResponseEntity<>(createdProfessor, HttpStatus.CREATED);
        }

        @GetMapping("/all")
        public ResponseEntity<List<Professor>> getAll(){
            List<Professor> professorList = service.getAll();

            return new ResponseEntity<>(professorList, HttpStatus.OK);
        }

        @GetMapping("/{id}")
        public ResponseEntity<?> getById(@PathVariable Long id){
            Optional<Professor> optionalProfessor = service.getById(id);

            if(optionalProfessor.isPresent()){
                return new ResponseEntity<>(optionalProfessor, HttpStatus.OK);
            } else{
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not found!");
            }
        }

        @PutMapping("/update/{id}")
        public ResponseEntity<?> updateProfessor(@PathVariable Long id, @RequestBody Professor professor){

            try {
                Professor updatedProfessor = service.updateById(id, professor);

                return new ResponseEntity<>(updatedProfessor, HttpStatus.OK);

            } catch (RuntimeException e) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not found");
            }
        }

        @DeleteMapping("/delete/{id}")
        public ResponseEntity<String> deleteProfessor(@PathVariable Long id){
            Optional<Professor> deletedProfessor = service.getById(id);

            if (deletedProfessor.isPresent()){
                return ResponseEntity.status(HttpStatus.OK).body("Professor deleted");

            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not found");
            }
        }

}
