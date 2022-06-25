package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage{
	private By login=By.cssSelector(".theme-btn.register-btn");
	private By header=By.cssSelector(".col-md-6.text-left h2");
	private By sectionHeader= By.cssSelector(".pull-left h2");
	
	public WebDriver doLogin(WebDriver driver) {
		driver.findElement(login).click();
		return driver;
	}
	public WebElement getHeader(WebDriver driver) {
		return driver.findElement(header);
	}
	public WebElement getSectionHeader(WebDriver driver) {
		return driver.findElement(sectionHeader);
	}
	
	
	

}
