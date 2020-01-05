package com.facebook.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageObject {

	WebDriver driver;
	
	public void openurl(){
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\astha\\workspace\\CucumberProject1\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	//add
	}
	
}
