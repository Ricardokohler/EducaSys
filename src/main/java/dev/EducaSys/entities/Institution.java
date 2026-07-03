package dev.EducaSys.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_INSTITUTIONS")
public class Institution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String educationLevel;

    private String description;

    @ManyToOne
    @JoinColumn(name = "id_institution")
    private Group_Name groupName;

    public Institution() {
    }

    public Institution(Long id, String name, String educationLevel, String description) {
        this.id = id;
        this.name = name;
        this.educationLevel = educationLevel;
        this.description = description;
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

    public Group_Name getGroupName() {
        return groupName;
    }

    public void setGroupName(Group_Name groupName) {
        this.groupName = groupName;
    }
}
