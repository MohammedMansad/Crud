package com.emp.database;

import java.util.HashMap;
import java.util.Map;

import com.emp.Adress;
import com.emp.Employee;

public class EmpDataBase {

	public static Map<Employee, Adress>records=null;
	
	
	static {
		
		records=new HashMap<>();
		
		Employee  emp=new Employee();
		emp.setId(101);
		emp.setName("blob");
		
		Employee emp2=new Employee();
		emp2.setId(102);
		emp2.setName("clob");
		
		Employee emp3=new Employee();
		emp3.setId(103);
		emp3.setName("tom");
		
		Employee emp4=new Employee();
		emp4.setId(104);
		emp4.setName("jerry");
		
		Employee emp5=new Employee();
		emp5.setId(105);
		emp5.setName("mouse");
		
		
		
		Adress   adrs=new Adress();
		adrs.seteId(201);
		adrs.seteAdress("Mumbai");
		adrs.setePinCode(400070);
		
		Adress   adrs2=new Adress();
		adrs2.seteId(202);
		adrs2.seteAdress("ksd");
		adrs2.setePinCode(400071);
		
		Adress   adrs3=new Adress();
		adrs3.seteId(203);
		adrs3.seteAdress("up");
		adrs3.setePinCode(400072);
		
		Adress   adrs4=new Adress();
		adrs4.seteId(204);
		adrs4.seteAdress("londn");
		adrs4.setePinCode(400073);
		
		Adress   adrs5=new Adress();
		adrs5.seteId(205);
		adrs5.seteAdress("usa");
		adrs5.setePinCode(400074);
		
		
		
		records.put(emp, adrs);
		records.put(emp2, adrs2);
		records.put(emp3, adrs3);
		records.put(emp4, adrs4);
		records.put(emp5, adrs5);
		
		
		
	}
	
	
}
