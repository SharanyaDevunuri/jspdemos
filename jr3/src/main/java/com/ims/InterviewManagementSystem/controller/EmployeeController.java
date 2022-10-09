/**
 * 
 */
package com.ims.InterviewManagementSystem.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ims.InterviewManagementSystem.exception.ResourceNotFoundException;
import com.ims.InterviewManagementSystem.model.Employee;
import com.ims.InterviewManagementSystem.repository.EmployeeRepository;
import com.ims.InterviewManagementSystem.service.IEmployeeService;
/**
 * @author sharanya
 *
 */
@RestController
@CrossOrigin("http://localhost:3000/")
//@RequestMapping("/api/v1/")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	private final IEmployeeService employeeService;

    public EmployeeController(IEmployeeService employeeeService) {
        this.employeeService = employeeeService;
    }
	
	// get all employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return (List<Employee>) employeeRepository.findAll();
	}		
	
	// create employee rest api
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	
	// get employee by id rest api
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		return ResponseEntity.ok(employee);
	}
	
	// update employee rest api
	
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails){
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		
		employee.setCreateddate(employeeDetails.getJobCode());
		employee.setCustomer(employeeDetails.getCustomer());
		employee.setJobDescription(employeeDetails.getJobDescription());
		employee.setPrimaryTechnology(employeeDetails.getPrimaryTechnology());
		employee.setSecondaryTechnology(employeeDetails.getSecondarySkills());
		employee.setMandatorySkills(employeeDetails.getMandatorySkills());
		employee.setNoofPositions(employeeDetails.getNoofPositions());
		employee.setDueDate(employeeDetails.getDueDate());
		employee.setCreatedby(employeeDetails.getCreatedby());
		employee.setCreateddate(employeeDetails.getCreateddate());
        
		
		Employee updatedEmployee = employeeRepository.save(employee);
		return ResponseEntity.ok(updatedEmployee);
	}
	
	// delete employee rest api
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		
		employeeRepository.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

}
