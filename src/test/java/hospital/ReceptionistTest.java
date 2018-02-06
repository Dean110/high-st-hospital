package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReceptionistTest {
	@Test
	public void shouldHaveASalary() {
		Employee underTest = new Receptionist();
		int salary = underTest.getSalary();
		assertThat(salary, is(45000));
	}

	@Test
	public void shouldBeAnsweringPhones() {
		Receptionist underTest = new Receptionist();
		underTest.answeringPhones();
		assertThat(underTest.areTheyAnsweringPhones(), is(true));
	}
}
