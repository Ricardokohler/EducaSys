package dev.EducaSys.services;

import dev.EducaSys.entities.Student;
import dev.EducaSys.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository){
        this.repository= repository;
    }

    //create
    public Student create(Student student){
        return repository.save(student);
    }

    //getAll
    public List<Student> getAll(){
        return repository.findAll();
    }

    //getById
    public Optional<Student> getById(Long id){
        return repository.findById(id);
    }

    //update
    public Student updateById(Student student, Long id){
        Optional<Student> oldStudent = repository.findById(id);

        if(oldStudent.isPresent()){
            Student newStudent = oldStudent.get();

            newStudent.setName(student.getName());
            newStudent.setPhone(newStudent.getPhone());
            newStudent.setAddress(student.getAddress());
            newStudent.setEmail(newStudent.getEmail());
            newStudent.setCpf(newStudent.getCpf());

            return repository.save(newStudent);

        } else {
            throw new RuntimeException("Id not found");
        }
    }

    //delete
    public void deleteById(Long id){
        repository.deleteById(id);
    }

}
