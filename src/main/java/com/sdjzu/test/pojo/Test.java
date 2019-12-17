package com.sdjzu.test.pojo;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Setter
@Getter
@Table(name = "db_employee")
public class Test {
    /**
     * 员工工号
     */
    private String employeeId;

    /**
     * 员工姓名
     */
    private String employeeName;

    /**
     * 员工部门
     */
    private String employeeDepartment;

    /**
     * 员工职位
     */
    private String employeePosition;

    /**
     * 员工联系方式
     */
    private String employeePhone;
}
