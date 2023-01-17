package SelectMethod;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelectDays {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		
		WebElement day = driver.findElement(By.xpath("//select[@name='date_day']"));
		
		Select s1 = new Select(day);
		
		java.util.List<WebElement> alldays = s1.getOptions();
		
		for(int i=0;i<alldays.size();i++)
			System.out.println(alldays.get(i).getText());
		
		
		driver.close();


	}

}
