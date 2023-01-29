package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonUtilities {

	// This is common method for drop down handling
	public static void dropdwonHandle(WebElement dropdwonXpath, int dropdwonValue) {

		Select s = new Select(dropdwonXpath);
		s.selectByIndex(dropdwonValue);

	}

	public static void AssertionHandling(String Actual, String Expected) {
		SoftAssert assertion = new SoftAssert();
		assertion.assertEquals(Actual, Expected);

		assertion.assertAll(); // This is mandatory

	}

}
