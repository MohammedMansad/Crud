package com.emp.service;

import java.util.Map;

import com.emp.Adress;
import com.emp.Employee;
import com.emp.dao.EmpDaoImpl;

public class EmpServiceImpl implements EmpService {

	@Override
	public Map<Employee, Adress> getEmployee() {
		// TODO Auto-generated method stub
		
		EmpDaoImpl daoImpl=new EmpDaoImpl();
		
		return daoImpl.getEmployee();
	}

	@Override
	public Integer save(Employee e, Adress adr) {
		// TODO Auto-generated method stub
		EmpDaoImpl daoImpl=new EmpDaoImpl();
		
		
		return daoImpl.save(e, adr);
	}

	@Override
	public Adress getEmpDetailsById(Employee emp) {
		// TODO Auto-generated method stub
		
		EmpDaoImpl daoImpl=new EmpDaoImpl();
		return daoImpl.getEmpDetailsById(emp);
		
	}

	
	
	
	

}
