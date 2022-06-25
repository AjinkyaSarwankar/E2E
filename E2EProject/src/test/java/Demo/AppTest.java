package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

public class AppTest extends base{
	public static Logger log =LogManager.getLogger(base.class.getName());
  @Test
  public void shouldAnswerWithTrue() throws IOException {
	   WebDriver driver= initializeDriver();
	   System.out.println(driver.getTitle());
	   log.info("Successfully validated Page Title");
    assertTrue(true);
  }
}
