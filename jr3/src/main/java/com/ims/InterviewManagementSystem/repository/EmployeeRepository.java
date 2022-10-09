package com.ims.InterviewManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ims.InterviewManagementSystem.model.Employee;

@Repository
	public interface EmployeeRepository extends CrudRepository<Employee, Long>{

	}


