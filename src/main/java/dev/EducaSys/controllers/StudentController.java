package dev.EducaSys.controllers;

import dev.EducaSys.entities.Student;
import dev.EducaSys.services.StudentService;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service){
        this.service= service;
    }

    //create
    @PostMapping("/add")
    public ResponseEntity<Student> create(@RequestBody Student student) {
        Student createdStudent = service.create(student);

        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    //getAll
    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAll(){
        List <Student> studentList = service.getAll();

        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }

    //getById
    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
        Optional<Student> optionalStudent = service.getById(id);

        if(optionalStudent.isPresent()) {
            return new ResponseEntity<>(optionalStudent, HttpStatus.OK);
        } else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not found");
        }
    }

    //update
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateById(@PathVariable Long id, @RequestBody Student student){
        try {
            Student updatedStudent = service.updateById(student, id);

            return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
        } catch(RuntimeException e){
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not found");
        }
    }

    //delete
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        Optional<Student> deletedStudent = service.getById(id);

        if (deletedStudent.isPresent()){
            service.deleteById(id);

            return ResponseEntity.status(HttpStatus.OK).body("Student deleted with success");
        } else {
             return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Id not found");
        }
    }
}
