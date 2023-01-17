package SelectMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		
		WebElement day = driver.findElement(By.xpath("//select[@name='date_day']"));
		WebElement month = driver.findElement(By.xpath("//select[@name='date_mon']"));
		WebElement year = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		
		Select s1 = new Select(day);
		s1.selectByIndex(2);
		Thread.sleep(2000);
		s1.selectByValue("09");    // it is only use when value attribute is available in html code...
		Thread.sleep(2000);
		s1.selectByVisibleText("07");
		Thread.sleep(2000);
		
		Select s2 = new Select(month);
		s2.selectByVisibleText("MAY");
		Thread.sleep(2000);
		
		Select s3 = new Select(year);
		s3.selectByVisibleText("1992");
		Thread.sleep(5000);
		
		driver.close();


	}

}
