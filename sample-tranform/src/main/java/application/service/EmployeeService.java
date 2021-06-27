/**
 * 
 */
/**
 * @author Shan
 *
 */
package application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import generated_1624183656148.Employee;

@Service
public class EmployeeService {
	
	private List<Employee> list=new ArrayList<>();
	
	public void initDB() {
		Employee emp1=new Employee();
		emp1.setName("test1");
		emp1.setSalary("2000");
		emp1.setAge("25");
		list.add(emp1);
	}
	
	public Employee addEmployee(Employee emp) {
		list.add(emp);
		return emp;
	}
	
	public List<Employee> getEmployees(){
		
		return list;
	}
}