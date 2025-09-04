package com.educasys.services.associations;

import com.educasys.entitites.associations.ClassRoom_Student;
import com.educasys.repositories.associations.ClassRoom_Student_Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassRoom_Student_Service {


    //Injeção de dependência
    private final ClassRoom_Student_Repository repository;

    public ClassRoom_Student_Service(ClassRoom_Student_Repository repository) {
        this.repository = repository;
    }


    //create
    public ClassRoom_Student createClassRoom_Student(ClassRoom_Student ClassRoom_Student){
        return repository.save(ClassRoom_Student);
    }

    //get all
    public Optional <ClassRoom_Student> getById(Long id){
        return repository.findById(id);
    }

    //getAll
    public List<ClassRoom_Student> getAll(){
        return repository.findAll();
    }

    //update
    public ClassRoom_Student updateClassRoom_Student(ClassRoom_Student ClassRoom_Student, Long id){
        Optional <ClassRoom_Student> oldClassRoom_Student = repository.findById(id);

        if(oldClassRoom_Student.isPresent()){
            ClassRoom_Student newClassRoom_Student = oldClassRoom_Student.get();

            //newClassRoom_Student.set...(ClassRoom_Student.get...);

            return repository.save(newClassRoom_Student);
        } else throw new RuntimeException("id not found");

    }

    //delete
    public void deleteClassRoom_Student(Long id){
        repository.deleteById(id);
    }

}
