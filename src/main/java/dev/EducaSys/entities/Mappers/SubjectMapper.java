package dev.EducaSys.entities.Mappers;

import dev.EducaSys.entities.Dtos.SubjectDto;
import dev.EducaSys.entities.Subject;

public class SubjectMapper {

    public Subject map(SubjectDto dto){
        Subject subject = new Subject();

        if(dto.getId() != null){
            subject.setId(dto.getId());
        }

        subject.setName(dto.getName());
        subject.setTotalHours(dto.getTotalHours());
        subject.setSubjectAverageList(dto.getSubjectAverageList());
        subject.setProfessorSet(dto.getProfessorSet());
        subject.setCourseSet(dto.getCourseSet());

        return subject;
    }

    public SubjectDto map(Subject subject){
        SubjectDto dto = new SubjectDto();

        dto.setId(subject.getId());
        dto.setTotalHours(subject.getTotalHours());
        dto.setSubjectAverageList(subject.getSubjectAverageList());
        dto.setProfessorSet(subject.getProfessorSet());
        dto.setCourseSet(subject.getCourseSet());

        return dto;
    }

}
