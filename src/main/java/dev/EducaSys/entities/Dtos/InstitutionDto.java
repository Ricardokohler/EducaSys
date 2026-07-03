package dev.EducaSys.entities.Dtos;

import dev.EducaSys.entities.Group_Name;

public class InstitutionDto {

    private Long id;
    private String name;
    private String educationLevel;
    private String description;
    private Group_Name group_name;

    public InstitutionDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Group_Name getGroup_name() {
        return group_name;
    }

    public void setGroup_name(Group_Name group_name) {
        this.group_name = group_name;
    }
}
