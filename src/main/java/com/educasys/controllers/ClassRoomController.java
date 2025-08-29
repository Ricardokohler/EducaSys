package com.educasys.controllers;

import com.educasys.entitites.ClassRoom;
import com.educasys.services.ClassRoomService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ClassRooms")
public class ClassRoomController {

    private final ClassRoomService service;

    public ClassRoomController(ClassRoomService service){
        this.service = service;
    }

    @PostMapping("/add")
    public ResponseEntity <String> createClassRoom(@RequestBody ClassRoom classRoom){
        ClassRoom createdClassRoom = service.createClassRoom(classRoom);

        if(createdClassRoom != null){
            return ResponseEntity.status(HttpStatus.CREATED).body("ClassRoom Created");

        } else throw new RuntimeException("ClassRoom not created.");
    }

    @GetMapping("/{id}")
    public ResponseEntity <Optional<ClassRoom>> getClassRoomById(@PathVariable Long id){
        Optional <ClassRoom> classRoom = service.getById(id);

        if(classRoom.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(classRoom);
        } else throw new RuntimeException("Id not found");
    }

    @GetMapping("/all")
    public ResponseEntity <List<ClassRoom>> allClassRooms(){
        List <ClassRoom> classRoomList = service.getAll();

        if(classRoomList != null){
            return ResponseEntity.status(HttpStatus.OK).body(classRoomList);
        } else throw new RuntimeException("List Empty");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity <ClassRoom> updateClassRoom(@RequestBody ClassRoom classRoom, @PathVariable Long id){
       ClassRoom updatedClassRoom = service.updateClassRoom(classRoom, id);

       if(updatedClassRoom != null){
           return ResponseEntity.status(HttpStatus.OK).body(classRoom);
       } else throw new RuntimeException("Id not found");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity <String> deleteClassRoom(@PathVariable Long id){
        Optional <ClassRoom> deletedClassRoom = service.getById(id);

        if(deletedClassRoom.isPresent()){
            service.deleteClassRoom(id);

            return ResponseEntity.status(HttpStatus.OK).body("ClassRoom successfully deleted!");
        } else throw new RuntimeException("Id not found :( ");
    }
}
