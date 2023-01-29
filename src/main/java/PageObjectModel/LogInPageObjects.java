package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPageObjects {

	// This driver don't have scope
	public WebDriver driver;

	// driver.findElement(By.xpath(""))
	// We have achieve Encapsulation here
	private By username = By.xpath("//input[@id='username']");
	private By password = By.xpath("//input[@id='password']");
	private By LoginButton = By.xpath("//input[@id='Login']");
	private By tryForFree = By.xpath("//a[@id='signup_link']");

	public LogInPageObjects(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement EnterUsername() {

		return driver.findElement(username);

	}

	public WebElement EnterPassword() {

		return driver.findElement(password);

	}

	public WebElement ClickLogin() {

		return driver.findElement(LoginButton);

	}

	public WebElement ClickOnTryForFree() {

		return driver.findElement(tryForFree);

	}

}
