package org.form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Google {
	WebDriver driver;
	@BeforeMethod
	public void b(){
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe/");
		driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
	}
	@Test(priority=0)
	public void login(){
		driver.findElement(By.cssSelector("*[placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}

}
