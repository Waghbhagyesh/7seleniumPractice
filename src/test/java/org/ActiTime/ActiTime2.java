package org.ActiTime;

import java.time.Duration;

import org.Utility.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTime2 {
	WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		String url="http://localhost/login.do";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(url);

		driver.findElement(By.cssSelector("*[placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();


		driver.findElement(By.xpath("//*[@class='navTable']//*[text()='TASKS']")).click();
		driver.findElement(By.xpath("//*[text()='Add New']")).click();
		driver.findElement(By.xpath("//*[@class='item createNewCustomer ellipsis']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.cssSelector("#customerLightBox_nameField")).sendKeys("Accenture");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement create=driver.findElement(By.xpath("//*[text()='Create Customer']"));
		BaseUtilities.bu.clickByJS(create, driver);

		//		BaseUtilities.bu.clickByJS(User, driver);

	}
	
}