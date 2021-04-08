package SeliniumBasics;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectMale {
	static
	{
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	}
	public static void main(String[]args) {
		
	WebDriver driver=new ChromeDriver();
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
	WebElement female = driver.findElement(By.id("female"));
	int x = female.getLocation().getX();
	int y = female.getLocation().getY();
	System.out.println(x);
	System.out.println(y);
}
}