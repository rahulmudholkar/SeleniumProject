package DisabledEnabledSelected;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait");
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("//button[@id='disable']"));
		
		System.out.println(button.isDisplayed());
		System.out.println(button.isEnabled());
		System.out.println(button.isSelected());
		
		driver.findElement(By.xpath("//button[@id='enable-button']")).click();;
		Thread.sleep(10000);
		System.out.println("*******************");
		System.out.println(button.isDisplayed());
		System.out.println(button.isEnabled());
		System.out.println(button.isSelected());
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("*******************");
		System.out.println(checkBox.isSelected());
		
		driver.findElement(By.xpath("//button[@id='checkbox']")).click();
		Thread.sleep(10000);
		System.out.println("********************");
		System.out.println(checkBox.isSelected());
		
		
		
		driver.close();
		


	}

}
