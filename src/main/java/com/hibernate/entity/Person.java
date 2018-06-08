package com.hibernate.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class Person {

    @NotBlank(message = "id不能为空")
    @Length(min = 1, max = 3, message = "id长度必须在{min}到{max}位之间")
    private String id;

    @NotBlank(message = "姓名不能为空")
    private String name;

    @NotBlank(message = "性别不能为空")
    @Pattern(regexp = "男|女", message = "性别只能是男或女")
    private String sex;

    /**
     * 如果不加NotNull,传入null不会校验
     */
    @NotNull(message = "联系信息不能为空")
    @Valid
    private ContactInfo contactInfo;

    private Address address;
}
