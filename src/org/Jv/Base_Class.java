package org.Jv;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {
	
	static WebDriver driver;
	
	public static void browserLaunch() {
		
		driver = new ChromeDriver();
		
	}
	
	public static void closeBrowser(){
		
		driver.close();
	}
	
	public static void launchUrl(String url) {
		
		driver.get(url);
	}
	
	public static void pageTitle() {
		
		String title = driver.getTitle();
	    System.out.println(title);
	}
	
	
	public static void pageUrl() {
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	public static void takeSnap() throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Fi = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\");
		FileUtils.copyFile(Fi,f);
	}
	
//	public static void
//	
//	public static void

}
