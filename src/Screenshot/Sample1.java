package Screenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sample1 {
	
	static WebDriver driver;
	//here we are creating driver as a global variable coz before driver is local variable coz it is
	//inside main method and main method is static hence we have to make driver as a static.
	
	public static void captureCompleteScreenshot() throws Exception
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("C:\\\\Users\\\\Aspire\\\\eclipse-workspace\\\\SeleniumProject\\\\Screenshot/photo1.jpeg");
		FileHandler.copy(source, Dest);
}
	
	 public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googinprimeexpt5-21&ascsubtag=_k_Cj0KCQiAkMGcBhCSARIsAIW6d0CgfhqwPwfZuyyjvwkmW4hpBiJr49AWnRNgoRI4hdECCZ3yFn7MoSsaAhkzEALw_wcB_k_&gclid=Cj0KCQiAkMGcBhCSARIsAIW6d0CgfhqwPwfZuyyjvwkmW4hpBiJr49AWnRNgoRI4hdECCZ3yFn7MoSsaAhkzEALw_wcB");
		driver.manage().window().maximize();
		
		captureCompleteScreenshot();
		
		driver.close();
		
		
	}

}
