package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		
		WebElement highTatras1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement highTatras2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement highTatras3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement highTatras4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(highTatras1).clickAndHold().moveToElement(trash).release().build().perform();
		Thread.sleep(2000);
		a.dragAndDrop(highTatras2, trash).build().perform();
		Thread.sleep(2000);
		a.dragAndDrop(highTatras3, trash).build().perform();
		Thread.sleep(2000);
		a.dragAndDrop(highTatras4, trash).build().perform();
		Thread.sleep(2000);
		
		driver.close();


	}

}
