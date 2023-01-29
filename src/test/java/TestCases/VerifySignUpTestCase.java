package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LogInPageObjects;
import PageObjectModel.SignUpPageObjects;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.TestCaseData;

public class VerifySignUpTestCase extends BaseClass {

	@Test
	public void SignUp() throws IOException, InterruptedException {

		LogInPageObjects lpo = new LogInPageObjects(driver);
		lpo.ClickOnTryForFree().click();

		Thread.sleep(5000);
		
		
		String ActualTitle= driver.getTitle();
		String ExpectedTitle=TestCaseData.ExpectedTitle;
		
		CommonUtilities.AssertionHandling(ActualTitle, ExpectedTitle);

		SignUpPageObjects spo = new SignUpPageObjects(driver);
		spo.EnterFirstName().sendKeys(TestCaseData.firstName);
		spo.EnterLastName().sendKeys(TestCaseData.LastName);
		spo.EnterWorkEmail().sendKeys(TestCaseData.WorkEmail);

		CommonUtilities.dropdwonHandle(spo.SelectJobTitle(), 8);

		spo.EnterCompanyName().sendKeys(TestCaseData.CompanyName);

		CommonUtilities.dropdwonHandle(spo.SelectEmployees(), 3);

		spo.EnterPhoneNumber().sendKeys(TestCaseData.Phone);

		CommonUtilities.dropdwonHandle(spo.SelectCountry(), 0);

	}
}
