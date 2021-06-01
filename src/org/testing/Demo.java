package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".//driver//chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("ranjith");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("5688578");
		
		
		
		
		
		}
	
	

}
