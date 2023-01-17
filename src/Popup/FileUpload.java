package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://cgi-lib.berkeley.edu/ex/fup.html");
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Aspire\\Desktop\\new\\rahul1111.txt");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		//file uploading only possible when (type = file) present in html code.
		
		driver.close();

	}

}
