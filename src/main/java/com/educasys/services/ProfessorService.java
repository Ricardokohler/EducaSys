package com.educasys.services;

import com.educasys.entitites.Professor;
import com.educasys.repositories.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {


    //Injeção de dependência
    private final ProfessorRepository repository;

    public ProfessorService(ProfessorRepository repository) {
        this.repository = repository;
    }


    //create
    public Professor createProfessor(Professor professor){
        return repository.save(professor);
    }

    //get all
    public Optional <Professor> getById(Long id){
        return repository.findById(id);
    }

    //getAll
    public List<Professor> getAll(){
        return repository.findAll();
    }

    //update
    public Professor updateProfessor(Professor professor, Long id){
        Optional <Professor> oldProfessor = repository.findById(id);

        if(oldProfessor.isPresent()){
            Professor newProfessor = oldProfessor.get();

            newProfessor.setName(professor.getName());
            newProfessor.setEmail(professor.getEmail());
            newProfessor.setAddress(professor.getAddress());
            newProfessor.setBirthDate(professor.getBirthDate());
            newProfessor.setPhone(professor.getPhone());

            newProfessor.setSubjects(professor.getSubjects());

            return repository.save(newProfessor);
        } else throw new RuntimeException("id not found");

    }

    //delete
    public void deleteProfessor(Long id){
        repository.deleteById(id);
    }

}
