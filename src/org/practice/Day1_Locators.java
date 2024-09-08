package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_Locators {
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	
	// to launch fb login
			driver.get("https://www.facebook.com/login/");
			
		// to fetch webele -in fb page- find webele 
			//-- obj.methdname();--ctrl+2,L
			WebElement email = driver.findElement(By.id("email"));
			//to pass the value in email 
			email.sendKeys("Smart");
			
		// to fetch passwrd webele
			WebElement pswrd = driver.findElement(By.name("pass"));
			pswrd.sendKeys("123445");
			
		//to fetch the login webele
			WebElement Login = driver.findElement(By.name("login"));
		// to click on login -- click() method
			Login.click();
			
	}		

}
