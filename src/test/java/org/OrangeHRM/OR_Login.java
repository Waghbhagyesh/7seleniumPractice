package org.OrangeHRM;

import org.Utility.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OR_Login {
	WebDriver driver;
	@BeforeClass
	public void Setup() {
		String url="https://opensource-demo.orangehrmlive.com/";
		driver=BaseUtilities.bu.startup(url, "ch");
	}
	@Test
	public void login() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
}
