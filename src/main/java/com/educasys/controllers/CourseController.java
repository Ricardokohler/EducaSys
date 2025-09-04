package com.educasys.controllers;

import com.educasys.entitites.Course;
import com.educasys.services.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Courses")
public class CourseController {

    private final CourseService service;

    public CourseController(CourseService service){
        this.service = service;
    }

    @PostMapping("/add")
    public ResponseEntity <String> createCourse(@RequestBody Course course){
        Course createdCourse = service.createCourse(course);

        if(createdCourse != null){
            return ResponseEntity.status(HttpStatus.CREATED).body("Course Created");

        } else throw new RuntimeException("Course not created.");
    }

    @GetMapping("/{id}")
    public ResponseEntity <Optional<Course>> getCourseById(@PathVariable Long id){
        Optional <Course> course = service.getById(id);

        if(course.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(course);
        } else throw new RuntimeException("Id not found");
    }

    @GetMapping("/all")
    public ResponseEntity <List<Course>> allCourses(){
        List <Course> courseList = service.getAll();

        if(courseList != null){
            return ResponseEntity.status(HttpStatus.OK).body(courseList);
        } else throw new RuntimeException("List Empty");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity <Course> updateCourse(@RequestBody Course course, @PathVariable Long id){
       Course updatedCourse = service.updateCourse(course, id);

       if(updatedCourse != null){
           return ResponseEntity.status(HttpStatus.OK).body(course);
       } else throw new RuntimeException("Id not found");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity <String> deleteCourse(@PathVariable Long id){
        Optional <Course> deletedCourse = service.getById(id);

        if(deletedCourse.isPresent()){
            service.deleteCourse(id);

            return ResponseEntity.status(HttpStatus.OK).body("Course successfully deleted!");
        } else throw new RuntimeException("Id not found :( ");
    }
}
