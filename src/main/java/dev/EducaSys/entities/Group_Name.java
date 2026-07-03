package dev.EducaSys.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "TB_GROUP_NAME")
public class Group_Name {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String cnpj;
    private String description;

    @OneToMany(mappedBy = "groupName")
    private List<Institution> institutionList;

    public Group_Name() {
    }

    public Group_Name(Long id, String name, String cnpj, String description) {
        this.id = id;
        this.name = name;
        this.cnpj = cnpj;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Institution> getInstitutionList() {
        return institutionList;
    }

    public void setInstitutionList(List<Institution> institutionList) {
        this.institutionList = institutionList;
    }
}
