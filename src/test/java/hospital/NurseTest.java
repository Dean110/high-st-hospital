package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NurseTest {
	private static final String BOB = "Bob";

	@Test
	public void shouldDrawBlood() {
		Nurse underTest = new Nurse("", "");
		Patient patient = new Patient(256);

		int bloodsBefore = patient.getBloods();
		underTest.drawBlood(patient);

		int bloodsAfter = patient.getBloods();

		assertThat(bloodsBefore - bloodsAfter, is(1));
	}

	boolean wasBled = false;

	public class BleedableDouble implements Bleedable {

		@Override
		public void removeBlood(int amount) {
			wasBled = true;
		}

	}

	@Test
	public void shouldDrawBloodFromTestDouble() {
		Nurse underTest = new Nurse("", "");
		Bleedable patient = new BleedableDouble();

		underTest.drawBlood(patient);
		assertThat(wasBled, is(true));
	}

	@Test
	public void shouldHaveASalary() {
		Employee underTest = new Nurse("", "");
		int salary = underTest.getSalary();
		assertThat(salary, is(50000));
	}

	@Test
	public void shouldCareForPatients() {
		Nurse underTest = new Nurse("", "");
		Patient patient = new Patient();
		int healthBefore = patient.getHealth();
		underTest.administerCare(patient);
		int healthAfter = patient.getHealth();

		assertThat(healthAfter - healthBefore, is(5));
	}

	// @Test
	// public void shouldHaveAName() {
	// Employee underTest = new Nurse();
	// String name = underTest.getName();
	// assertThat(name, is(BOB));
	// }

}
