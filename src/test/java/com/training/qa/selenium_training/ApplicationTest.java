package com.training.qa.selenium_training;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ApplicationTest {

	public WebDriver driver;
	

	@Test
	void shouldAnswerWithTrue() {
		assertTrue(true);
	}

	@Test
	public void openMyBlog() {
		driver.get("https://www.google.com/");
	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Ouni\\eclipse-workspace\\trainingQa\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
