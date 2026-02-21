package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class codechef {
    public static void main(String args[]) {
    	WebDriver d = new ChromeDriver();
    	d.get("https://www.codechef.com/practice#programming-languages");
    	d.findElement(By.linkText("SQL Practice")).click();
    }
}
