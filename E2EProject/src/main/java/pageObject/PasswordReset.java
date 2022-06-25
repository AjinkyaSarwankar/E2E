package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PasswordReset {
	private By email =By.cssSelector(".m-b-3-xs input[type='email']");
	private By next=By.cssSelector("input[type='submit']");
	
	public WebElement getEmail(WebDriver driver) {
		return driver.findElement(email);
	}
	public WebElement getNext(WebDriver driver) {
		return driver.findElement(next);
	}

}
