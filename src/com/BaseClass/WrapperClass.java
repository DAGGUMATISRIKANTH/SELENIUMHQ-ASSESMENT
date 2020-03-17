package com.BaseClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WrapperClass {

protected WebDriver driver;
 public void LaunchApplication(String browser,String url)
 {
	 try
	 {   
		 //for Launching FireFox Browser
		 if(browser.equalsIgnoreCase("firefox"))
		 {
			 driver=new FirefoxDriver();
			 
		 }
		 // For Launching ChromeBrowser
		 else if(browser.equalsIgnoreCase("chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
			 driver=new ChromeDriver();
			 
		 }
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		 driver.get(url);
	            }
	 
 
 catch(WebDriverException e)
     {
	 System.out.println("Browser could not be launched");
    }
        }
	
	 public void close()throws IOException
	 {
		 driver.quit();
	 }
}
