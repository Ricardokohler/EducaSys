package dev.EducaSys.entities.Dtos;

import dev.EducaSys.entities.Course;
public class CoordinatorDto {

    private Long id;
    private String name;
    private String phone;
    private String address;
    private String email;
    private String cpf;

    private Double salary;
    private Course course;

    public CoordinatorDto() {
    }

    public CoordinatorDto(Long id, String name, String phone, String address, String email, String cpf, Double salary, Course course) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.cpf = cpf;
        this.salary = salary;
        this.course = course;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
