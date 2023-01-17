package RediffTitleVerify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://is.rediff.com/signup/register");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		

		String expTitle = "Rediff.com";
		
		String actTitle = driver.getTitle();
		
		//comparing by equals method.
		
		if(expTitle.equals(actTitle))
			System.out.println("Test case pass");
		else
			System.out.println("Test case failed");
		
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println("CurrentUrl = " + CurrentUrl);
		
		System.out.println("ActualTitle = " + actTitle);
		
		driver.close();
		

	}

}
