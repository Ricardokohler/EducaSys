package com.educasys.services;

import com.educasys.entitites.Student;
import com.educasys.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {


    //Injeção de dependência
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }


    //create
    public Student createStudent(Student student){
        return repository.save(student);
    }

    //get all
    public Optional <Student> getById(Long id){
        return repository.findById(id);
    }

    //getAll
    public List<Student> getAll(){
        return repository.findAll();
    }

    //update
    public Student updateStudent(Student student, Long id){
        Optional <Student> oldStudent = repository.findById(id);

        if(oldStudent.isPresent()){
            Student newStudent = oldStudent.get();



            return repository.save(newStudent);
        } else throw new RuntimeException("id not found");

    }

    //delete
    public void deleteStudent(Long id){
        repository.deleteById(id);
    }

}
