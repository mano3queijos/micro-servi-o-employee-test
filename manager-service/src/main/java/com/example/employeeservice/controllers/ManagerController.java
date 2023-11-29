package com.example.employeeservice.controllers;


import com.example.employeeservice.dtos.ManagerDto;
import com.example.employeeservice.models.Manager;
import com.example.employeeservice.services.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RequiredArgsConstructor
@RequestMapping("/manager")
@RestController
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @PostMapping("/create")
    public ResponseEntity<ManagerDto> create(@RequestBody Manager manager) {
        ManagerDto managerDto = managerService.create(manager);
        System.out.println(managerDto);
        return ResponseEntity.created(URI.create("/manager" + managerDto.getId())).body(managerDto);
    }

    @GetMapping("/{managerId}")
    public ResponseEntity<ManagerDto> getManagers(@PathVariable Long managerId) {


        ManagerDto managerDto = managerService.findByID(managerId);
        return ResponseEntity.ok().body(managerDto);
    }
}
