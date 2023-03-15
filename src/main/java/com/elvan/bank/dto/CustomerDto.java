package com.elvan.bank.dto;

import com.elvan.bank.model.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

    private String id;
    private String name;
    private Integer dateOfBirth;
    private CityDto city;
    private Address address;

}
