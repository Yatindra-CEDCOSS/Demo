package program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Login {
//	Please update these details accordingly
	public static String email = "yatindrakinker231297@gmail.com";
	public static String password = "password";
	public static String bussinessName = "myaccountxx";
	public static String address = "Lucknow";
	public static String cityName = "Lucknow";
	public static String countryName = "India";
	public static String stateName = "Uttar Pradesh";
	public static String zipCode = "226024";
	public static String titleOfJob = "QA";
	public static String contact = "9876543210";
	public static String linkedinUrl = "linkedIn";
	public static String fbUrl = "facebook";
	public static String nameOfStore = "mYStOrE";
	public static String storePassword = "password";
	public static String confirmStorePassword = "password";
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/cedcoss/Desktop/jars/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://partners.shopify.com/organizations ");
		Thread.sleep(5000);
		WebElement user = driver.findElement(By.xpath("(//input[@id='account_email'])[1]"));
		user.sendKeys(email);
		user.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		WebElement pass = driver.findElement(By.xpath("(//input[@id='account_password'])[1]"));
		pass.sendKeys(password);
		pass.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
//		driver.findElement(By.xpath("(//a)[2]")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='+ Create new partner account'])[1]")).click();
		Thread.sleep(5000);
		WebElement bussiness = driver.findElement(By.xpath("(//input[@id='organization_business_name'])[1]"));
		bussiness.sendKeys(bussinessName);
		Thread.sleep(1000);
		WebElement address1 = driver.findElement(By.xpath("(//input[@id='address_address1'])[1]"));
		address1.sendKeys(address);
		Thread.sleep(1000);
		WebElement city = driver.findElement(By.xpath("(//input[@id='address_city'])[1]"));
		city.sendKeys(cityName);
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='address_country_code']")));
		dropdown.selectByVisibleText(countryName);
		Thread.sleep(1000);
		Select dropdownState = new Select(driver.findElement(By.xpath("(//select[@id='address_province_code'])[1]")));
		dropdownState.selectByVisibleText(stateName);
		Thread.sleep(1000);
		WebElement postalCode = driver.findElement(By.xpath("(//input[@id='address_postal_code'])[1]"));
		postalCode.sendKeys(zipCode);
		Thread.sleep(1000);
		WebElement jobTitle = driver.findElement(By.xpath("(//input[@id='signup_profile_form_job_title'])[1]"));
		jobTitle.sendKeys(titleOfJob);
		Thread.sleep(1000);
		WebElement phoneNumber = driver.findElement(By.xpath("(//input[@id='signup_profile_form_phone_number'])[1]"));
		phoneNumber.sendKeys(contact);
		Thread.sleep(1000);
		WebElement checkbox = driver.findElement(By.xpath("(//label[normalize-space()='Subscribe to updates via Whatsapp'])[1]"));
		checkbox.click();
		Thread.sleep(1000);
		WebElement linkedIn = driver.findElement(By.xpath("(//input[@id='signup_profile_form_linkedin_url'])[1]"));
		linkedIn.sendKeys(linkedinUrl);
		Thread.sleep(1000);
		WebElement facebook = driver.findElement(By.xpath("(//input[@id='signup_profile_form_facebook_url'])[1]"));
		facebook.sendKeys(fbUrl);
		Thread.sleep(1000);
		
		WebElement abtYourself = driver.findElement(By.xpath("(//div/label[contains(.,'Other (please specify)')])[1]"));
		abtYourself.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='signup_profile_form_custom_primary_revenue_intent'])[1]")).sendKeys("demo acnt");
		Thread.sleep(1000);
		
		WebElement abtPlatform = driver.findElement(By.xpath("(//label[@for='no_platform'])[1]"));
		abtPlatform.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='organization_partner_agreement_accepted']")).click();
		Thread.sleep(1000);
		
		WebElement viewDashboardBtn = driver.findElement(By.xpath("(//button[normalize-space()='View your dashboard'])[1]"));
		viewDashboardBtn.click();
		Thread.sleep(5000);
		
		WebElement store = driver.findElement(By.xpath("(//span[normalize-space()='Stores'])[1]"));
		store.click();
		Thread.sleep(5000);
		
		 driver.findElement(By.xpath("(//a[normalize-space()='Add store'])[1]")).click();;

		Thread.sleep(5000);
		
		WebElement storeType = driver.findElement(By.xpath("(//span[normalize-space()='Development store'])[1]"));
		storeType.click();
		Thread.sleep(2000);
		
		double randomNumber = Math.random();
		WebElement storeName = driver.findElement(By.xpath("(//input[@id='PolarisTextField1'])[1]"));
		storeName.sendKeys((nameOfStore) + randomNumber) ;
		Thread.sleep(1000);
		
		WebElement pass2 = driver.findElement(By.xpath("(//input[@id='PolarisTextField4'])[1]"));
		pass2.sendKeys(storePassword);
		Thread.sleep(1000);
		
		WebElement confirmPass = driver.findElement(By.xpath("(//input[@id='PolarisTextField5'])[1]"));
		confirmPass.sendKeys(confirmStorePassword);
		Thread.sleep(1000);
		
		WebElement whyThisStore = driver.findElement(By.xpath("(//span[normalize-space()='Test an app or theme'])[1]"));
		whyThisStore.click();
		Thread.sleep(1000);
//		SAVE NEWLY CREATED STORE
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
	}

}
