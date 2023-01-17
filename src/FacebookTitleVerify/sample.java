package FacebookTitleVerify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String expTitle = "Facebook";
		String actTitle = driver.getTitle();
		
		if(expTitle.equals(actTitle))
			System.out.println("test case pass");
		else
			System.out.println("test case failed");
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println("currentUrl = " + currentUrl);
		System.out.println("actual title = " + actTitle);
		
		driver.close();

	}

}
