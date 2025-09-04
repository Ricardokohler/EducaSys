package com.educasys.controllers;

import com.educasys.entitites.Coordinator;
import com.educasys.services.CoordinatorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Coordinators")
public class CoordinatorController {

    private final CoordinatorService service;

    public CoordinatorController(CoordinatorService service){
        this.service = service;
    }

    @PostMapping("/add")
    public ResponseEntity <String> createCoordinator(@RequestBody Coordinator coordinator){
        Coordinator createdCoordinator = service.createCoordinator(coordinator);

        if(createdCoordinator != null){
            return ResponseEntity.status(HttpStatus.CREATED).body("Coordinator Created");

        } else throw new RuntimeException("Coordinator not created.");
    }

    @GetMapping("/{id}")
    public ResponseEntity <Optional<Coordinator>> getCoordinatorById(@PathVariable Long id){
        Optional <Coordinator> coordinator = service.getById(id);

        if(coordinator.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(coordinator);
        } else throw new RuntimeException("Id not found");
    }

    @GetMapping("/all")
    public ResponseEntity <List<Coordinator>> allCoordinators(){
        List <Coordinator> coordinatorList = service.getAll();

        if(coordinatorList != null){
            return ResponseEntity.status(HttpStatus.OK).body(coordinatorList);
        } else throw new RuntimeException("List Empty");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity <Coordinator> updateCoordinator(@RequestBody Coordinator coordinator, @PathVariable Long id){
       Coordinator updatedCoordinator = service.updateCoordinator(coordinator, id);

       if(updatedCoordinator != null){
           return ResponseEntity.status(HttpStatus.OK).body(coordinator);
       } else throw new RuntimeException("Id not found");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity <String> deleteCoordinator(@PathVariable Long id){
        Optional <Coordinator> deletedCoordinator = service.getById(id);

        if(deletedCoordinator.isPresent()){
            service.deleteCoordinator(id);

            return ResponseEntity.status(HttpStatus.OK).body("Coordinator successfully deleted!");
        } else throw new RuntimeException("Id not found :( ");
    }
}
