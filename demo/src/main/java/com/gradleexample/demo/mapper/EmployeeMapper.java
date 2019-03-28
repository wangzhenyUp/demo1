package com.gradleexample.demo.mapper;

import com.gradleexample.demo.entity.Employees;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wzy
 */
@Mapper
public interface EmployeeMapper {
    /**
     * 查找employee表中所有的信息
     */
    List<Employees> selectAllEmployees();

    Employees selectEmployeeById(@Param("id") int id);

    /**
     * 插入信息
     */
    int insertEmployee(Employees employees);

    /**
     * 修改员工信息
     *
     * @param employees
     * @return
     */
    int updateEmployee(Employees employees);

    /**
     * 删除员工信息
     *
     * @param id
     * @return
     */
    int deleteEmployee(int id);
}
