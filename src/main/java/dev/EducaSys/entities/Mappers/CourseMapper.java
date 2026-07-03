package dev.EducaSys.entities.Mappers;

import dev.EducaSys.entities.Course;
import dev.EducaSys.entities.Dtos.CourseDto;

public class CourseMapper {
    
    public Course map(CourseDto dto) {
        Course course = new Course();

        if(dto.getId() != null){
            course.setId(dto.getId());
        }

        course.setName(dto.getName());
        course.setHourTime(dto.getHourTime());
        course.setCoordinator(dto.getCoordinator());
        course.setSubjectSet(dto.getSubjectSet());

        return course;
    }

    public CourseDto map(Course course){
        CourseDto dto = new CourseDto();

        dto.setId(course.getId());
        dto.setName(course.getName());
        dto.setHourTime(course.getHourTime());
        dto.setCoordinator(course.getCoordinator());
        dto.setSubjectSet(dto.getSubjectSet());

        return dto;
    }
    
}
