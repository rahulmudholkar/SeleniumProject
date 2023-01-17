package HandleWebtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/index.html");
		
		List<WebElement> tableRow = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul"));
		
		for(int i=0;i<tableRow.size();i++)
			System.out.println(tableRow.get(i).getText());
		
		driver.close();
	}

}
