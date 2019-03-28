package com.gradleexample.demo.action;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeControllerTest {

    private MockMvc mockMvc;
    @Autowired
    WebApplicationContext context;

    @Before
    public void initMockMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void getStudentList() throws Exception {
        String employeesJson = "[{'name':'西瓜汁','sex':'男','workno':'xx005159'}]";

        mockMvc.perform(MockMvcRequestBuilders.post("/insertEmp")
                .contentType(MediaType.APPLICATION_JSON).content(employeesJson))
                .andDo(MockMvcResultHandlers.print());
    }
}
