package dev.EducaSys.entities.Dtos;

import dev.EducaSys.entities.Course;
import dev.EducaSys.entities.Invoice;
import dev.EducaSys.entities.ReportCard;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoordinatorDto {

    private Long id;
    private String name;
    private String phone;
    private String address;
    private String email;
    private String cpf;

    private Double salary;
    private Course course;

}
