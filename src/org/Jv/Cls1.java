package org.Jv;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cls1 extends Base_Class{
	 
	public static void main(String[] args) throws IOException {
		
	//without using extends -- Base_Class.browserLaunch();		
		
		browserLaunch();
		//closeBrowser();
		launchUrl("https://www.facebook.com/");
		pageTitle();
		pageUrl();
	  takeSnap();
		
	}


}
