package com.gradleexample.demo.service;


import com.gradleexample.demo.entity.Employees;
import com.gradleexample.demo.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {

    @InjectMocks
    private EmployeesServiceImpl employeesService;

    @Mock
    private EmployeeMapper employeeMapper;
    
    @Test
    public void getEmployeeByIdTest() {
        when(employeeMapper.selectEmployeeById(eq(1))).thenReturn(new Employees("name1", "sex1", "no1"));
        Employees employees = employeesService.getEmployeeById(1);
        assertThat(employees.getName()).isEqualTo("name1");
    }

    @Test
    public void inputEmployeeInfoTest() {


        List<Employees> empList = new ArrayList();
        empList.add(new Employees());
        empList.add(new Employees());
        empList.add(new Employees());

        when(employeeMapper.insertEmployee(any())).thenReturn(1);
        employeesService.inputEmployeeInfo(empList);
        verify(employeeMapper, times(3)).insertEmployee(any());


    }
//    @Test
//    public void t1(){

//    }
}
