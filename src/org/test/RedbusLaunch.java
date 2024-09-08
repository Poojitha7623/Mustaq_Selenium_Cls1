package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusLaunch {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.swiggy.com/");
//		
//		WebElement location = driver.findElement(By.xpath("//input[@placeholder='Search for area, street name..']"));
//		location.sendKeys("velachary");

		
	//------------------------HDFC BANK
	
	
		driver.get("https://netbanking.hdfcbank.com/");
		
		//Thread.sleep(10000);
		
		//WebElement Custid = driver.findElement(By.name("fldLoginUserId"));
		
		//WebElement Custid = driver.findElement(By.xpath("//input[@class='form-control text-muted']"));
		
		//WebElement Custid = driver.findElement(By.xpath("//input[contains(@class,'form-control text-muted)]"));
		
		WebElement Custid = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		
		Custid.sendKeys("12345");
		
		
//  //------------------ICICI BANK-----------		
//		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
//		
//		Thread.sleep(2000);
//		
//		//WebElement Usrname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
//		
//		WebElement Usrname = driver.findElement(By.className("login-input type_UserPrincipal"));
//		//class="login-input type_UserPrincipal
//		Usrname.sendKeys("Smart");
//		
		
//	   //------------RedBus_from&to	
//		driver.get("https://www.redbus.in/");
//		
//		Thread.sleep(3000);
//		
//		//WebElement From = driver.findElement(By.xpath("//label[text()='From']"));
//		
//		WebElement From = driver.findElement(By.id("src"));
//		From.sendKeys("Chittoor");
//		
//		
//		WebElement To = driver.findElement(By.id("dest"));
//		To.sendKeys("Chennai");
//	-------------------	
		
		
		
		
	}

}
