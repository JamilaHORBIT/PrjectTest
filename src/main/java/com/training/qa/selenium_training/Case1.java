package com.training.qa.selenium_training;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Case1 {
	public WebDriver driver;
	
	  @Test
	  public void openMyBlog() {
		driver.get("https://www.google.com/");
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ouni\\eclipse-workspace\\trainingQa\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
	  } 

	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }
}
