package dev.EducaSys.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name= "TB_PROFESSORS")
public class Professor extends Person{

    private Double salary;

    public Professor() {
    }

    public Professor(Long id, String name, String phone, String address, String email, String cpf, Double salary) {
        super(id, name, phone, address, email, cpf);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Set<Subject> getSubjectSet() {
        return subjectSet;
    }

    public void setSubjectSet(Set<Subject> subjectSet) {
        this.subjectSet = subjectSet;
    }

    @ManyToMany(mappedBy = "professorSet")
    private Set<Subject> subjectSet;
}
