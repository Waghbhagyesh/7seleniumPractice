package org.OpenKart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
	@BeforeClass
	public void setup(){
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe/");
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/admin/");
		
	}
	@Test(priority=0)
	public void login() {
		driver.findElement(By.id("input-username")).sendKeys("demo");
		driver.findElement(By.id("input-password")).sendKeys("demo");
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		
	}
	@Test(priority=1)
	public void CreateCust() {
		driver.findElement(By.id("menu-customer")).click();
		driver.findElement(By.id("collapse33")).click();
		driver.findElement(By.xpath("//*[@class='fa fa-plus']")).click();
		
		driver.findElement(By.id("input-firstname")).sendKeys("NarendraBhau");
		driver.findElement(By.id("input-lastname")).sendKeys("Modi");
		driver.findElement(By.id("input-email")).sendKeys("Modi.Narendra007@BJP.com");
		driver.findElement(By.id("input-telephone")).sendKeys("8007007007");
		driver.findElement(By.id("input-password")).sendKeys("Narendra");
		driver.findElement(By.id("input-confirm")).sendKeys("Narendra");
		WebElement NWltr=driver.findElement(By.id("input-newsletter"));
		Select Newsltr=new Select(NWltr);
		Newsltr.selectByValue("1");
		WebElement status=driver.findElement(By.id("input-status"));
		Select Sts=new Select(status);
		Sts.selectByValue("0");
		WebElement safe=driver.findElement(By.id("input-safe"));
		Select Sf=new Select(safe);
		Sf.selectByValue("1");
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		
		
	}
	
	
	
}
