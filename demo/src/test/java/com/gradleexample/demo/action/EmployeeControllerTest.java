package com.gradleexample.demo.action;

import com.gradleexample.demo.entity.Employees;
import com.gradleexample.demo.service.EmployeesServiceImpl;
import io.restassured.http.ContentType;
import io.restassured.module.mockmvc.specification.MockMvcRequestSpecification;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.hamcrest.Matchers.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeControllerTest {

    @InjectMocks
    private EmployeeController employeeController;
    @Mock
    private EmployeesServiceImpl employeesService;

    private MockMvcRequestSpecification specification;
    @Before
    public void setUp(){
        specification =  given().
                mockMvc(MockMvcBuilders.standaloneSetup(employeeController).build())
                .contentType(ContentType.JSON);

    }

    @Test
    public void getStudentList(){

        Employees employees = new Employees(1,"name1","","");
        doReturn(employees).when(employeesService).getEmployeeById(eq(1));

        specification
                .log().all()
                .when()
                .get("do/emp?id=1")
                .then()
                .log().all()
                .body("id",is(1));
    }
    @Test
    public void toUpdateEmployeeInfoTest(){
        Employees employees = new Employees(1,"name1","男","xx005156");

        doReturn(1).when(employeesService).updateEmployeeInfo(any(Employees.class));

        specification
                .body(employees)
                .log().all()
                .when()
                .post("do/updateEmp")
                .then()
                .log().all()
                .assertThat()
                .body(equalTo("1"));
    }

}
