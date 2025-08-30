package com.educasys.entitites;

import com.educasys.entitites.associations.Subject_Course;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="tb_courses")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer hourTime;

    //Subjects - many to many
    @OneToMany(mappedBy = "id.course")
    private Set <Subject_Course> subjects = new HashSet<>();


    //ClassRoom - one to many
    @OneToMany(mappedBy = "course")
    private Set <ClassRoom> classRooms = new HashSet<>();

    //Coordinator - one to one
    @OneToOne
    @JoinColumn(name = "Coordinator_id_FK")
    private Coordinator coordinator;

    //Institution - many to one
    @ManyToOne
    @JoinColumn(name = "Institution_id_fk")
    private Institution institution;
}
