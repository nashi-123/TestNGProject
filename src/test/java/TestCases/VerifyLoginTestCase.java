package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import PageObjectModel.LogInPageObjects;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.TestCaseData;

public class VerifyLoginTestCase extends BaseClass {

	// We have achieve inheritance here

	@Test
	public void login() throws IOException {

		LogInPageObjects lpo = new LogInPageObjects(driver);

		lpo.EnterUsername().sendKeys(TestCaseData.username);
		lpo.EnterPassword().sendKeys(TestCaseData.password);
		lpo.ClickLogin().click();

		String Expected = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";

		String Actual = driver.findElement(By.xpath("//div[@id='error']")).getText();

		CommonUtilities.AssertionHandling(Actual, Expected);
	}
}
