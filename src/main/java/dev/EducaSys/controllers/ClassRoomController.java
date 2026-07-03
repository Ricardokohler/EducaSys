package dev.EducaSys.controllers;

import dev.EducaSys.entities.ClassRoom;
import dev.EducaSys.services.ClassRoomService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/ClassRooms")
public class ClassRoomController {

        private final ClassRoomService service;

        public ClassRoomController(ClassRoomService service){
            this.service= service;
        }

        @PostMapping("/add")
        public ResponseEntity<ClassRoom> create(@RequestBody ClassRoom ClassRoom){
            ClassRoom createdClassRoom = service.create(ClassRoom);

            return new ResponseEntity<>(createdClassRoom, HttpStatus.CREATED);
        }

        @GetMapping("/all")
        public ResponseEntity<List<ClassRoom>> getAll(){
            List<ClassRoom> ClassRoomList = service.getAll();

            return new ResponseEntity<>(ClassRoomList, HttpStatus.OK);
        }

        @GetMapping("/{id}")
        public ResponseEntity<?> getById(@PathVariable Long id){
            Optional<ClassRoom> optionalClassRoom = service.getById(id);

            if(optionalClassRoom.isPresent()){
                return new ResponseEntity<>(optionalClassRoom, HttpStatus.OK);
            } else{
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not found!");
            }
        }

        @PutMapping("/update/{id}")
        public ResponseEntity<?> updateClassRoom(@PathVariable Long id, @RequestBody ClassRoom ClassRoom){

            try {
                ClassRoom updatedClassRoom = service.updateById(ClassRoom, id);

                return new ResponseEntity<>(updatedClassRoom, HttpStatus.OK);

            } catch (RuntimeException e) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not found");
            }
        }

        @DeleteMapping("/delete/{id}")
        public ResponseEntity<String> deleteClassRoom(@PathVariable Long id){
            Optional<ClassRoom> deletedClassRoom = service.getById(id);

            if (deletedClassRoom.isPresent()){
                return ResponseEntity.status(HttpStatus.OK).body("ClassRoom deleted");

            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not found");
            }
        }

}
