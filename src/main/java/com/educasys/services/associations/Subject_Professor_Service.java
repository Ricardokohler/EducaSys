package com.educasys.services.associations;

import com.educasys.entitites.associations.Subject_Professor;
import com.educasys.repositories.associations.Subject_Professor_Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Subject_Professor_Service {


    //Injeção de dependência
    private final Subject_Professor_Repository repository;

    public Subject_Professor_Service(Subject_Professor_Repository repository) {
        this.repository = repository;
    }


    //create
    public Subject_Professor createSubject_Professor(Subject_Professor subject_Professor){
        return repository.save(subject_Professor);
    }

    //get all
    public Optional <Subject_Professor> getById(Long id){
        return repository.findById(id);
    }

    //getAll
    public List<Subject_Professor> getAll(){
        return repository.findAll();
    }

    //update
    public Subject_Professor updateSubject_Professor(Subject_Professor subject_Professor, Long id){
        Optional <Subject_Professor> oldSubject_Professor = repository.findById(id);

        if(oldSubject_Professor.isPresent()){
            Subject_Professor newSubject_Professor = oldSubject_Professor.get();

            //newSubject_Professor.set...(Subject_Professor.get...);

            return repository.save(newSubject_Professor);
        } else throw new RuntimeException("id not found");

    }

    //delete
    public void deleteSubject_Professor(Long id){
        repository.deleteById(id);
    }

}
