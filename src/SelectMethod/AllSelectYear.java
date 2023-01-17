package SelectMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelectYear {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		
		WebElement year = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		
		Select s1 = new Select(year);
		 List<WebElement> allYear = s1.getOptions();
		
		for(int i=0;i<allYear.size();i++)
			System.out.println(allYear.get(i).getText());
		
		driver.close();


	}

}
