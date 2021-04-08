package SeliniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectPrint {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/newtours/");
	driver.findElement(By.linkText("REGISTER")).click();
	/*WebElement cl = driver.findElement(By.name("country"));
	Select s=new Select(cl);
	List<WebElement> counames = s.getOptions();
	for(WebElement cn:counames)
	{
		String text = cn.getText();
		System.out.println(text);
	}*/
	List<WebElement> couna = driver.findElements(By.name("country"));
	for(WebElement a:couna)
	{
		System.out.println(a.getText());
	}
}
}
