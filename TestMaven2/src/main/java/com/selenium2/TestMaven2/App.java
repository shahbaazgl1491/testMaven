package com.selenium2.TestMaven2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	System.setProperty("webdriver.gecko.driver","/Users/shahbaaz/Downloads/geckodriver");
		
		WebDriver mozilla = new FirefoxDriver();
		
		mozilla.get("https://twitter.com/login/error?redirect_after_login=%2F");
		
		//"hsfghsfgbhsg"
		
		mozilla.findElement(By.xpath("hsfghsfgbhsg")).sendKeys("shahbaazgl1491@gmail.com");
		
    }
}
