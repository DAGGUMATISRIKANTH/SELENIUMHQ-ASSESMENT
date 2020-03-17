package com.Testcases;

import java.io.IOException;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.WrapperClass;
import com.pages.DownloadPage;


public class TestCase extends WrapperClass {

	@BeforeClass
	public void Startup()
	{
		LaunchApplication("chrome","https://www.seleniumhq.org");
	}
	
	
	@Test
	public void DownloadedIEDriver64BIT() throws InterruptedException
	{
		DownloadPage sp = new DownloadPage(driver);
		sp.Downloads();
		sp.PerformActions();
	}
	
	
	@AfterClass
	public void close() throws IOException
	{
		
		driver.quit();
	}
}
