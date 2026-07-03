package dev.EducaSys.controllers;

import dev.EducaSys.entities.Coordinator;
import dev.EducaSys.services.CoordinatorService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/Coordinators")
public class CoordinatorController {

        private final CoordinatorService service;

        public CoordinatorController(CoordinatorService service){
            this.service= service;
        }

        @PostMapping("/add")
        public ResponseEntity<Coordinator> create(@RequestBody Coordinator coordinator){
            Coordinator createdCoordinator = service.create(coordinator);

            return new ResponseEntity<>(createdCoordinator, HttpStatus.CREATED);
        }

        @GetMapping("/all")
        public ResponseEntity<List<Coordinator>> getAll(){
            List<Coordinator> CoordinatorList = service.getAll();

            return new ResponseEntity<>(CoordinatorList, HttpStatus.OK);
        }

        @GetMapping("/{id}")
        public ResponseEntity<?> getById(@PathVariable Long id){
            Optional<Coordinator> optionalCoordinator = service.getById(id);

            if(optionalCoordinator.isPresent()){
                return new ResponseEntity<>(optionalCoordinator, HttpStatus.OK);
            } else{
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not found!");
            }
        }

        @PutMapping("/update/{id}")
        public ResponseEntity<?> updateCoordinator(@PathVariable Long id, @RequestBody Coordinator coordinator){

            try {
                Coordinator updatedCoordinator = service.updateById(coordinator, id);

                return new ResponseEntity<>(updatedCoordinator, HttpStatus.OK);

            } catch (RuntimeException e) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not found");
            }
        }

        @DeleteMapping("/delete/{id}")
        public ResponseEntity<String> deleteCoordinator(@PathVariable Long id){
            Optional<Coordinator> deletedCoordinator = service.getById(id);

            if (deletedCoordinator.isPresent()){
                return ResponseEntity.status(HttpStatus.OK).body("Coordinator deleted");

            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not found");
            }
        }

}
