package com.hibernate.custom;

import org.apache.commons.beanutils.BeanUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SingleNullValidator implements ConstraintValidator<SingleNull, Object> {

    private String firstField;

    private String secondField;

    @Override
    public void initialize(SingleNull constraintAnnotation) {
        this.firstField = constraintAnnotation.firstField();
        this.secondField = constraintAnnotation.secondField();
    }

    @Override
    public boolean isValid(Object object, ConstraintValidatorContext context) {
        if (object == null) {
            return false;
        }
        try {
            String firstValue = BeanUtils.getProperty(object, firstField);
            String secondValue = BeanUtils.getProperty(object, secondField);
            return firstValue != null || secondValue != null;
        } catch (Exception e) {
            return false;
        }
    }
}
