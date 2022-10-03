package org.Utility;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUtilities {

	public static BaseUtilities bu=new BaseUtilities();

	public  WebDriver startup(String url,String browserName) {

		String path=System.getProperty("user.dir");
		System.out.println("Path : "+path);
		WebDriver driver=null; 
		if(browserName.equals("chrome")||browserName.equalsIgnoreCase("ch")) {
			System.setProperty("webdriver.chrome.driver", path+"\\Driver\\chromedriver.exe\\");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")||browserName.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver", path+"\\Driver\\geckodriver.exe\\");
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")||browserName.equalsIgnoreCase("ed")) {
			System.setProperty("webdriver.edge.driver", path+"\\Driver\\msedgedriver.exe\\");
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	public WebDriver startupWebMng(String url,String browserName) {
		System.getProperty("user.dir");

		WebDriver driver=null; 
		if(browserName.equals("chrome") ||browserName.equalsIgnoreCase("ch")) {

			//System.setProperty("webdriver.chrome.driver", path+"\\Driver\\chromedriver.exe\\");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")||browserName.equalsIgnoreCase("ff")) {
			//	System.setProperty("webdriver.gecko.driver", path+"\\Driver\\geckodriver.exe\\");
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")||browserName.equalsIgnoreCase("ed")) {
			//	System.setProperty("webdriver.gecko.driver", path+"\\Driver\\geckodriver.exe\\");
			WebDriverManager.edgedriver().setup();
			driver=new FirefoxDriver();
		}
		//		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	public void waitForClickableByObj(WebDriver driver,int time,By obj) {
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(time));
		wt.until(ExpectedConditions.elementToBeClickable(obj));
	}
	public void waitForClickableByElement(WebDriver driver,int time,WebElement ele) {
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(time));
		wt.until(ExpectedConditions.elementToBeClickable(ele));
	}
	public void waitForClickableByString(WebDriver driver,int time,String locatorType,String locator) {
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(time));
		switch(locatorType) {
		case"id":
			wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("logoutLink")))).click();
		case"className":
			wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("logout")))).click();
		case"cssSelector":
			wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#logoutLink")))).click();
		case"xpath":
			wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@id=\"logoutLink\"]")))).click();
		}
	}
	public boolean isAlertPresent(WebDriver driver,int time) {
		try {//if try block not write it will show Timeout Exception. 
			WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(time));
			wt.until(ExpectedConditions.alertIsPresent());
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	public void scrollTillElement(WebElement ele,WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",ele);
	}
	public void clickByJS(WebElement ele,WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",ele);
	}
	
	
	
	
}

