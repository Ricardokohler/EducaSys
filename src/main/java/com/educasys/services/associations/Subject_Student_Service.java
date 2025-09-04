package com.educasys.services.associations;

import com.educasys.entitites.associations.Subject_Student;
import com.educasys.repositories.associations.Subject_Student_Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Subject_Student_Service {


    //Injeção de dependência
    private final Subject_Student_Repository repository;

    public Subject_Student_Service(Subject_Student_Repository repository) {
        this.repository = repository;
    }


    //create
    public Subject_Student createSubject_Student(Subject_Student subject_Student){
        return repository.save(subject_Student);
    }

    //get all
    public Optional <Subject_Student> getById(Long id){
        return repository.findById(id);
    }

    //getAll
    public List<Subject_Student> getAll(){
        return repository.findAll();
    }

    //update
    public Subject_Student updateSubject_Student(Subject_Student subject_Student, Long id){
        Optional <Subject_Student> oldSubject_Student = repository.findById(id);

        if(oldSubject_Student.isPresent()){
            Subject_Student newSubject_Student = oldSubject_Student.get();

            newSubject_Student.setStudent(subject_Student.getStudent());
            newSubject_Student.setSubject(subject_Student.getSubject());

            return repository.save(newSubject_Student);
        } else throw new RuntimeException("id not found");

    }

    //delete
    public void deleteSubject_Student(Long id){
        repository.deleteById(id);
    }

}
