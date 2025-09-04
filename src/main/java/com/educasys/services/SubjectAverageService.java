package com.educasys.services;

import com.educasys.entitites.SubjectAverage;
import com.educasys.repositories.SubjectAverageRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectAverageService {


    //Injeção de dependência
    private final SubjectAverageRepository repository;

    public SubjectAverageService(SubjectAverageRepository repository) {
        this.repository = repository;
    }


    //create
    public SubjectAverage createSubjectAverage(SubjectAverage SubjectAverage){
        return repository.save(SubjectAverage);
    }

    //get all
    public Optional <SubjectAverage> getById(Long id){
        return repository.findById(id);
    }

    //getAll
    public List<SubjectAverage> getAll(){
        return repository.findAll();
    }

    //update
    public SubjectAverage updateSubjectAverage(SubjectAverage SubjectAverage, Long id){
        Optional <SubjectAverage> oldSubjectAverage = repository.findById(id);

        if(oldSubjectAverage.isPresent()){
            SubjectAverage newSubjectAverage = oldSubjectAverage.get();



            return repository.save(newSubjectAverage);
        } else throw new RuntimeException("id not found");

    }

    //delete
    public void deleteSubjectAverage(Long id){
        repository.deleteById(id);
    }

}
