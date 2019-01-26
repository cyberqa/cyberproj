package com.cucumber.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef1 extends TestBase{

@Given("^go to website on chrome$")
public void go_to_website_on_chrome() throws Throwable {
	/*System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/java/com/cucumber/drivers/chromedriver.exe");
	
   driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
   driver.manage().window().maximize();
   driver.get("https://www.jobserve.com/in/en/Job-Search/");*/
	initialize("chrome");
}

/*@Given("^Enter keyword$")
public void enter_keyword() throws Throwable {
    driver.findElement(By.xpath("//*[@id='txtKey']")).sendKeys("Selenium");
}

@Given("^Enter Location$")
public void enter_Location() throws Throwable {
    driver.findElement(By.xpath("//*[@id='txtLoc']")).sendKeys("Hyderabad");
}*/

@Given("^Enter keyword as \"([^\"]*)\"$")
public void enter_keyword_as(String arg1) throws Throwable {
	//driver.findElement(By.xpath("//*[@id='txtKey']")).sendKeys(arg1);
	sendkeys(keywordx, arg1);
}

@Given("^Enter Location as \"([^\"]*)\"$")
public void enter_Location_as(String arg1) throws Throwable {
	//driver.findElement(By.xpath("//*[@id='txtLoc']")).sendKeys(arg1);
	sendkeys(locationx, arg1);
}

@When("^I click on login button$")
public void i_click_on_login_button() throws Throwable {
	//driver.findElement(By.xpath("//*[@id='btnSearch']")).click();
	click(submitx);
}

@Then("^Should display jobs$")
public void should_display_jobs() throws Throwable {
   
}
}
