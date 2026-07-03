package dev.EducaSys.entities.Mappers;

import dev.EducaSys.entities.Dtos.StudentDto;
import dev.EducaSys.entities.Student;

public class StudentMapper {

    public Student map(StudentDto dto){
        Student student = new Student();

        if (dto.getId() != null){
            student.setId(dto.getId());
        }
        student.setName(dto.getPhone());
        student.setCpf(dto.getCpf());
        student.setEmail(dto.getEmail());
        student.setAddress(dto.getAddress());

        return student;
    }

    public StudentDto map(Student student){
        StudentDto dto = new StudentDto();

        dto.setId(student.getId());
        dto.setName(student.getName());
        dto.setCpf(student.getCpf());
        dto.setEmail(student.getEmail());
        dto.setAddress(student.getAddress());

        return dto;
    }

}
