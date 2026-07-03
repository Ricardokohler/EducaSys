package dev.EducaSys.services;

import dev.EducaSys.entities.Professor;
import dev.EducaSys.repositories.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

    private final ProfessorRepository repository;

    public ProfessorService(ProfessorRepository repository){
        this.repository=repository;
    }

    //create
    public Professor create(Professor professor){
        return repository.save(professor);
    }

    //getAll
    public List<Professor> getAll(){
        return repository.findAll();
    }

    //getById
    public Optional<Professor> getById(Long id){
        return repository.findById(id);
    }

    //update
    public Professor updateById(Long id, Professor professor){
        Optional <Professor> oldProfessor = repository.findById(id);

        if (oldProfessor.isPresent()){
            Professor newProfessor = oldProfessor.get();

            newProfessor.setName(professor.getName());
            newProfessor.setPhone(professor.getPhone());
            newProfessor.setAddress(professor.getAddress());
            newProfessor.setEmail(professor.getEmail());
            newProfessor.setCpf(professor.getCpf());

            return repository.save(professor);
        } else {
            throw new RuntimeException("Id not found");
        }
    }

    //delete
    public void deleteById(Long id){
        repository.deleteById(id);
    }

}
