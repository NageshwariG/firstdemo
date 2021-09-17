package com.picnic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
import com.picnic.LoginPage;
 
/**
* @author Mukesh_50
*
*/
public class VerifyPageWord 
{
 
 
@Test
public void verifyValidLogin() throws InterruptedException
{
System.setProperty("webdriver.gecko.driver","C:/Users/nagashwarig/eclipse-selenium_Project/seleniumProject/drivers/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
 
driver.manage().window().maximize();
 
driver.get("https://opensource-demo.orangehrmlive.com/");
 
LoginPage login=new LoginPage(driver);
Thread.sleep(3000);
login.loginToWordpress("Admin","admin123");
Thread.sleep(3000);
//login.typePassword("admin123");
//Thread.sleep(3000);
//login.clickOnLoginButton();
 
 
driver.quit();
 
}
 
 
}