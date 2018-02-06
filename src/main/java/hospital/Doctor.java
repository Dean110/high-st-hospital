package hospital;

public class Doctor extends Employee implements MedicalDuties {
	private String empNumber;
	private String empName;

	public Doctor(String empNumber, String empName) {
		this.empNumber = empNumber;
		this.empName = empName;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drawBlood(Bleedable patient) {
		patient.removeBlood(1);
	}

	@Override
	public void administerCare(Patient patient) {
		patient.giveHealth(10);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return empName;
	}

	@Override
	public int getSalary() {

		return 90000;
	}

	public String getEmpNumber() {
		// TODO Auto-generated method stub
		return empNumber;
	}

}
