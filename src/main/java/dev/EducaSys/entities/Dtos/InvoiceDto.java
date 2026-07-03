package dev.EducaSys.entities.Dtos;

import dev.EducaSys.entities.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceDto {

    private Long id;

    private LocalDateTime expeditionDate;
    private LocalDateTime expirationDate;
    private Double amount;

    private Student student;

}
