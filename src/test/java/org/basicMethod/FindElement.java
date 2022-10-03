package org.basicMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElement {

	public static void main(String[] args) {
//		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe\\");
		ChromeDriver driver= new ChromeDriver(); 
		driver.get("https:/www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("div[id='login_link'] a[role='button'] ")).click();
//		ele.click();
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click;", ele);
	}

}
