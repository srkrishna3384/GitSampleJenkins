package maven.demo.SampleMavenProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDemo {
	@Test
public static void m1() {
	System.out.println("TestDemo class");
	System.setProperty("webdriver.chrome.driver", "D:\\SampleMavenProj\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser launched successfully.........");
	driver.get("https://www.gmail.com");
	System.out.println("Navigated Gmail Page...........");
}
}
