package com.emp.dao;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.emp.Adress;
import com.emp.Employee;
import com.emp.database.EmpDataBase;

public class EmpDaoImpl implements EmpDao {

	@Override
	public Map<Employee, Adress> getEmployee() {
		return EmpDataBase.records;
		
	}

	@Override
	public Integer save(Employee e, Adress adr) {
		// TODO Auto-generated method stub
		EmpDataBase.records.put(e, adr);
		return 1;
	}


	@Override
	public Adress getEmpDetailsById(Employee emp) 
	{
		
		Map<Employee,Adress> records = EmpDataBase.records;
		
		Adress adress = records.get(emp);
		return adress;
		
	}

		

}
