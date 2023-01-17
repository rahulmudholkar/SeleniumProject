import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sample2 {
	
	static WebDriver driver;
	
	public static void captureLogoScreenshot() throws Exception
	{
		WebElement amazonLogo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		File source = amazonLogo.getScreenshotAs(OutputType.FILE);
		File Dest = new File("C:\\Users\\Aspire\\eclipse-workspace\\SeleniumProject\\Screenshot\\photo2.jpeg");
		FileHandler.copy(source, Dest);
	}

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googinprimeexpt5-21&ascsubtag=_k_Cj0KCQiAkMGcBhCSARIsAIW6d0CgfhqwPwfZuyyjvwkmW4hpBiJr49AWnRNgoRI4hdECCZ3yFn7MoSsaAhkzEALw_wcB_k_&gclid=Cj0KCQiAkMGcBhCSARIsAIW6d0CgfhqwPwfZuyyjvwkmW4hpBiJr49AWnRNgoRI4hdECCZ3yFn7MoSsaAhkzEALw_wcB");
		driver.manage().window().maximize();
		

	}

}
