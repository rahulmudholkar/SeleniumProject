package RediffGetText;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		
		WebElement newUserLabel = driver.findElement(By.xpath("//b[text()='New User? Register here']"));
		WebElement tellUsLabel = driver.findElement(By.xpath("//p[@class='grey1']"));
		
		System.out.println("Label 1 = " + newUserLabel.getText());
		System.out.println("Label 2 = " + tellUsLabel.getText());
		
		driver.close();


	}

}
