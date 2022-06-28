package com.hanksrang.hibernatevalidator.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 */
@NotBlank
@Pattern(
        regexp = "^(\\d{15,15}|\\d{18,18}|\\d{17}(\\d|X|x))",
        message = "身份证格式有误"
)
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
//可指定校验类,如果不指定校验类则默认当前类
@Constraint(
        validatedBy = {}
)
public @interface IdCard {

    String value()default "510223232233232";

    String regexp() default "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,4}";

    String message()default "身份证校验失败";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}