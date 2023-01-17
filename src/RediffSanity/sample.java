package RediffSanity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		WebElement rediffLink = driver.findElement(By.xpath("//a[@title='Rediff.com Home']"));
		WebElement rediffLogo = driver.findElement(By.xpath("//img[@class='halflogo']"));
		WebElement straightLine = driver.findElement(By.xpath("//div[@class='greybar']"));
		WebElement newUserLogo = driver.findElement(By.xpath("//b[text()='New User? Register here']"));
		WebElement tellUsInfo = driver.findElement(By.xpath("//p[@class='grey1']"));
		WebElement yourFullNameLogo = driver.findElement(By.xpath("//div[text()='Your Full name']"));
		WebElement fullNameTextbox = driver.findElement(By.xpath("//input[@name='fullname']"));
		WebElement emailidLogo = driver.findElement(By.xpath("//div[text()='Your current email ID']"));
		WebElement emailidTextbox = driver.findElement(By.xpath("//input[@name='emailid']"));
		WebElement exampleMailLogo = driver.findElement(By.xpath("//p[@class='sm1 grey1']"));
		WebElement newPasswordLogo = driver.findElement(By.xpath("//div[text()='New password']"));
		WebElement newPasswordTextbox = driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement retypePasswordLogo = driver.findElement(By.xpath("//div[text()='Retype password']"));
		WebElement retypePasswoedTextbox = driver.findElement(By.xpath("//input[@name='repass']"));
		WebElement genderLogo = driver.findElement(By.xpath("//div[text()='Gender:']"));
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@value='m']"));
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@value='f']"));
		WebElement dateOfBirthLogo = driver.findElement(By.xpath("//div[text()='Date of Birth']"));
		WebElement birthDayLogo = driver.findElement(By.xpath("//select[@name='date_day']"));
		WebElement birthMonthLogo = driver.findElement(By.xpath("//select[@name='date_mon']"));
		WebElement birthYearLogo = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		WebElement locationLogo = driver.findElement(By.xpath("//div[text()='Location']"));
		WebElement locationTextbox = driver.findElement(By.xpath("//input[@id='signup_city']"));
		WebElement schoolLogo = driver.findElement(By.xpath("//div[text()='School']"));
		WebElement schoolTextbox = driver.findElement(By.xpath("//input[@id='school']"));
		WebElement collegeLogo = driver.findElement(By.xpath("//div[text()='College']"));
		WebElement collegeTextbox = driver.findElement(By.xpath("//input[@id='college']"));
		WebElement captchaImg = driver.findElement(By.xpath("//img[@name='img_captcha']"));
		WebElement captchaCodeLogo = driver.findElement(By.xpath("//div[text()='Enter the code given in the above image']"));
		WebElement captchaCodeTextbox = driver.findElement(By.xpath("//input[@name='fld_captcha']"));
		WebElement signupButton = driver.findElement(By.xpath("//input[@value='Sign up'] "));
		WebElement rediffOnTheNetLogo = driver.findElement(By.xpath("//img[@alt='rediff on the net']"));
		WebElement investerLogo = driver.findElement(By.xpath("//a[text()='Investor Information']"));
		WebElement advertiseLogo = driver.findElement(By.xpath("//a[text()='Advertise with us']"));
		WebElement disclaimerLogo = driver.findElement(By.xpath("//a[text()='Disclaimer']"));
		WebElement policyLogo = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
		WebElement feedbackLogo = driver.findElement(By.xpath("//a[text()='Feedback']"));
		WebElement termsOfUseLogo = driver.findElement(By.xpath("//a[text()='Terms of Use']"));
		
		int count = 0;
		
		if((rediffLink.isDisplayed())==true)
		{
			System.out.println("Rediff Link available");
		    count++;
		}
		else
			System.out.println("Rediff Link not available");
		
		if((rediffLogo.isDisplayed())==true)
		{
			System.out.println("Rediff Logo available");
		    count++;
		}
		else
			System.out.println("Rediff Logo not available");
		
		if((straightLine.isDisplayed())==true)
		{
			System.out.println("Straight Line available");
		    count++;
		}
		else
			System.out.println("Straight line not available");
		
		if((newUserLogo.isDisplayed())==true)
		{
			System.out.println("New User Logo available");
		    count++;
		}
		else
			System.out.println("New User Logo not available");
		
		if((tellUsInfo.isDisplayed())==true)
		{
			System.out.println("Tell us Info available");
		    count++;
		}
		else
			System.out.println("Tell Us Info not available");
		
		if((yourFullNameLogo.isDisplayed())==true)
		{
			System.out.println("your full name available");
		    count++;
		}
		else
			System.out.println("your full name logo not available");
		
		if((fullNameTextbox.isDisplayed())==true)
		{
			System.out.println("full name textbox available");
		    count++;
		}
		else
			System.out.println("full name textbox not available");
		
		if((emailidLogo.isDisplayed())==true)
		{
			System.out.println("email id Logo available");
		    count++;
		}
		else
			System.out.println("email id Logo not available");
		

		if((emailidTextbox.isDisplayed())==true)
		{
			System.out.println("email id textbox available");
		    count++;
		}
		else
			System.out.println("email id textbox not available");
		

		if((exampleMailLogo.isDisplayed())==true)
		{
			System.out.println("example mail logo available");
		    count++;
		}
		else
			System.out.println("example mail logo not available");
		

		if((newPasswordLogo.isDisplayed())==true)
		{
			System.out.println("new password logo available");
		    count++;
		}
		else
			System.out.println("new password logo not available");
		

		if((retypePasswordLogo.isDisplayed())==true)
		{
			System.out.println("retype password logo available");
		    count++;
		}
		else
			System.out.println("retype password logo not available");
		

		if((genderLogo.isDisplayed())==true)
		{
			System.out.println("gender logo available");
		    count++;
		}
		else
			System.out.println("gender logo not available");
		

		if((maleRadioButton.isDisplayed())==true)
		{
			System.out.println("male radio button available");
		    count++;
		}
		else
			System.out.println("male radio button not available");
		

		if((femaleRadioButton.isDisplayed())==true)
		{
			System.out.println("female radio button available");
		    count++;
		}
		else
			System.out.println("female radio button not available");
		

		if((dateOfBirthLogo.isDisplayed())==true)
		{
			System.out.println("date of birth logo available");
		    count++;
		}
		else
			System.out.println("date of birth logo not available");
		

		if((birthDayLogo.isDisplayed())==true)
		{
			System.out.println("birth day logo available");
		    count++;
		}
		else
			System.out.println("birth day logo not available");
		

		if((birthMonthLogo.isDisplayed())==true)
		{
			System.out.println("birth month logo available");
		    count++;
		}
		else
			System.out.println("birth month logo not available");
		

		if((birthYearLogo .isDisplayed())==true)
		{
			System.out.println("birth year logo available");
		    count++;
		}
		else
			System.out.println("birth year logo not available");
		

		if((locationLogo.isDisplayed())==true)
		{
			System.out.println("location logo available");
		    count++;
		}
		else
			System.out.println("location logo not available");
		

		if((locationTextbox.isDisplayed())==true)
		{
			System.out.println("location textbox available");
		    count++;
		}
		else
			System.out.println("location textbox not available");
		

		if((schoolLogo.isDisplayed())==true)
		{
			System.out.println("school logo available");
		    count++;
		}
		else
			System.out.println("school logo not available");
		

		if((schoolTextbox.isDisplayed())==true)
		{
			System.out.println("school textbox available");
		    count++;
		}
		else
			System.out.println("school textbox not available");
		

		if((collegeLogo.isDisplayed())==true)
		{
			System.out.println("college logo available");
		    count++;
		}
		else
			System.out.println("college logo not available");
		

		if((collegeTextbox.isDisplayed())==true)
		{
			System.out.println("college textbox available");
		    count++;
		}
		else
			System.out.println("college textbox not available");
		

		if((captchaImg.isDisplayed())==true)
		{
			System.out.println("captch img available");
		    count++;
		}
		else
			System.out.println("captcha img not available");
		
		if((captchaCodeLogo.isDisplayed())==true)
		{
			System.out.println("captcha code logo available");
		    count++;
		}
		else
			System.out.println("captcha code logo not available");
		

		if((captchaCodeTextbox.isDisplayed())==true)
		{
			System.out.println("captcha code textbox available");
		    count++;
		}
		else
			System.out.println("captcha code textbox not available");
		

		if((signupButton.isDisplayed())==true)
		{
			System.out.println("sign up button available");
		    count++;
		}
		else
			System.out.println("signup button not available");
		

		if((rediffOnTheNetLogo.isDisplayed())==true)
		{
			System.out.println("Rediff on the net logo available");
		    count++;
		}
		else
			System.out.println("Rediff on the net logo not available");
		

		if((investerLogo.isDisplayed())==true)
		{
			System.out.println("invester logo available");
		    count++;
		}
		else
			System.out.println("invester logo not available");
		

		if((advertiseLogo.isDisplayed())==true)
		{
			System.out.println("advertise logo available");
		    count++;
		}
		else
			System.out.println("advertise logo not available");
		

		if((rediffLink.isDisplayed())==true)
		{
			System.out.println("Rediff Link available");
		    count++;
		}
		else
			System.out.println("Rediff Link not available");
		

		if((disclaimerLogo.isDisplayed())==true)
		{
			System.out.println("disclaimer logo available");
		    count++;
		}
		else
			System.out.println("disclaimer logo not available");
		

		if((policyLogo.isDisplayed())==true)
		{
			System.out.println("policy logo available");
		    count++;
		}
		else
			System.out.println("policy logo not available");
		

		if((feedbackLogo.isDisplayed())==true)
		{
			System.out.println("feedback logo available");
		    count++;
		}
		else
			System.out.println("feedback logo not available");
		

		if((termsOfUseLogo.isDisplayed())==true)
		{
			System.out.println("terms of use logo available");
		    count++;
		}
		else
			System.out.println("terms of use logo not available");
		
		System.out.println("*****************************************************************");
		
		System.out.println("total count of element = " + count);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
