package com.example.mapstruct.bean;

import com.example.mapstruct.enums.Gender;
import lombok.Data;

import java.util.Date;

@Data
public class PersonDO {

    private Integer id;

    private String name;

    private int age;

    private Date birthday;

    private Gender gender;

    private AddressHome addressHome;

}
