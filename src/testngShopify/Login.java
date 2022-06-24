package testngShopify;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/cedcoss/Desktop/jars/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testseleniumm.myshopify.com/admin");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@name='account[email]'])[1]")).sendKeys("yatindrakinker@cedcommerce.com");;
		driver.findElement(By.xpath("(//input[@name='account[email]'])[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='account_password'])[1]")).sendKeys("SeleniumTest");
		driver.findElement(By.xpath("(//input[@id='account_password'])[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();
	}
}
