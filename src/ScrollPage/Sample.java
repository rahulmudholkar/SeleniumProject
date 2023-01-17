package ScrollPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws Exception {
		

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement katraj = driver.findElement(By.xpath("//strong[text()='Katraj Branch']"));
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
	    //js.executeScript("window.scrollBy(0,1000)");
		//js.executeScript("window.scrollTo(0, document.body.scrollHight)" );
		js.executeScript("arguments[0].scrollIntoView();",katraj);
		Thread.sleep(5000);
		
		driver.close();

	}

}
