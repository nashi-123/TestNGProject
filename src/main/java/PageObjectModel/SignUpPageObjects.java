package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
	public WebDriver driver;

	// driver.findElement(By.xpath(""))
	// We have achieve Encapsulation here
	private By firstName = By.xpath("//input[@name='UserFirstName']");
	private By Lastname = By.xpath("//input[@name='UserLastName']");
	private By WorkEmail = By.xpath("//input[@name='UserEmail']");
	private By JobTitle = By.xpath("//select[@name='UserTitle']");
	private By Company = By.xpath("//input[@name='CompanyName']");
	private By Employees = By.xpath("//select[@name='CompanyEmployees']");
	private By Phone = By.xpath("//input[@name='UserPhone']");
	private By Country = By.xpath("//select[@name='CompanyCountry']");

	public SignUpPageObjects(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement EnterFirstName() {

		return driver.findElement(firstName);

	}

	public WebElement EnterLastName() {

		return driver.findElement(Lastname);

	}

	public WebElement EnterWorkEmail() {

		return driver.findElement(WorkEmail);

	}

	public WebElement SelectJobTitle() {

		return driver.findElement(JobTitle);

	}

	public WebElement EnterCompanyName() {

		return driver.findElement(Company);

	}

	public WebElement SelectEmployees() {

		return driver.findElement(Employees);

	}

	public WebElement EnterPhoneNumber() {

		return driver.findElement(Phone);

	}

	public WebElement SelectCountry() {

		return driver.findElement(Country);

	}

}
