package com.gradleexample.demo.service;

import com.gradleexample.demo.mapper.EmployeeMapper;
import com.gradleexample.demo.entity.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wzy
 */
@Service
public class EmployeesServiceImpl implements EmployeesService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    /** 查找所有员工信息*/
    public List<Employees> getEmployeesInf() {
        return employeeMapper.selectAllEmployees();
    }

    @Override
    /** 通过 id 查找员工信息*/
    public Employees getEmployeeById(int id) {

        return employeeMapper.selectEmployeeById(id);
    }

    @Override
    /** 增加员工信息*/
    public int inputEmployeeInfo(List<Employees> listEmployees) {
        int result = 0;
        for (Employees employee : listEmployees) {
            employeeMapper.insertEmployee(employee);
            result++;
        }
        return result;
    }

    @Override
    /** 修改员工信息  未测试*/
    public int updateEmployeeInfo(Employees employees) {
        return employeeMapper.updateEmployee(employees);
    }

    @Override
    /** 通过Id删除员工信息 未测试*/
    public int deleteEmployeeById(int id) {
        return employeeMapper.deleteEmployee(id);
    }
}
