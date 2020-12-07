package com.example.mapstruct.bean;

import lombok.Data;

import java.util.Date;

@Data
public class PersonDTO {

    private String userName;

    private Integer age;

    private Date birthday;

    private String gender;

    private String address;
}