package hospital;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hospital {

	Map<String, Employee> employees = new HashMap<>();

	public void addEmployee(Employee employee) {
		employees.put(employee.getEmpNumber(), employee);
	}

	public Collection<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employees.values();
	}

}
