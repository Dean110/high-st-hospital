package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class JanitorTest {
	@Test
	public void shouldHaveASalary() {
		Employee underTest = new Janitor();
		int salary = underTest.getSalary();
		assertThat(salary, is(40000));
	}

	@Test
	public void shouldBeSweeping() {
		Janitor underTest = new Janitor();
		underTest.sweep();
		assertThat(underTest.areTheySweeping(), is(true));
	}
}
