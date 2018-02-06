package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoctorTest {

	private static final String BOB = "Bob";
	Doctor underTest = new Doctor("1111", BOB);

	@Test
	public void shouldDrawBlood() {

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

		Bleedable patient = new BleedableDouble();

		underTest.drawBlood(patient);
		assertThat(wasBled, is(true));
	}

	@Test
	public void shouldHaveASalary() {

		int salary = underTest.getSalary();
		assertThat(salary, is(90000));
	}

	@Test
	public void shouldCareForPatients() {

		Patient patient = new Patient();
		int healthBefore = patient.getHealth();
		underTest.administerCare(patient);
		int healthAfter = patient.getHealth();

		assertThat(healthAfter - healthBefore, is(10));
	}

	@Test
	public void shouldHaveEmployeeNumber() {
		String check = underTest.getEmpNumber();
		assertThat(check, is("1111"));
	}

	@Test
	public void shouldHaveAName() {

		String name = underTest.getName();
		assertThat(name, is(BOB));
	}

	@Test
	public void shouldBeASurgeon() {
		Doctor underTest2 = new Surgeon("1111", "Phil", true);
	}
}
