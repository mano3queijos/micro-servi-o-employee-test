package com.br.manu.addressservice.mappers;


import com.br.manu.addressservice.dtos.AddressDto;
import com.br.manu.addressservice.model.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressDto toAddressDto(Address address);

}
