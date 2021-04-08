package SeliniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClassinmvn {
static
{
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");

}
public static void main(String[]args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("porajanish1995@gmail.com");
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	driver.findElement(By.name("password")).sendKeys("Chinnu.1995");
	
}
}
