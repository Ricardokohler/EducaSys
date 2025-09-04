package com.educasys.services;

import com.educasys.entitites.Course;
import com.educasys.repositories.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {


    //Injeção de dependência
    private final CourseRepository repository;

    public CourseService(CourseRepository repository) {
        this.repository = repository;
    }


    //create
    public Course createCourse(Course course){
        return repository.save(course);
    }

    //get all
    public Optional <Course> getById(Long id){
        return repository.findById(id);
    }

    //getAll
    public List<Course> getAll(){
        return repository.findAll();
    }

    //update
    public Course updateCourse(Course course, Long id){
        Optional <Course> oldCourse = repository.findById(id);

        if(oldCourse.isPresent()){
            Course newCourse = oldCourse.get();



            return repository.save(newCourse);
        } else throw new RuntimeException("id not found");

    }

    //delete
    public void deleteCourse(Long id){
        repository.deleteById(id);
    }

}
