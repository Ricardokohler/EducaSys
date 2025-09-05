package com.educasys.services;

import com.educasys.entitites.ClassRoom;
import com.educasys.repositories.ClassRoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassRoomService {


    //Injeção de dependência
    private final ClassRoomRepository repository;

    public ClassRoomService(ClassRoomRepository repository) {
        this.repository = repository;
    }


    //create
    public ClassRoom createClassRoom(ClassRoom classRoom){
        return repository.save(classRoom);
    }

    //get all
    public Optional <ClassRoom> getById(Long id){
        return repository.findById(id);
    }

    //getAll
    public List<ClassRoom> getAll(){
        return repository.findAll();
    }

    //update
    public ClassRoom updateClassRoom(ClassRoom classRoom, Long id){
        Optional <ClassRoom> oldClassRoom = repository.findById(id);

        if(oldClassRoom.isPresent()){
            ClassRoom newClassRoom = oldClassRoom.get();

            newClassRoom.setShift(classRoom.getShift());
            newClassRoom.setLeter(classRoom.getLeter());
            newClassRoom.setStudents(classRoom.getStudents());
            newClassRoom.setSemester(classRoom.getSemester());
            newClassRoom.setCourse(classRoom.getCourse());

            return repository.save(newClassRoom);
        } else throw new RuntimeException("id not found");

    }

    //delete
    public void deleteClassRoom(Long id){
        repository.deleteById(id);
    }

}
