package hospital;

public class Patient implements Bleedable {
	static final int DEFAULT_BLOODS = 42;
	static final int DEFAULT_HEALTH = 10;
	private int bloods = DEFAULT_BLOODS;
	private int health = DEFAULT_HEALTH;

	public Patient(int bloods) {

	}

	public Patient() {
		// TODO Auto-generated constructor stub
	}

	public int getBloods() {

		return bloods;
	}

	public void removeBlood(int amount) {
		bloods -= amount;

	}

	public int getHealth() {
		// TODO Auto-generated method stub
		return health;
	}

	public void giveHealth(int care) {
		this.health += care;
	}

}
