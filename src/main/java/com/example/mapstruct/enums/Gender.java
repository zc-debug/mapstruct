package com.example.mapstruct.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @program: mapstruct
 * @description:
 * @author: chen.zheng
 * @create: 2020/12/7  13:38
 **/
@Getter
@AllArgsConstructor
public enum Gender {

    Male("0","男"),
    Female("1","女")
    ;
    private String genderCode;
    private String genderName;

}
