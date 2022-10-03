package org.OpenKart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutoSuggetions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	    Thread.sleep(2000);
		List<WebElement> Ele=driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
		System.out.println(Ele.size());
		for(int i=0;i<Ele.size();i++) {
//			System.out.println(Ele.get(i).getText());
			if(Ele.get(i).getText().equalsIgnoreCase("iphone charger")) {
				Ele.get(i).click();
			}
		}
		

	}

}
// 