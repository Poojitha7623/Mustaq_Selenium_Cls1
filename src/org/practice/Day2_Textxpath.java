package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_Textxpath {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		// to launch the URl -- get() method
		driver.get("https://www.facebook.com/?locale2=en_GB&_rdr");
		
		// to click on forgot paswrd but by passing through text()
		
		// ---//tagname[text()='text value']
		WebElement frgtpswrd = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		frgtpswrd.click();
		
	}

}
