package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class sample {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		
		File source = (File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		
		File destination = new File("C:\\Users\\Aspire\\eclipse-workspace\\SeleniumProject\\Screenshot/photo.jpeg");
		FileHandler.copy(source, destination);
		Thread.sleep(5000);
		driver.close();

	}

}
