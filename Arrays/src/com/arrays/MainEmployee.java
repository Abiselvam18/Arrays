package com.arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employee{
	int Eid;
	String Name;
	float Esalary;
	String Edeptname;
	
	public Employee(int Eid, String Name, float Esalary, String Edeptname) {
		super();
		this.Eid=Eid;
		this.Name=Name;
		this.Esalary=Esalary;
		this.Edeptname=Edeptname;
	}
	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Name=" + Name + ", Esalary=" + Esalary + ", Edeptname=" + Edeptname + "]";
	}
}
// for sorting user defined object in ArrayList
class MySortComapare implements Comparator<Employee>
{
//sorting based on id
	@Override
	public int compare(Employee o1,Employee o2) {
		
		if(o1.Eid>o2.Eid)
		return 1;
		else if(o1.Eid<o2.Eid)
			return -1;
		else 
			return 0;
	}
	
}

public class MainEmployee {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(100, "Varsha", 8000.25f, "IT");
		Employee emp2 = new Employee(101, "Sanjay", 7500.50f, "EEE");
		Employee emp3 = new Employee(102, "Nithish", 10000.32f, "CSE");
		Employee emp4 = new Employee(103, "Ramya", 15000.45f, "ECE");
		
		//ArrayList
		ArrayList<Employee> Elist = new ArrayList<Employee>();
		Elist.add(emp1);
		Elist.add(emp2);
		Elist.add(emp3);
		Elist.add(emp4);
		System.out.println(Elist);
		
		//Iterator
		Iterator<Employee> Eit=Elist.iterator();
		System.out.println("Before Sorting");
		while(Eit.hasNext()) {
			Employee eob=Eit.next();
			System.out.println(eob.Eid+" "+eob.Name+" "+eob.Esalary+" "+eob.Edeptname);
		}
		
		Collections.sort(Elist, new MySortCompare());
		Iterator<Employee> Elist1=Elist.iterator();
		System.out.println("After Sorting");
		while(Eit.hasNext()) {
			Employee eob=Eit.next();
			System.out.println(eob.Eid+" "+eob.Name+" "+eob.Esalary+" "+eob.Edeptname);
	}
	}
}

