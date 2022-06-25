package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private By email =By.id("email");
	private By password=By.id("password");
	private By submit= By.name("commit");
	private By forgotPassword= By.cssSelector("a[class='bodySmall form-footer']");
	
	public WebElement getEmail(WebDriver driver) {
		return driver.findElement(email);
	}
	public WebElement getPassword(WebDriver driver) {
		return driver.findElement(password);
	}
	public WebElement getSubmit(WebDriver driver) {
		return driver.findElement(submit);
	}
	public WebDriver ForgotPassword(WebDriver driver) {
		driver.findElement(forgotPassword).click();
		return driver;
	}
	
	

}
