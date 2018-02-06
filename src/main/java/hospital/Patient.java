package hospital;

public class Patient implements Bleedable {
	static final int DEFAULT_BLOODS = 42;

	private int bloods = DEFAULT_BLOODS;

	public Patient(int bloods) {

	}

	public int getBloods() {

		return bloods;
	}

	public void removeBlood(int amount) {
		bloods -= amount;

	}

}
