package dev.EducaSys.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "TB_COORDINATORS")
public class Coordinator extends Person{

    private Double salary;

    @OneToOne
    public Course course;

    public Coordinator(Long id, String name, String phone, String address, String email, String cpf, Double salary) {
        super(id, name, phone, address, email, cpf);
        this.salary = salary;
    }

    public Coordinator(Long id, String name, String phone, String address, String email, String cpf, Double salary, Course course) {
        super(id, name, phone, address, email, cpf);
        this.salary = salary;
        this.course = course;
    }

    public Coordinator() {
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
