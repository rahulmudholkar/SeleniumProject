package parametrorization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		
		
		
		WebElement fullNameTextbox = driver.findElement(By.xpath("//input[@name='fullname']"));
		WebElement emailtextbox = driver.findElement(By.xpath("//input[@name='emailid']"));
		WebElement passwordTextbox = driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement repassTextbox = driver.findElement(By.xpath("//input[@name='repass']"));
		WebElement radioButton = driver.findElement(By.xpath("//input[@value='m']"));
		WebElement dateDropdown = driver.findElement(By.xpath("//select[@name='date_day']"));
		WebElement monthDropdown = driver.findElement(By.xpath("//select[@name='date_mon']"));
		WebElement yearDropdown = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		WebElement locationTextbox = driver.findElement(By.xpath("//input[@name='city']"));
		WebElement schoolTextbox = driver.findElement(By.xpath("//input[@name='school']"));
		WebElement collegeTextbox = driver.findElement(By.xpath("//input[@name='college']"));
		WebElement captchaTextbox = driver.findElement(By.xpath("//input[@name='fld_captcha']"));
		WebElement signupButton = driver.findElement(By.xpath("//input[@value='Sign up']"));
		
		FileInputStream file = new FileInputStream("C:\\Users\\Aspire\\eclipse-workspace\\SeleniumProject\\TestData\\Book1.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
//		String value1 = excel.getRow(0).getCell(0).getStringCellValue();
//		System.out.println(value1);
//		String value2 = excel.getRow(0).getCell(1).getStringCellValue();
//		System.out.println(value2);
		
		fullNameTextbox.sendKeys(excel.getRow(0).getCell(0).getStringCellValue());
		emailtextbox.sendKeys(excel.getRow(0).getCell(1).getStringCellValue());
		passwordTextbox.sendKeys(excel.getRow(0).getCell(2).getStringCellValue());
		repassTextbox.sendKeys(excel.getRow(0).getCell(3).getStringCellValue());
		radioButton.click();
		Select s1 = new Select(dateDropdown);
		s1.selectByVisibleText(excel.getRow(0).getCell(4).getStringCellValue());
		Select s2 = new Select(monthDropdown);
		s2.selectByVisibleText(excel.getRow(0).getCell(5).getStringCellValue());
		Select s3 = new Select(yearDropdown);
		s3.selectByVisibleText(excel.getRow(0).getCell(6).getStringCellValue());
		locationTextbox.sendKeys(excel.getRow(0).getCell(7).getStringCellValue());
		schoolTextbox.sendKeys(excel.getRow(0).getCell(8).getStringCellValue());
		collegeTextbox.sendKeys(excel.getRow(0).getCell(9).getStringCellValue());
		captchaTextbox.sendKeys(excel.getRow(0).getCell(10).getStringCellValue());
		signupButton.click();
		
		
		driver.close();

	}

}
