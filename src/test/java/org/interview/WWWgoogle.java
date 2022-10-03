package org.interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WWWgoogle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		WebElement ele=driver.findElement(By.xpath("//div[@class='QlyBfb']/button[text()='No thanks']"));
//		ele.click();
		driver.findElement(By.xpath("//*[@class='QlyBfb']/button")).click();

	}

}
