package com.example.demo;

import com.example.demo.dao.TestsetDao;
import com.example.demo.entity.Testset;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MySpringBootTest {
    @Autowired
    MockMvc mockMvc;


    @Autowired
    private TestsetDao testsetDao;

    @Test
    public void test() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("hello Spring boot"));
    }
    @Test
    public void test2(){
        Testset testset = new Testset();
        testset.setUsername("yuyuyu");
        List<Testset> all = testsetDao.findAll();
        System.out.println(all);
    }
}
