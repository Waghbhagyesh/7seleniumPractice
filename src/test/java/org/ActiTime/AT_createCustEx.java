package org.ActiTime;

import java.time.Duration;
import org.Utility.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AT_createCustEx {
	WebDriver driver=null;
	@BeforeSuite
	public void login() {
		String url="http://localhost/login.do";
		driver=BaseUtilities.bu.startup(url, "ch");
	}
	@Test(priority=0,dataProvider="loginCreds")
	public void login(String id,String pwd) {
		driver.findElement(By.cssSelector("*[placeholder='Username']")).sendKeys(id);
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
	}
	@Test(priority=1,dataProvider="CustName")
	public void DashboardVerify(String cust) {
		driver.findElement(By.xpath("//*[@class='navTable']//*[text()='TASKS']")).click();
		driver.findElement(By.xpath("//*[text()='Add New']")).click();
		driver.findElement(By.xpath("//*[@class='item createNewCustomer ellipsis']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys(cust);

		WebElement create=driver.findElement(By.xpath("//*[text()='Create Customer']"));
		BaseUtilities.bu.clickByJS(create, driver);
	}

	@AfterSuite
	public void logOut() {
		driver.findElement(By.cssSelector("#logoutLink")).click();
		//		driver.close();
	}
	@DataProvider
	public Object[][] CustName() {
		Object[][] data=new Object[5][1];
		data[0][0]="Accenture";
		data[1][0]="Capgemini";
		data[2][0]="Infosys";
		data[3][0]="TechMahendra";
		data[4][0]="HCL";
		return data;
	}
	@DataProvider
	public Object[][] loginCreds() {
		Object[][] logdata=new Object[1][2];
		logdata[0][0]="admin";
		logdata[0][1]="manager";
		return logdata;

	}
}



