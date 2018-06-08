package com.hibernate.entity;

import com.hibernate.custom.Equals;
import com.hibernate.custom.SingleNull;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@Equals.List({@Equals(firstField = "password", secondField = "passwordVerify", message = "{firstField}和{secondField}内容不匹配")})
@SingleNull.List({@SingleNull(firstField = "enName", secondField = "chName", message = "{firstField}和{secondField}不能同时为空")})
public class PlaceName {
    /**
     * 英文名称
     */
    private String enName;

    /**
     * 中文名称
     */
    private String chName;

    private String password;

    private String passwordVerify;
}
