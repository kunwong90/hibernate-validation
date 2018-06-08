package com.hibernate.validation;

import com.hibernate.exception.BizException;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class ValidationUtil {

    private static Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    public static void validator(Object object) {
        if (object == null) {
            throw new BizException("需要检验的对象不能为空");
        }
        Set<ConstraintViolation<Object>> constraintViolationSet = validator.validate(object);
        if (!constraintViolationSet.isEmpty()) {
            throw new BizException(constraintViolationSet.iterator().next().getMessage());
        }
    }

}
