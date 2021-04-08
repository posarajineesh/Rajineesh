package SeliniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectRadioButton {
	static
	{
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	}
	public static void main(String[]args) {
		
	WebDriver driver=new ChromeDriver();
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
	List<WebElement> elements = driver.findElements(By.xpath("//input[@name='lang' and @type='checkbox']"));
	for(WebElement n:elements)
	{
		String attribute = n.getAttribute("id");
		System.out.println(attribute);
		if(attribute.equalsIgnoreCase("Code"))
		{
			n.click();
}
		
	}
		
	}
	

			
	

}
