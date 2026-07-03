package dev.EducaSys.entities.Mappers;

import dev.EducaSys.entities.Dtos.InstitutionDto;
import dev.EducaSys.entities.Institution;

public class InstitutionMapper {

    public Institution map(InstitutionDto dto){
        Institution institution = new Institution();

        if(dto.getId() != null ){
            institution.setId(dto.getId());
        }
        institution.setName(dto.getName());
        institution.setEducationLevel(dto.getEducationLevel());
        institution.setDescription(dto.getDescription());
        institution.setGroupName(dto.getGroup_name());

        return institution;
    }

    public InstitutionDto map(Institution institution){
        InstitutionDto dto = new InstitutionDto();

        dto.setId(institution.getId());
        dto.setName(institution.getName());
        dto.setEducationLevel(institution.getEducationLevel());
        dto.setDescription(institution.getDescription());
        dto.setGroup_name(institution.getGroupName());

        return dto;
    }

}
