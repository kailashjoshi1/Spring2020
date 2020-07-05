package crmTest;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class LoginTest1 {
	
WebDriver driver;
	

	@Before
	public void Lunchbrower( ) {		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KAILASH\\eclipse-workspace\\Selenium_First_Class\\Drivers\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://techfios.com/ibilling/?ng=admin/");
	}
	
	
	
	@Test
	public void loginTest() throws InterruptedException {
	WebElement USERNAME_FIELD_ELEMENT = driver.findElement(By.id("username"));
	USERNAME_FIELD_ELEMENT.clear(); 		
	USERNAME_FIELD_ELEMENT .sendKeys("demo@techfios.com");
	
	By PASSWORD_FIELD_LOCATOR = By.id("password");
	driver.findElement(PASSWORD_FIELD_LOCATOR).clear();
	driver.findElement(PASSWORD_FIELD_LOCATOR).sendKeys("abc123");	
	driver.findElement(By.name("login")).click();
	
	
	
	
	WebElement DASHBOARD_PAGE_TITLE__ELEMENT = driver.findElement(By.xpath("//h2[ contains(text(), 'Dashboard') ]"));
	By DASHBOARD_PAGE_TITLE__LOCATOR = By.xpath("(\"//h2[ contains(text(), 'Dashboard') ]\"));");
	
	WebDriverWait wait = new WebDriverWait(driver, 3);
	wait.until(ExpectedConditions.visibilityOf(DASHBOARD_PAGE_TITLE__ELEMENT));
	
	
	
	
	
	
	
	
	}
	

}
