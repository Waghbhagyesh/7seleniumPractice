package org.basicMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlOpen {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver",path+"\\Driver\\chromedriver.exe\\");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension (700,500));
		String url="http://localhost/login.do";
//		driver.get(url);
		driver.navigate().to(url);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
	}

}
