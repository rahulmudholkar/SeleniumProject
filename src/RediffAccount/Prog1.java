package RediffAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		driver.findElement(By.tagName("input")).sendKeys("rahul");
		Thread.sleep(5000);
		driver.findElement(By.id("emailid")).sendKeys("rahul.mudholkar@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("rahul123");
		Thread.sleep(2000);
	    driver.findElement(By.name("repass")).sendKeys("rahul123");
	    Thread.sleep(2000);
	    driver.findElement(By.id("sex")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("date_day")).sendKeys("07");
	    Thread.sleep(2000);
	    driver.findElement(By.name("date_mon")).sendKeys("may");
	    Thread.sleep(2000);
	    driver.findElement(By.name("Date_Year")).sendKeys("1992");
	    Thread.sleep(2000);
	    driver.findElement(By.name("city")).sendKeys("mumbai");
	    Thread.sleep(2000);
	    driver.findElement(By.name("school")).sendKeys("dnyanmata high school");
	    Thread.sleep(2000);
	    driver.findElement(By.name("college")).sendKeys("govt.engg.college.amravati");
	    Thread.sleep(2000);
		driver.close();
		

	}

}
