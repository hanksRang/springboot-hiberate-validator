package com.hanksrang.hibernatevalidator.validator;

import com.hanksrang.hibernatevalidator.dto.Customer;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class ValidatorTest {


   public static final Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
   


    /**
     * 分组校验和组合校验
     * 不同的业务有不同的参数校验组合
     * @param obj
     * @param groups
     * @param <T>
     */
    public static <T> Set validate(T obj,Class ... groups) {
        String msg = "";
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(obj);
        // 抛出检验异常
        if (constraintViolations.size() > 0) {
            // msg =constraintViolations.iterator().next().getMessage();
            return constraintViolations;
        }
        return null;
    }


    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("xl");
        customer.setAge(11);
        customer.setMobile("1581649786");
        customer.setIdcard("4311122145845");
        Set validIdcard = validate(customer);
        System.out.println(validIdcard);

    }

}