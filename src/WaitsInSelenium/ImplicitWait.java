package WaitsInSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) throws Exception {
	
		//imp note:-the difference between thread sleep wait and implicit wait is that thread sleep will take
		//the time given in thread method means Thread.sleep(3000) it will take correct 3 seconds but
		//implicite wait does not take the exact time given inside method,it will execute as per the script
		//eventhough you give 1000 seconds but if page loaded in 10 seconds then it will take only 10 seconds.

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("seleni");
		//Thread.sleep(1000);
		
		List<WebElement> autoSugEle = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for(int i=0;i<autoSugEle.size();i++)
			System.out.println(autoSugEle.get(i).getText());
		
		for(int i=0;i<autoSugEle.size();i++)
		{
			if(autoSugEle.get(i).getText().equals("selenium webdriver"))
			{
				autoSugEle.get(i).click();
				break;
			}
		}
		
		Thread.sleep(5000);
		driver.close();

	}

}
