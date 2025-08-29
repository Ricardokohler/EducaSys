package com.educasys.controllers;

import com.educasys.entitites.Student;
import com.educasys.services.StudentService;
import org.springframework.data.web.ReactiveOffsetScrollPositionHandlerMethodArgumentResolver;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service){
        this.service = service;
    }

    @PostMapping("/add")
    public ResponseEntity <String> createStudent(@RequestBody Student student){
        Student createdStudent = service.createStudent(student);

        if(createdStudent != null){
            return ResponseEntity.status(HttpStatus.CREATED).body("Student Created");

        } else throw new RuntimeException("Student not created.");
    }

    @GetMapping("/{id}")
    public ResponseEntity <Optional<Student>> getStudentById(@PathVariable Long id){
        Optional <Student> student = service.getById(id);

        if(student.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(student);
        } else throw new RuntimeException("Id not found");
    }

    @GetMapping("/all")
    public ResponseEntity <List<Student>> allStudents(){
        List <Student> studentList = service.getAll();

        if(studentList != null){
            return ResponseEntity.status(HttpStatus.OK).body(studentList);
        } else throw new RuntimeException("List Empty");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity <Student> updateStudent(@RequestBody Student student, @PathVariable Long id){
       Student updatedStudent = service.updateStudent(student, id);

       if(updatedStudent != null){
           return ResponseEntity.status(HttpStatus.OK).body(student);
       } else throw new RuntimeException("Id not found");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity <String> deleteStudent(@PathVariable Long id){
        Optional <Student> deletedStudent = service.getById(id);

        if(deletedStudent.isPresent()){
            service.deleteStudent(id);

            return ResponseEntity.status(HttpStatus.OK).body("Student successfully deleted!");
        } else throw new RuntimeException("Id not found :( ");
    }
}
