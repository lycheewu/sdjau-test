package com.sdjzu.test.controller;

import com.sdjzu.test.exception.ApiResult;
import com.sdjzu.test.pojo.Employee;
import com.sdjzu.test.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "人员管理接口文档")
@RequestMapping("/employee")
public class EmployeeController extends BaseController {

    @Resource
    private EmployeeService employeeService;

    /**
     * 查询所有的用户
     */
    @ApiOperation("查询所有员工信息")
    @GetMapping(value = "/findAllEmployee")
    public ApiResult<List<Employee>> findAllEmployee() {
        List<Employee> employees = employeeService.findAllEmployee();
        return new ApiResult<>(employees);
    }
}
