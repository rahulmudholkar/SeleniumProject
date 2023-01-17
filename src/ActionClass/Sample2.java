package ActionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightClickMeBtn = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement doubleClickBtn = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(rightClickMeBtn).contextClick().build().perform();
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		
		Alert d = driver.switchTo().alert();
		Thread.sleep(1000);
		d.accept();
		
		Actions b = new Actions(driver);
		b.moveToElement(doubleClickBtn).doubleClick().build().perform();
		
		Alert c = driver.switchTo().alert();
		Thread.sleep(1000);
		c.accept();
		
		driver.close();

	}

}
