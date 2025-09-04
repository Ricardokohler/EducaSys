package com.educasys.services.associations;

import com.educasys.entitites.associations.Subject_Course;
import com.educasys.repositories.associations.Subject_Course_Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Subject_Course_Service {


    //Injeção de dependência
    private final Subject_Course_Repository repository;

    public Subject_Course_Service(Subject_Course_Repository repository) {
        this.repository = repository;
    }


    //create
    public Subject_Course createSubject_Course(Subject_Course subject_Course){
        return repository.save(subject_Course);
    }

    //get all
    public Optional <Subject_Course> getById(Long id){
        return repository.findById(id);
    }

    //getAll
    public List<Subject_Course> getAll(){
        return repository.findAll();
    }

    //update
    public Subject_Course updateSubject_Course(Subject_Course subject_Course, Long id){
        Optional <Subject_Course> oldSubject_Course = repository.findById(id);

        if(oldSubject_Course.isPresent()){
            Subject_Course newSubject_Course = oldSubject_Course.get();

            newSubject_Course.setCourse(subject_Course.getCourse());
            newSubject_Course.setSubject(subject_Course.getSubject());

            return repository.save(newSubject_Course);
        } else throw new RuntimeException("id not found");

    }

    //delete
    public void deleteSubject_Course(Long id){
        repository.deleteById(id);
    }

}
