package dev.EducaSys.entities.Mappers;

import dev.EducaSys.entities.Dtos.ClassRoomDto;
import dev.EducaSys.entities.ClassRoom;

public class ClassRoomMapper {

    public ClassRoom map(ClassRoomDto dto){
        ClassRoom classRoom = new ClassRoom();

        if (dto.getId() != null){
            classRoom.setId(dto.getId());
        }
        classRoom.setLetter(dto.getLetter());
        classRoom.setShift(dto.getShift());

        return classRoom;
    }

    public ClassRoomDto map(ClassRoom classRoom){
        ClassRoomDto dto = new ClassRoomDto();

        dto.setId(classRoom.getId());
        dto.setLetter(classRoom.getLetter());
        dto.setShift(classRoom.getShift());

        return dto;
    }

}
