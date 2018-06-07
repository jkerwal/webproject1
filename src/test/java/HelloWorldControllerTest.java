import static org.junit.Assert.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HelloWorldControllerTest {

	@Test
	public void test() {
		
		assertTrue(true);
	}

	

	@Test
	public void testAppStarted() throws IOException {
	    String content = new String(Files.readAllBytes(Paths.get("/var/lib/jenkins/ec2_ip.txt")));
	    System.out.println("Test IP Address: "+content);
	    WebDriver driver = new HtmlUnitDriver();
	    driver.get("http://"+content.trim()+":8080/HelloWorld/");
	    // Check that the login page is shown
	    assertEquals("Spring 4 MVC - HelloWorld Index Page", driver.getTitle());
	}

}
