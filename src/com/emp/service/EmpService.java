package com.emp.service;

import java.util.Map;

import com.emp.Adress;
import com.emp.Employee;

interface EmpService {

	Map<Employee, Adress>getEmployee();
	Integer save(Employee e,Adress adr);
	Adress getEmpDetailsById(Employee emp);
}
