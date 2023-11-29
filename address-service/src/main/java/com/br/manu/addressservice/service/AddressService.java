package com.br.manu.addressservice.service;


import com.br.manu.addressservice.addressRepository.AddressRepository;
import com.br.manu.addressservice.exceptions.AppException;
import com.br.manu.addressservice.mappers.AddressMapper;
import com.br.manu.addressservice.model.Address;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;


@AllArgsConstructor
@Service
public class AddressService {



    private final AddressRepository addressRepository;


    public Address findAddressByEmployeeId(Long id) {

        return addressRepository.findAddressByEmployeeId(id).orElseThrow(() -> new AppException("", HttpStatus.NOT_FOUND));
    }
    @ResponseStatus(HttpStatus.CREATED)
    public Address register(Address address){

       return addressRepository.save(address);

    }
}
