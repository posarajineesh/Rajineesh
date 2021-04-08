package SeliniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelSelectPrac {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/MS%20TechCare/Desktop/hotel.html");
		WebElement menu = driver.findElement(By.id("hotel"));
		Select s=new Select(menu);
		s.selectByIndex(1);
		Thread.sleep(3000);
		s.selectByVisibleText("GheeDosa");
		Thread.sleep(3000);
		s.selectByValue("7");
		Thread.sleep(3000);
		s.deselectByVisibleText("idly");
		List<WebElement> options = s.getOptions();
		for( WebElement op:options)
		{
			System.out.println(op.getText());
		}
	}

}
