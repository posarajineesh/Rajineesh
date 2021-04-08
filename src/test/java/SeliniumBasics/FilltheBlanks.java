package SeliniumBasics;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FilltheBlanks {
static {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	
}
public static void main(String[]args) {
	WebDriver driver =new ChromeDriver();
	driver.get("http://demo.guru99.com/test/newtours/register.php");
	driver.findElement(By.linkText("REGISTER")).click();
	driver.findElement(By.name("firstName")).sendKeys("Rajineesh");
	driver.findElement(By.name("lastName")).sendKeys("Posa");
	driver.findElement(By.name("phone")).sendKeys("9652767305");
	driver.findElement(By.id("userName")).sendKeys("posarajineesh@yahoo.com");
	driver.findElement(By.xpath("//input[@size=\"40\"]")).sendKeys("chairmain street");
	driver.findElement(By.name("city")).sendKeys("Kadiri");
	driver.findElement(By.name("state")).sendKeys("Andhra Pradesh");
	driver.findElement(By.name("postalCode")).sendKeys("515591");
	WebElement cn = driver.findElement(By.name("country")); 
	Select f=new Select(cn);
List<WebElement> options = f.getOptions();
for( WebElement in:options)
{
	String text = in.getText();
	//System.out.println(text);
	if(text.contains("INDIA"))
	{
		in.click();
	}
}

	
	
}
}
