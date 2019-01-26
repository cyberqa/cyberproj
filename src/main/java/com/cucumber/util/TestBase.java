package com.cucumber.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.config.OR;

public class TestBase extends OR{

	public WebDriver driver;
	
	public void initialize(String browser){
		if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/java/com/cucumber/drivers/chromedriver.exe");
			
			   driver=new ChromeDriver();
			   driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			   
		}
		
		driver.manage().window().maximize();
		   driver.get("https://www.jobserve.com/in/en/Job-Search/");
	}
	
	public void sendkeys(String xpath,String valueToEnter){
		driver.findElement(By.xpath(xpath)).sendKeys(valueToEnter);
	}
	
	public void click(String xpath){
		driver.findElement(By.xpath(xpath)).click();
	}
	
}
