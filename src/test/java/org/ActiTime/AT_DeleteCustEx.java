package org.ActiTime;

import java.time.Duration;

import org.Utility.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AT_DeleteCustEx {
	WebDriver driver=null;
	@BeforeSuite
	public void Setup() {
		String url="http://localhost/login.do";
		driver=BaseUtilities.bu.startup(url, "ch");
	}
	@Test(priority=0,dataProvider="loginCred")
	public void login(String id,String pwd) {
		driver.findElement(By.cssSelector("*[placeholder='Username']")).sendKeys(id);
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
	}
	@Test(priority=1)
	public void DeleteCust() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@class='navTable']//*[text()='TASKS']")).click();
		//		BaseUtilities.bu.clickByJS(ele, driver);
		driver.findElement(By.cssSelector("*[class='node customerNode notSelected'] *[class='editButton available']")).click();
		driver.findElement(By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']//div[text()='ACTIONS']")).click();
		driver.findElement(By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']//div[text()='Delete']")).click();
		driver.findElement(By.cssSelector("#customerPanel_deleteConfirm_submitBtn")).click();
	}
	
	
	@DataProvider
	public Object[][] loginCred(){
		Object [][] logdata= new Object[1][2];
		logdata[0][0]="admin";
		logdata[0][1]="manager";
		return logdata;
	}

}
