package com.example.employeeservice.feignclients;

import com.example.employeeservice.dtos.AddressDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "address", url = "http://localhost:8081/")
public interface AddressClient {

    @GetMapping("/{employeeId}")
    public ResponseEntity<AddressDto> getAddressByEmployeeId(@PathVariable("employeeId") Long id);
}
