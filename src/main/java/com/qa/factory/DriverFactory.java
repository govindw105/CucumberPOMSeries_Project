package com.qa.factory;

import java.awt.SystemColor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public static WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	
	/**
	 This method is used to initialize the threadlocal driver on the basis of gj 
	 @param browser 
	 @return this will return tldriver.  
	 * **/
	
	public WebDriver init_driver(String browser){
		
		System.out.println("browser value is: " + browser);
		
		 if (browser == null) {
		        throw new RuntimeException("Browser name is null! Check config.properties.");
		    }
	
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		}
		
		else if(browser.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		}
		
		else if(browser.equals("edge")) {
			
			WebDriverManager.edgedriver().setup();
			tlDriver.set(new EdgeDriver());
		}
		
		else {
			System.out.println("Please pass the correct browser value: " + browser);
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}
	
	public static WebDriver getDriver() {
	     return	tlDriver.get();
		} 

}
