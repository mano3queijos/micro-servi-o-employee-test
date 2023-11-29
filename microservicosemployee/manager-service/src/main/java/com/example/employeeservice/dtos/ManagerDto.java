package com.example.employeeservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class ManagerDto {

    private String name;
    private AddressDto AddressDto;
    private PaymentDto paymentDto;
    private String email;
    private Long id;
    private LocalDate birthDate;


}
