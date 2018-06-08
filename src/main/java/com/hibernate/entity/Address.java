package com.hibernate.entity;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class Address {

    @NotBlank(message = "省份不能为空")
    private String province;

    private String city;

    private String street;
}
