package dev.EducaSys.services;

import dev.EducaSys.entities.Coordinator;
import dev.EducaSys.repositories.CoordinatorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoordinatorService {

    private final CoordinatorRepository repository;

    public CoordinatorService(CoordinatorRepository repository){
        this.repository= repository;
    }

    //create
    public Coordinator create(Coordinator coordinator){
        return repository.save(coordinator);
    }

    //getAll
    public List<Coordinator> getAll(){
        return repository.findAll();
    }

    //getById
    public Optional<Coordinator> getById(Long id){
        return repository.findById(id);
    }

    //update
    public Coordinator updateById(Coordinator coordinator, Long id){
        Optional<Coordinator> oldCoordinator = repository.findById(id);

        if(oldCoordinator.isPresent()){
            Coordinator newCoordinator = oldCoordinator.get();

            newCoordinator.setName(coordinator.getName());
            newCoordinator.setPhone(coordinator.getPhone());
            newCoordinator.setAddress(coordinator.getAddress());
            newCoordinator.setEmail(coordinator.getEmail());
            newCoordinator.setCpf(coordinator.getCpf());

            return repository.save(newCoordinator);

        } else {
            throw new RuntimeException("Id not found");
        }
    }

    //delete
    public void deleteById(Long id){
        repository.deleteById(id);
    }

}
