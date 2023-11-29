package com.example.employeeservice.models;

import com.example.employeeservice.dtos.AddressDto;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "managers")
public class Manager {


    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)

    private Long id;
    private String name;
    private String email;
    private LocalDate birthDate;
    // micros erviço de endereço
    // mic ro serviço de pagamento


}
