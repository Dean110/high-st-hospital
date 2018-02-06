package hospital;

public abstract class Employee {
	protected String empName;
	protected String empNumber;

	public String salaryInfo() {
		return "This employee's salary is " + getSalary();
	}

	public abstract int getSalary();

	public String getName() {
		// TODO Auto-generated method stub
		return empName;
	}

	public String getEmpNumber() {
		// TODO Auto-generated method stub
		return empNumber;
	}

}
