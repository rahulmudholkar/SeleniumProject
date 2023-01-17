package SelectMultipleDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrom.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult"); //not covered yet.
		WebElement car = driver.findElement(By.xpath("//select[@id='cars']"));
		
		Select s = new Select(car);
		System.out.println(s.isMultiple());
		
		s.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		s.selectByVisibleText("Audi");
		Thread.sleep(2000);
		s.selectByVisibleText("Saab");
		Thread.sleep(2000);
		s.deselectByVisibleText("Audi");
		Thread.sleep(2000);
		s.deselectByVisibleText("Volvo");
		Thread.sleep(2000);
		
		driver.close();


	}

}
