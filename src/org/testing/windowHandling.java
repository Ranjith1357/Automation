package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	WebElement clickButton = driver.findElement(By.xpath(""));	
		
		)

		
		
	
	
	
	
}
	

}
