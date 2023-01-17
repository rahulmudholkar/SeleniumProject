package RediffAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByXpath {

	public static void main(String[] args) throws Exception {
		

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys("Rahul Mudholkar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("rahul.smudholar@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("admin@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='repass']")).sendKeys("admin@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='m']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='date_day']")).sendKeys("07");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='date_mon']")).sendKeys("may");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='Date_Year']")).sendKeys("1992");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Amravati");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='school']")).sendKeys("Dnyanmata High School");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='college']")).sendKeys("Govt College Of Engineering Amravati");
		Thread.sleep(2000);
		driver.close();
		

	}

}
