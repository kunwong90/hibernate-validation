package com.hibernate.custom;

import org.apache.commons.beanutils.BeanUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EqualsValidator implements ConstraintValidator<Equals, Object> {

    private String firstField;

    private String secondField;

    @Override
    public void initialize(Equals constraintAnnotation) {
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
            return firstValue == null || secondValue == null || firstValue != null && firstValue.equals(secondValue);
        } catch (Exception e) {
            return false;
        }
    }
}
