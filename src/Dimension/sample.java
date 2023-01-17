package Dimension;

import java.awt.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		
		
		
		Thread.sleep(2000);
		Point p = new Point(50,200);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		driver.close();

	}

}
