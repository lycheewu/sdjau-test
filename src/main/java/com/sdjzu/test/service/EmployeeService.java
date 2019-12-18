package com.sdjzu.test.service;

import com.sdjzu.test.pojo.Employee;
import com.sdjzu.test.repo.EmployeeRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmployeeService implements EmployeeRepository {

    @Resource
    private EmployeeRepository employeeRepo;

    @Override
    public List<Employee> findAllEmployee() {
        return employeeRepo.findAllEmployee();
    }

    @Override
    public Employee findEmployee(String id) {
        return employeeRepo.findEmployee(id);
    }

    @Override
    public void insertEmployee(Employee employee) {
        employeeRepo.insertEmployee(employee);
    }

    @Override
    public void deleteEmployee(String id) {
        employeeRepo.deleteEmployee(id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeRepo.updateEmployee(employee);
    }
}
