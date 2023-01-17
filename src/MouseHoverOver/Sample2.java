package MouseHoverOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample2 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/ ");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		WebElement logInBtn = driver.findElement(By.xpath("//a[text()='Login']"));
		Actions a = new Actions(driver);
		a.moveToElement(logInBtn).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Gift Cards']")).click();
		Thread.sleep(2000);
		
		driver.close();


	}

}
