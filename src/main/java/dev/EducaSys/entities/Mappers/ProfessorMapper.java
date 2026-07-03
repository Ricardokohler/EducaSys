package dev.EducaSys.entities.Mappers;

import dev.EducaSys.entities.Dtos.ProfessorDto;
import dev.EducaSys.entities.Professor;

public class ProfessorMapper {

    public Professor map(ProfessorDto dto){
        Professor professor = new Professor();

        if (dto.getId() != null){
            professor.setId(dto.getId());
        }
        professor.setName(dto.getPhone());
        professor.setCpf(dto.getCpf());
        professor.setEmail(dto.getEmail());
        professor.setAddress(dto.getAddress());

        professor.setSalary(dto.getSalary());

        return professor;
    }

    public ProfessorDto map(Professor professor){
        ProfessorDto dto = new ProfessorDto();

        dto.setId(professor.getId());
        dto.setName(professor.getName());
        dto.setCpf(professor.getCpf());
        dto.setEmail(professor.getEmail());
        dto.setAddress(professor.getAddress());

        dto.setSalary(professor.getSalary());

        return dto;
    }

}
