package com.ims.InterviewManagementSystem.service;


import org.springframework.stereotype.Component;

import com.ims.InterviewManagementSystem.exception.EmployeeNotFoundException;
import com.ims.InterviewManagementSystem.model.Employee;
import com.ims.InterviewManagementSystem.repository.EmployeeRepository;

@Component
public class EmployeeService implements IEmployeeService {
	private final EmployeeRepository employeeServiceRepository;

    public EmployeeService(EmployeeRepository emplyeeRepositry) {
        this.employeeServiceRepository = emplyeeRepositry;
    }

    @Override
    public Employee findById(Long id) {

        return employeeServiceRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }


}
