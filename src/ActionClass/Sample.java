package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		
		driver.findElement(By.xpath("//input[@id='user-number']")).sendKeys("9090909090");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email_id']")).sendKeys("abc12@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='irtct-acc-detail']")).click();
		Thread.sleep(2000);
		
		 WebElement dropdown = driver.findElement(By.xpath("//button[normalize-space(text())='Select Occupation']"));
		 Actions a = new Actions(driver);
		 a.moveToElement(dropdown).click().build().perform();
		 for(int i=0;i<=4;i++)
		 {
			 Thread.sleep(2000);
			 a.sendKeys(Keys.DOWN).build().perform();
		 }
		 
		 a.sendKeys(Keys.ENTER).build().perform();
		 Thread.sleep(2000);
		 driver.close();


	}

}
