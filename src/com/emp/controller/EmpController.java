package com.emp.controller;

import java.util.Map;

import com.emp.Adress;
import com.emp.Employee;
import com.emp.service.EmpServiceImpl;

public class EmpController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpServiceImpl empService=new EmpServiceImpl();
		//get all records
		/*
		Map<Employee, Adress> employee = empService.getEmployee();
		for(Map.Entry<Employee, Adress>hm:employee.entrySet())
		{
			Employee emp = hm.getKey();
			Adress adr = hm.getValue();
			System.out.print(emp.getId()+"  "+emp.getName()+" "+adr.geteId()+" "+adr.geteAdress()+"  "+adr.getePinCode());
			
			System.out.println();
		}
		*/
		//save a records
		/*
		Employee emps=new Employee();
		emps.setId(106);
		emps.setName("spdeer");
		
		Adress  adrss=new Adress();
		adrss.seteId(206);
		adrss.seteAdress("pune");
		adrss.setePinCode(400076);
		
		empService.save(emps, adrss);
		Map<Employee, Adress> employee = empService.getEmployee();
		for(Map.Entry<Employee, Adress>hm:employee.entrySet())
		{
			Employee emp = hm.getKey();
			Adress adr = hm.getValue();
			System.out.print(emp.getId()+"  "+emp.getName()+" "+adr.geteId()+" "+adr.geteAdress()+"  "+adr.getePinCode());
			
			System.out.println();
		}
		*/
		
		//delete
		
		Employee  emp=new Employee(103 ,"tom");	
		Adress empDetailsById = empService.getEmpDetailsById(emp);
		System.out.println(empDetailsById);
		
		
		
		
		
	
		
		
	
		
		
		
	}

}
