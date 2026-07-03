package dev.EducaSys.entities.Mappers;

import dev.EducaSys.entities.Dtos.Group_NameDto;
import dev.EducaSys.entities.Group_Name;

public class Group_NameMapper {

    public Group_NameDto map(Group_Name group_Name){
        Group_NameDto dto = new Group_NameDto();

        dto.setId(group_Name.getId());
        dto.setName(group_Name.getName());
        dto.setCnpj(group_Name.getCnpj());
        dto.setDescription(group_Name.getDescription());
        dto.setInstitutionList(group_Name.getInstitutionList());

        return dto;
    }

    public Group_Name map(Group_NameDto dto){
        Group_Name group_name = new Group_Name();

        if(dto.getId() != null){
            group_name.setId(dto.getId());
        }
        group_name.setName(dto.getName());
        group_name.setCnpj(dto.getCnpj());
        group_name.setDescription(dto.getDescription());
        group_name.setInstitutionList(dto.getInstitutionList());

        return group_name;
    }

}
