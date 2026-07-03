package dev.EducaSys.entities.Mappers;

import dev.EducaSys.entities.Coordinator;
import dev.EducaSys.entities.Dtos.CoordinatorDto;

public class CoordinatorMapper {

    public Coordinator map(CoordinatorDto dto){
        Coordinator coordinator = new Coordinator();

        if(dto.getId() != null){
            coordinator.setId(dto.getId());
        }

        coordinator.setName(dto.getName());
        coordinator.setPhone(dto.getPhone());
        coordinator.setCpf(dto.getCpf());
        coordinator.setEmail(dto.getEmail());
        coordinator.setAddress(dto.getAddress());

        coordinator.setSalary(dto.getSalary());
        coordinator.setCourse(dto.getCourse());

        return coordinator;
    }

    public CoordinatorDto map(Coordinator coordinator){
        CoordinatorDto dto = new CoordinatorDto();

        dto.setId(coordinator.getId());
        dto.setName(coordinator.getName());
        dto.setPhone(coordinator.getPhone());
        dto.setCpf(coordinator.getCpf());
        dto.setEmail(coordinator.getEmail());
        dto.setAddress(coordinator.getAddress());

        dto.setSalary(coordinator.getSalary());
        dto.setCourse(coordinator.getCourse());

        return dto;
    }

}
