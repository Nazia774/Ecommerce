package tests;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://onlinefeestechnocrats.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());Thread.sleep(7000);
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
//		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
	
	}
}
