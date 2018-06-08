package com.hibernate.entity;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class ContactInfo {

    @NotBlank(message = "电话号码不能为空")
    private String phone;

    @NotNull(message = "Email地址列表不能为空")
    @Size(min = 2, message = "Email地址不能少于{min}个")
    private List<String> emails;

    @Valid
    private List<Address> addresses;
}
