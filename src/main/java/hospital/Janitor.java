package hospital;

public class Janitor extends Employee {
	boolean isSweeping;

	@Override
	public int getSalary() {

		return 40000;
	}

	public boolean areTheySweeping() {
		// TODO Auto-generated method stub
		return isSweeping;
	}

	public void sweep() {
		isSweeping = true;
	}

}
