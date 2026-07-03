package dev.EducaSys.entities.Dtos;

import dev.EducaSys.entities.Invoice;
import dev.EducaSys.entities.ReportCard;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassRoomDto {

    private Long id;

    private Character letter;
    private Integer studentsNumber;
    private String shift;

    private List<ReportCard> reportCardList;

}
