package com.educasys.entitites.associations;

import com.educasys.entitites.ClassRoom;
import com.educasys.entitites.Student;
import com.educasys.entitites.pk.ClassRoom_Student_PK;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_ClassRoom_Student")
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(of = "id")
public class ClassRoom_Student {

    @JsonIgnore
    @EmbeddedId
    private ClassRoom_Student_PK id = new ClassRoom_Student_PK();


    public ClassRoom_Student(Student student, ClassRoom classRoom) {
        id.setStudent(student);
        id.setClassRoom(classRoom);
    }

    public Student getStudent(){

        return id.getStudent();
    }

    public void setClassRoom(ClassRoom classRooms){

        id.setClassRoom(classRooms);
    }

    public ClassRoom getClassRoom(){
        return id.getClassRoom();
    }

    public void setStudent(Student students){
        id.setStudent(students);
    }

}
