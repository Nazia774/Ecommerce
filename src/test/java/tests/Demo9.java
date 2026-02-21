package tests;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo9 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/text-box");
		List<WebElement> w = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement x : w) {
			x.click();
		}
			
		driver.quit(); 
	}
}
