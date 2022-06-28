package com.hanksrang.hibernatevalidator.controller.test;


import com.alibaba.fastjson.JSON;
import com.hanksrang.hibernatevalidator.dto.QueryParam;
import lombok.extern.java.Log;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.logging.Level;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Log
public class ValidateControllerTest {

    protected MockMvc mockMvc;

    @Autowired
    protected WebApplicationContext wac;

    @Before()
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();  //初始化MockMvc对象
    }

    @Test
    public void testWhenAgeInvalid() throws Exception {
        QueryParam queryParam = new QueryParam();
        queryParam.setAge(300);
        queryParam.setGender("1231");
        queryParam.setName("小王1231313");
        queryParam.setCreditCardNumber("622586396663888");
        String reqJson = JSON.toJSONString(queryParam);
        MvcResult result = mockMvc.perform(post("/validate/query")
                .contentType(MediaType.APPLICATION_JSON)
                .content(reqJson)
                .accept(MediaType.APPLICATION_JSON))
                .andReturn();
        System.out.println("返回值：" + result.getResponse().getStatus());
        if (result.getResponse().getStatus() != 200) {
            log.log(Level.OFF, "错误信息：" + result.getResolvedException());
        }
    }
}