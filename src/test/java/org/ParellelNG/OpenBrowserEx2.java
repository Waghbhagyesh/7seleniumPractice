package org.ParellelNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowserEx2 {
	WebDriver driver=null;
	@Test
	public void Google1() {
		System.out.println("Open Browser For Google 1");
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe\\");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
				
	}
	@Test
	public void Facebook1() {
		System.out.println("Open Browser For Facebook 1");
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe\\");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
				
	}

}
