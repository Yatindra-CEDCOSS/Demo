package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signup {
//	Please update these details accordingly
	public static String email = "yatindrakinker231297@gmail.com";
	public static String firstName = "Yatindra Kinker";
	public static String lastName = "Shukla";
	public static String password = "password";
	public static String confirmPassword = "password";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/cedcoss/Desktop/jars/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.shopify.com/signup?rid=39b4e356-d2a8-48d0-bdb7-f2f1e9aea12b");
		Thread.sleep(5000);	
		driver.findElement(By.xpath("(//span[normalize-space()='Continue with Email'])[1]")).click();
		Thread.sleep(5000);
		WebElement emailField = driver.findElement(By.xpath("(//input[@id='account_email'])[1]"));
		emailField.sendKeys(email);
		Thread.sleep(1000);
		WebElement fName = driver.findElement(By.xpath("(//input[@id='account_first_name'])[1]"));
		fName.click();
		fName.sendKeys(firstName);
		Thread.sleep(1000);
		WebElement lname = driver.findElement(By.xpath("(//input[@id='account_last_name'])[1]"));
		lname.click();
		lname.sendKeys(lastName);
		Thread.sleep(1000);
		WebElement passwordField = driver.findElement(By.xpath("(//input[@id='account_password'])[1]"));
		passwordField.click();
		passwordField.sendKeys(password);
		Thread.sleep(1000);
		WebElement confirmPass = driver.findElement(By.xpath("(//input[@id='password-confirmation'])[1]"));
		confirmPass.click();
		confirmPass.sendKeys(confirmPassword);
		Thread.sleep(1000);
		WebElement submit = driver.findElement(By.xpath("(//button[normalize-space()='Create Shopify ID'])[1]"));
		submit.click();
		Thread.sleep(5000);

	}

}
