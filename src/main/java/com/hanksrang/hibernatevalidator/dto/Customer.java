package com.hanksrang.hibernatevalidator.dto;

import com.hanksrang.hibernatevalidator.validator.IdCard;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Value;

@Data
public class Customer {

     private String name;

     private int age;

     @IdCard
     private String idcard;

     @Length(min = 0, max = 1)
     @Value("dian hua")
     private String mobile;

}