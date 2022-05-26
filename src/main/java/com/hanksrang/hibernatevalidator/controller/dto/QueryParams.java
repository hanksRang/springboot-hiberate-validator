package com.hanksrang.hibernatevalidator.controller.dto;

import lombok.Data;
import org.hibernate.validator.constraints.*;

public class QueryParams{


    private String id;

    @Length(min = 0, max = 100, message = "参数错误，不在指定范围")
    private String name;

    @Length(min = 1)
    private String gender;

    @Range(min = 0, max = 200)
    private Integer age;

    @CreditCardNumber
    private String creditCardNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
}
