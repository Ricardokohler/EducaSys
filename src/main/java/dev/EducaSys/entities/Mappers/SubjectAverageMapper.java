package dev.EducaSys.entities.Mappers;

import dev.EducaSys.entities.Dtos.SubjectAverageDto;
import dev.EducaSys.entities.SubjectAverage;

public class SubjectAverageMapper {

    private SubjectAverage map(SubjectAverageDto dto){
        SubjectAverage subjectAverage = new SubjectAverage();

        if(dto.getId() != null){
            subjectAverage.setId(dto.getId());
        }
        subjectAverage.setNote1(dto.getNote1());
        subjectAverage.setNote2(dto.getNote2());
        subjectAverage.setNote3(dto.getNote3());
        subjectAverage.setFinalGrade(dto.getFinalGrade());;
        subjectAverage.setSubject(dto.getSubject());
        subjectAverage.setReportCard(dto.getReportCard());

        return subjectAverage;
    }

    private SubjectAverageDto map(SubjectAverage subjectAverage){
        SubjectAverageDto dto = new SubjectAverageDto();

        dto.setId(subjectAverage.getId());
        dto.setNote1(subjectAverage.getNote1());
        dto.setNote2(subjectAverage.getNote2());
        dto.setNote3(subjectAverage.getNote3());
        dto.setFinalGrade(subjectAverage.getFinalGrade());;
        dto.setSubject(subjectAverage.getSubject());
        dto.setReportCard(subjectAverage.getReportCard());

        return dto;
    }
}
