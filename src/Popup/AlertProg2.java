package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertProg2 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(5000);
		a.accept();
		
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='click the button to display a confirm box']")).click();
		Alert b = driver.switchTo().alert();
		Thread.sleep(2000);
		b.dismiss();
		
		driver.findElement(By.xpath("//a[@href='#Textbox'] ")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='click the button to demonstrate the prompt box']")).click();
		Alert c = driver.switchTo().alert();
		System.out.println(c.getText());
		Thread.sleep(2000);
		c.sendKeys("Rahul");
		c.accept();
		Thread.sleep(2000);
		
		driver.close();


	}

}
