package org.ActiTime;

import java.time.Duration;

import org.Utility.BaseUtilities;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AT_DashBoardVerify {

	WebDriver driver=null;
	@BeforeMethod
	public void login() {
		String url="http://localhost/login.do";
		driver=BaseUtilities.bu.startup(url, "ch");
		driver.findElement(By.cssSelector("*[placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}

	@Test
	public void DashboardVerify() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String ActUrl=driver.getCurrentUrl();
		Assert.assertEquals(ActUrl, "http://localhost/user/submit_tt.do");
		//		if(ActUrl.equals("http://localhost/user/submit_tt.do")) {
		//			System.out.println("Login Succesful");
		//		}else {
		//			System.out.println("Login UnSuccesful");
		//		}
		//		driver.findElement(By.xpath("//*[@class='navTable']//*[text()='TASKS']")).click();

	}
	@AfterMethod
	public void logOut() {
		driver.findElement(By.cssSelector("#logoutLink")).click();
		driver.close();

	}
}



