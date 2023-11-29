package com.br.manu.addressservice.controllers;

import com.br.manu.addressservice.dtos.AddressDto;
import com.br.manu.addressservice.model.Address;
import com.br.manu.addressservice.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@AllArgsConstructor
@RestController
@RequestMapping("/address")

public class AddressController {


    private final AddressService addressService;

    @PostMapping("/register")
    public ResponseEntity<Address> register(@RequestBody Address address){

        Address addressDto = addressService.register(address);
        return ResponseEntity.created(URI.create("/address" + addressDto.getId())).body(addressDto);
    }

    @GetMapping("/{addressId}")
    public ResponseEntity<Address> getAddressById(@PathVariable Long addressId ){
        System.out.println(addressId);
        Address addressDto = addressService.findAddressByEmployeeId(addressId);
       System.out.println(addressDto);
        return  ResponseEntity.ok().body(addressDto);
    }




}
