package com.example.mapstruct.test;

import com.example.mapstruct.bean.AddressHome;
import com.example.mapstruct.bean.PersonDO;
import com.example.mapstruct.bean.PersonDTO;
import com.example.mapstruct.enums.Gender;
import com.example.mapstruct.mapper.PersonConverter;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * @program: mapstruct
 * @description:
 * @author: chen.zheng
 * @create: 2020/12/7  11:22
 **/
public class Demo1 {

    public static void main(String[] args) {
        PersonDO personDO = new PersonDO();
        AddressHome addressHome = new AddressHome();
        addressHome.setCity("上海市");
        addressHome.setProvince("徐汇区");
        personDO.setName("Hollis");
        personDO.setAge(26);
        personDO.setBirthday(new Date());
        personDO.setId(1);
        personDO.setGender(Gender.Female);
        personDO.setAddressHome(addressHome);
        System.out.println(personDO);
        PersonDTO personDTO = PersonConverter.INSTANCE.do2dto(personDO);
        /*PersonDTO personDTO = new PersonDTO();
        BeanUtils.copyProperties(personDO,personDTO);
*/
        System.out.println(personDTO);
    }
}
