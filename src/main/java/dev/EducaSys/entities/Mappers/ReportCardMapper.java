package dev.EducaSys.entities.Mappers;

import dev.EducaSys.entities.Dtos.ReportCardDto;
import dev.EducaSys.entities.ReportCard;

public class ReportCardMapper {

    public ReportCard map(ReportCardDto dto) {
        ReportCard reportCard = new ReportCard();

        if (dto.getId() != null) {
            reportCard.setId(dto.getId());
        }
        reportCard.setStudent(dto.getStudent());
        reportCard.setClassRoom(dto.getClassRoom());
        reportCard.setSubjectAverageList(dto.getSubjectAverageList());

        return reportCard;
    }

    public ReportCardDto map(ReportCard reportCard){
        ReportCardDto dto = new ReportCardDto();

        dto.setId(reportCard.getId());
        dto.setStudent(reportCard.getStudent());
        dto.setClassRoom(reportCard.getClassRoom());
        dto.setSubjectAverageList(reportCard.getSubjectAverageList());

        return dto;
    }
}
