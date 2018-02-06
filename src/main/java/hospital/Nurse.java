package hospital;

public class Nurse extends Employee {

	public void drawBlood(Bleedable patient) {
		// TODO Auto-generated method stub
		patient.removeBlood(1);
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return 50000;
	}

}
