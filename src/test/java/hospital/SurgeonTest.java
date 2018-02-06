package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SurgeonTest {

	@Test
	public void shouldShowifSurgeonIsOperating() {
		Surgeon underTest = new Surgeon("1111", "Phil", true);
		assertThat(underTest.getIsOperating(), is(true));
	}

	@Test
	public void shouldShowIfSurgeonIsNotOperating() {
		Surgeon underTest = new Surgeon("1111", "Phil", false);
		assertThat(underTest.getIsOperating(), is(false));
	}

	// @Test
	// public void shouldHaveASalary() {
	// assertThat(underTest.getSalary(), is(120000));
	// }

}
