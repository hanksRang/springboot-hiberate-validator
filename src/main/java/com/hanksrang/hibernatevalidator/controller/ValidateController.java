package com.hanksrang.hibernatevalidator.controller;

import com.hanksrang.hibernatevalidator.dto.QueryParam;
import lombok.extern.java.Log;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/validate")
@Log
public class ValidateController {

    @RequestMapping( value = "/query", method = RequestMethod.POST)
    public String query(@RequestBody(required = false) @Validated QueryParam queryParams) {
        log.info("in method");
        return null;
    }

}
