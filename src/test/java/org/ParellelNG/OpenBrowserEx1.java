package org.ParellelNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowserEx1 {
	WebDriver driver=null;
	@Test
	public void Google() {
		System.out.println("Open Browser For Google");
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe\\");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
				
	}
	@Test
	public void Facebook() {
		System.out.println("Open Browser For Facebook");
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe\\");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
				
	}

}
