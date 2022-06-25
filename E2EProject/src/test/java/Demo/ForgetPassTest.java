package Demo;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import pageObject.PasswordReset;

public class ForgetPassTest extends base{
	private WebDriver driver;
	public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initilize() throws IOException {
		driver=initializeDriver();
		log.info("Initialized Driver");
	}
	@Test
	public void validateForgotPassword() {
		LandingPage l=new LandingPage();
		l.doLogin(driver);
		LoginPage lp= new LoginPage();
		lp.ForgotPassword(driver);
		PasswordReset pr= new PasswordReset();
		pr.getEmail(driver).sendKeys("admin@gmail.com");
		pr.getNext(driver).click();
		log.info("Successfully validated Forget password");
	}
	
	@AfterTest
	public void closeWindow()
	{
		driver.close();
		log.info("Window Closed");
	}


}
