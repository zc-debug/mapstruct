package com.example.mapstruct.mapper;

import com.alibaba.fastjson.JSON;
import com.example.mapstruct.bean.AddressHome;
import com.example.mapstruct.bean.PersonDO;
import com.example.mapstruct.bean.PersonDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonConverter {

    PersonConverter INSTANCE = Mappers.getMapper(PersonConverter.class);

    @Mapping(source = "name", target = "userName")
    @Mapping(target = "age", constant = "88")
    @Mapping(target = "address", expression = "java(addressHomeToString(person.getAddressHome()))")
    PersonDTO do2dto(PersonDO person);

    default String addressHomeToString(AddressHome addressHome){
        return JSON.toJSONString(addressHome);
    }

}