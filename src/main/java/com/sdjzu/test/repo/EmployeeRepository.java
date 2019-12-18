package com.sdjzu.test.repo;

import com.sdjzu.test.pojo.Employee;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface EmployeeRepository {

    @Select("select * from employee")
    List<Employee> findAllEmployee();

    @Select("select * from employee where id=#{id}")
    Employee findEmployee(@Param("id") String id);

    @Insert("insert into employee(id,name,department,position,phone) " +
            "values(#{id},#{name},#{department},#{position},#{phone})")
    void insertEmployee(Employee employee);

    @Delete("delete from employee where id=#{id}")
    void deleteEmployee(@Param("id") String id);

    @Update("update user set name=#{name},department=#{department},position=#{position},phone=#{phone} where id=#{id}")
    void updateEmployee(Employee employee);
}
