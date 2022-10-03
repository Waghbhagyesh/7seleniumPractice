package org.form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class login  {
	WebDriver driver;
	@AfterMethod
	public void Task(){
		driver.findElement(By.xpath("//*[@class='navTable']//*[text()='TASKS']")).click();

	}

}
