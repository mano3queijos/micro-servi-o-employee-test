package com.example.employeeservice.services;



import com.example.employeeservice.dtos.ManagerDto;
import com.example.employeeservice.mappers.ManagerMapper;
import com.example.employeeservice.models.Manager;
import com.example.employeeservice.repository.ManagerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ManagerService {

    private final ManagerRepository managerRepository;

    @Autowired
    private ManagerMapper managerMapper;

    public ManagerDto create(Manager managerDto){

        Manager savedManager = managerRepository.save(managerDto);

        return managerMapper.toManagerDto(savedManager);

    }

}
