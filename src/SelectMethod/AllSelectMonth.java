package SelectMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelectMonth {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		
		WebElement months = driver.findElement(By.xpath("//select[@name='date_mon']"));
		
		Select s1 = new Select(months);
		 List<WebElement> allMonths = s1.getOptions();
		
		for(int j=0;j<allMonths.size();j++)
			System.out.println(allMonths.get(j).getText());
		
		
		driver.close();


	}

}
