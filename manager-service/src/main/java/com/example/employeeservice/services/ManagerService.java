package com.example.employeeservice.services;


import com.example.employeeservice.dtos.AddressDto;
import com.example.employeeservice.dtos.ManagerDto;
import com.example.employeeservice.exceptions.AppException;
import com.example.employeeservice.feignclients.AddressClient;
import com.example.employeeservice.models.Manager;
import com.example.employeeservice.repository.ManagerRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ManagerService {

    private final ManagerRepository managerRepository;


    private ModelMapper modelMapper;

    @Autowired
    private AddressClient addressClient;

    public ManagerDto create(Manager managerDto) {
        Manager savedManager = managerRepository.save(managerDto);
        return modelMapper.map(savedManager, ManagerDto.class);

    }

    public ManagerDto findByID(Long id) {

        ResponseEntity<AddressDto> addressDtoResponseEntity = addressClient.getAddressByEmployeeId(id);
        AddressDto addressDto = addressDtoResponseEntity.getBody();
        Manager savedManager = managerRepository.findById(id).orElseThrow(() -> new AppException("", HttpStatus.NOT_FOUND));
        ManagerDto managerDto = modelMapper.map(savedManager, ManagerDto.class);
        managerDto.setAddressDto(addressDto);
        return managerDto;
    }


}
