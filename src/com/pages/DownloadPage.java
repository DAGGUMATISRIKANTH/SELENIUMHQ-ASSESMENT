package com.pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DownloadPage {
	
WebDriver driver;
By Downloads=By.xpath("//*[@id=\"navbar\"]/a[1]");
By IEDriver64bit=By.xpath("/html/body/div[2]/div[2]/p/a[2]");

public DownloadPage(WebDriver driver)
{
	this.driver=driver;
}
 public void Downloads()
 {
	 driver.findElement(Downloads).click();
	 
 }
 public void PerformActions() throws InterruptedException
 {
	 driver.findElement(IEDriver64bit).click();
	 Thread.sleep(2000);
	 File f=new File("C:\\Users\\BLTuser.BLT058\\Downloads\\IEDriverServer.exe");
	 Boolean b=f.exists();
	 if(b)
	 System.out.println("File Exist");
	 Assert.assertTrue(b);
 }
}
