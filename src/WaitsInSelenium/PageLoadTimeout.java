package WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeout {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	  //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
	  //when you take 2 seconds then there will be timeout exception.	
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.close();
	}

}
