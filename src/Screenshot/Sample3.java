package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample3 {
	
	static WebDriver driver;
	
	public static void fullPageScreenshot() throws Exception
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googinprimeexpt5-21&ascsubtag=_k_Cj0KCQiAkMGcBhCSARIsAIW6d0CgfhqwPwfZuyyjvwkmW4hpBiJr49AWnRNgoRI4hdECCZ3yFn7MoSsaAhkzEALw_wcB_k_&gclid=Cj0KCQiAkMGcBhCSARIsAIW6d0CgfhqwPwfZuyyjvwkmW4hpBiJr49AWnRNgoRI4hdECCZ3yFn7MoSsaAhkzEALw_wcB");
		driver.manage().window().maximize();
		File source = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		File Dest = new File("C:\\Users\\Aspire\\eclipse-workspace\\SeleniumProject\\Screenshot\\photo3.jpeg");
		FileHandler.copy(source, Dest);
		driver.quit();
	}

	public static void main(String[] args) throws Exception {
		
		fullPageScreenshot();
		
		
		
		
		

	}

}
