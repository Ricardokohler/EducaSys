package dev.EducaSys.services;

import dev.EducaSys.entities.ClassRoom;
import dev.EducaSys.repositories.ClassRoomRepository;
import dev.EducaSys.repositories.ClassRoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassRoomService {

    private final ClassRoomRepository repository;

    public ClassRoomService(ClassRoomRepository repository){
        this.repository= repository;
    }

    //create
    public ClassRoom create(ClassRoom classRoom){
        return repository.save(classRoom);
    }

    //getAll
    public List<ClassRoom> getAll(){
        return repository.findAll();
    }

    //getById
    public Optional<ClassRoom> getById(Long id){
        return repository.findById(id);
    }

    //update
    public ClassRoom updateById(ClassRoom classRoom, Long id){
        Optional<ClassRoom> oldClassRoom = repository.findById(id);

        if(oldClassRoom.isPresent()){
            ClassRoom newClassRoom = oldClassRoom.get();

            newClassRoom.setLetter(classRoom.getLetter());
            newClassRoom.setShift(classRoom.getShift());
            newClassRoom.setStudentsNumber(classRoom.getStudentsNumber());

            return repository.save(newClassRoom);

        } else {
            throw new RuntimeException("Id not found");
        }
    }

    //delete
    public void deleteById(Long id){
        repository.deleteById(id);
    }

}
