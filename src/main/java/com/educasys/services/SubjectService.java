package com.educasys.services;

import com.educasys.entitites.Subject;
import com.educasys.entitites.Subject;
import com.educasys.repositories.SubjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {


    //Injeção de dependência
    private final SubjectRepository repository;

    
    public SubjectService(SubjectRepository repository) {
        this.repository = repository;
    }

    
    //create
    public Subject createSubject(Subject Subject){
        return repository.save(Subject);
    }

    //get all
    public Optional <Subject> getById(Long id){
        return repository.findById(id);
    }

    //getAll
    public List<Subject> getAll(){
        return repository.findAll();
    }

    //update
    public Subject updateSubject(Subject Subject, Long id){
        Optional <Subject> oldSubject = repository.findById(id);

        if(oldSubject.isPresent()){
            Subject newSubject = oldSubject.get();



            return repository.save(newSubject);
        } else throw new RuntimeException("id not found");

    }

    //delete
    public void deleteSubject(Long id){
        repository.deleteById(id);
    }

}
