package TestNGpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert2 {

	@Test
	public void method1() {

		String Expected = "Selenium";
		String Actual = "Selenium Test";

		// Assert not equals

		Assert.assertNotEquals(Expected, Actual);
	}

	@Test
	public void method2() {

		String Actlrsl = null;
		// Assert.assertNotNull(Actlrsl);
		Assert.assertNull(Actlrsl);

	}

}
