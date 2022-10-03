package org.basicMethod;

import org.Utility.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlipkartFindElement {
	static WebDriver driver=null;
	public static void main(String[] args) {
		BaseUtilities obj=new BaseUtilities();
		String url="https://www.flipkart.com/";
		driver=obj.startup(url, "ch");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//div[@class='_331-kn _2tvxW']/div/div/div[3]")).click();
		

	}

}
