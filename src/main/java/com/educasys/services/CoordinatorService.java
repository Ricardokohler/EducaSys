package com.educasys.services;

import com.educasys.entitites.Coordinator;
import com.educasys.repositories.CoordinatorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoordinatorService {


    //Injeção de dependência
    private final CoordinatorRepository repository;

    public CoordinatorService(CoordinatorRepository repository) {
        this.repository = repository;
    }


    //create
    public Coordinator createCoordinator(Coordinator coordinator){
        return repository.save(coordinator);
    }

    //get all
    public Optional <Coordinator> getById(Long id){
        return repository.findById(id);
    }

    //getAll
    public List<Coordinator> getAll(){
        return repository.findAll();
    }

    //update
    public Coordinator updateCoordinator(Coordinator coordinator, Long id){
        Optional <Coordinator> oldCoordinator = repository.findById(id);

        if(oldCoordinator.isPresent()){
            Coordinator newCoordinator = oldCoordinator.get();

            newCoordinator.setName(coordinator.getName());
            newCoordinator.setAddress(coordinator.getAddress());
            newCoordinator.setEmail(coordinator.getEmail());
            newCoordinator.setBirthDate(coordinator.getBirthDate());
            newCoordinator.setPhone(coordinator.getPhone());

            newCoordinator.setCourse(coordinator.getCourse());

            return repository.save(newCoordinator);
        } else throw new RuntimeException("id not found");

    }

    //delete
    public void deleteCoordinator(Long id){
        repository.deleteById(id);
    }

}
