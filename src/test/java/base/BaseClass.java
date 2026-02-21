package base;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public WebDriver driver;

@BeforeClass
public void setup() {
	driver = new ChromeDriver();
	driver.get("");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@AfterClass
public void tearDown() {
	driver.quit();
}
}
