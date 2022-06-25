package Demo;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import pageObject.LandingPage;
import pageObject.LoginPage;

public class AuthenticationTest extends base{
	private WebDriver driver;
	public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeMethod
	public void initilize() throws IOException {
		driver=initializeDriver();
		log.info("Initialized Driver");
		
	}
	
	@Test(dataProvider="getData")
	public void validateLogin(String email, String pass, String type) {
		LandingPage l=new LandingPage();
		l.doLogin(driver);
		LoginPage lp= new LoginPage();
		lp.getEmail(driver).sendKeys(email);
		lp.getPassword(driver).sendKeys(pass);
		//System.out.println(type);
		log.info(type);
		lp.getSubmit(driver).click();
		log.info("Successfully validated Login");
	}
	@DataProvider
	public Object[][] getData() {
		Object [][]data= new Object[2][3];
		data[0][0]="admin@gmail.com";
		data[0][1]="admin";
		data[0][2]="Restricted User";
		data[1][0]="superAdmin@gmail.com";
		data[1][1]="superAdmin";
		data[1][2]="Unrestricted User";
		return data;
	}
	@AfterMethod
	public void closeWindow()
	{
		driver.close();
		log.info("Window Closed");
	}

}
