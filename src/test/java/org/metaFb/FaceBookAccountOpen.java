package org.metaFb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookAccountOpen {

	public static void main(String[] args) {
//		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe\\");
		ChromeDriver driver= new ChromeDriver(); 
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div[@id='reg_form_box']/child::div[10]")).click();
		
	}

}
