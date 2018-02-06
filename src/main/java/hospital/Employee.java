package hospital;

public abstract class Employee {
	protected String empName;

	public String salaryInfo() {
		return "This employee's salary is " + getSalary();
	}

	public abstract int getSalary();

	public String getName() {
		// TODO Auto-generated method stub
		return empName;
	}

}
