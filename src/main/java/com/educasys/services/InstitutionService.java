package com.educasys.services;

import com.educasys.entitites.Institution;
import com.educasys.repositories.InstitutionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstitutionService {


    //Injeção de dependência
    private final InstitutionRepository repository;

    public InstitutionService(InstitutionRepository repository) {
        this.repository = repository;
    }


    //create
    public Institution createInstitution(Institution institution){
        return repository.save(institution);
    }

    //get all
    public Optional <Institution> getById(Long id){
        return repository.findById(id);
    }

    //getAll
    public List<Institution> getAll(){
        return repository.findAll();
    }

    //update
    public Institution updateInstitution(Institution institution, Long id){
        Optional <Institution> oldInstitution = repository.findById(id);

        if(oldInstitution.isPresent()){
            Institution newInstitution = oldInstitution.get();

            newInstitution.setName(institution.getName());
            newInstitution.setDescription(institution.getDescription());
            newInstitution.setCourses(institution.getCourses());

            return repository.save(newInstitution);
        } else throw new RuntimeException("id not found");

    }

    //delete
    public void deleteInstitution(Long id){
        repository.deleteById(id);
    }

}
