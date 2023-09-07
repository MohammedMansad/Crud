package com.emp.dao;

import java.util.Map;

import com.emp.Adress;
import com.emp.Employee;

interface EmpDao {

	Map<Employee, Adress>getEmployee();
	Integer save(Employee e,Adress adr);
	 Adress getEmpDetailsById(Employee emp);
	 
	
}
