package Demo;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LandingPage;

public class HomeTest extends base{
	public WebDriver driver;
	public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initilize() throws IOException {
		driver=initializeDriver();
		log.info("Initialized Driver");
	}
	@Test
	public void verifyHeader() {
		LandingPage l=new LandingPage();
		Assert.assertEquals(l.getHeader(driver).getText(), "An Academy to Learn Earn & Shine  in your QA Career");
		log.info("Successfully validated title");
	}
	@Test
	public void verifySectionHeader() {
		LandingPage l=new LandingPage();
		Assert.assertEquals(l.getSectionHeader(driver).getText(), "Featured Courses ");
		log.info("Successfully validated section title");
	}
	@AfterTest
	public void closeWindow()
	{
		driver.close();
		log.info("Window Closed");
	}

}
