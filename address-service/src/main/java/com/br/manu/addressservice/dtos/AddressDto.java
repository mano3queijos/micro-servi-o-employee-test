package com.br.manu.addressservice.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class AddressDto {


    private Long id;
    private String cep;
    private Long employeeId;
    private String street;


}
