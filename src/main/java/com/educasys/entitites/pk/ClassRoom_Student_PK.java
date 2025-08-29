package com.educasys.entitites.pk;

import com.educasys.entitites.ClassRoom;
import com.educasys.entitites.Student;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
@EqualsAndHashCode
public class ClassRoom_StudentPK{

    @ManyToOne
    private Student student;

    @ManyToOne
    private ClassRoom classRoom;

}
