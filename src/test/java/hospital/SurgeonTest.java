package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SurgeonTest {
	Surgeon underTest = new Surgeon("1111", "Phil", true);

	@Test
	public void shouldShowifSurgeonIsOperating() {
		assertThat(underTest.getIsOperating(), is(true));
	}

	@Test
	public void shouldHaveASalary() {
		assertThat(underTest.getSalary(), is(120000));
	}

}
