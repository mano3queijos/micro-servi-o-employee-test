package com.example.employeeservice.mappers;

import com.example.employeeservice.dtos.ManagerDto;
import com.example.employeeservice.models.Manager;
import com.example.employeeservice.services.ManagerService;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;


@Mapper(componentModel = "spring")
public interface ManagerMapper {

    ManagerDto toManagerDto(Manager manager);

}
