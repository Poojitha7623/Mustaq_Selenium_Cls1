package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_Xpath {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		// to launch fb login
		driver.get("https://www.facebook.com/login/");
		
	// to fetch webele -in fb page- find webele by xpath
		//-- obj.methdname(//tagname[@attributename='attributevalue']);--ctrl+2,L
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		//to pass the value in email 
		email.sendKeys("Smart");
		
		
	// to fetch passwrd webele
		WebElement pswrd = driver.findElement(By.xpath("//input[@type='password']"));
		pswrd.sendKeys("123445");
		
	//to fetch the login webele
		WebElement Login = driver.findElement(By.xpath("//button[@name='login']"));
	// to click on login -- click() method
		Login.click();
		
		
		
		
		
	}

}
