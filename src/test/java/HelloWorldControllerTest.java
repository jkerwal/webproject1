import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HelloWorldControllerTest {

	@Test
	public void test() {
		
		assertTrue(true);
	}

	

	@Test
	public void testAppStarted() {

	    WebDriver driver = new HtmlUnitDriver();
	    driver.get("http://localhost:8081/HelloWorld/");
	    // Check that the login page is shown
	    assertEquals("Spring 4 MVC - HelloWorld Index Page", driver.getTitle());
	}

}
