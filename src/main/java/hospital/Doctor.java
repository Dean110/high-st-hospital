package hospital;

public class Doctor extends Employee {

	public void drawBlood(Bleedable patient) {
		patient.removeBlood(1);
	}

	public int getSalary() {
		// TODO Auto-generated method stub
		return 90000;
	}

}
