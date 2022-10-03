package org.form;

import java.time.Duration;

import org.Utility.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Form {

	public static void main(String[] args) {
		String url="https://demoqa.com/automation-practice-form";
		WebDriver driver=BaseUtilities.bu.startup(url, "ch");
		driver.findElement(By.id("close-fixedban")).click();;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//		WebElement City=driver.findElement(By.xpath("//div[@id='stateCity-wrapper']//div[@id='state']"));
		WebElement City=driver.findElement(By.xpath("//div[text()='Select State']"));
		Actions act=new Actions(driver);
		BaseUtilities.bu.scrollTillElement(City, driver);
		BaseUtilities.bu.clickByJS(City, driver);
		act.click(City).perform();
		act.keyDown(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER);
	}

}
//*[text()='Select State']
//div[@id='stateCity-wrapper']//div[@id='state']