package com.educasys.entitites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_report_cards")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReportCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_student")
    private Student student;

    @JsonIgnore
    @OneToMany(mappedBy = "reportCard", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SubjectAverage> subjectAverageList = new ArrayList<>();


    @ManyToOne
    @JoinColumn(name = "id_course")
    private Course course;

}
