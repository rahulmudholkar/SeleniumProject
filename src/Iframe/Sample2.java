package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@name='s'])[1]")).sendKeys("Rahul");
		
		driver.switchTo().frame("globalSqa");
		
		driver.findElement(By.xpath("(//header[@style='margin-top: 0px;']//div//form//input[@name='s'])")).sendKeys("Rahul");

		driver.close();
	}

}
