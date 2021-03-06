package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PatientTest {
	@Test
	public void shouldBeAbleToAddHealth() {
		Patient patient = new Patient();

		patient.giveHealth(10);
		int currentHealth = patient.getHealth();
		assertThat(Patient.DEFAULT_HEALTH + 10, is(currentHealth));
	}
}