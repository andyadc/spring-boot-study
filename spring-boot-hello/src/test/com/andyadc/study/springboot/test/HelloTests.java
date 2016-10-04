package com.andyadc.study.springboot.test;

import com.andyadc.study.springboot.controller.HelloController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @author andaicheng
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloTests {

    private MockMvc mvc;

    @Before
    public void before() {
        this.mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }

    @Test
    public void testHello() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/hello");
        mvc.perform(requestBuilder).andExpect(MockMvcResultMatchers.status().isOk());
    }
}
