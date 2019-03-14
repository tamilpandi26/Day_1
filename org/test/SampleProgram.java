package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SampleProgram {
	public static void main(String[] args) {
		
		//configured InternetExplorer driver 
		System.setProperty("webdriver.ie.driver","C:\\Tamil\\Selenium\\Driver\\IEDriverServer.exe");
		
		//IE browser launched
		WebDriver driver=new InternetExplorerDriver();
		
		// Greens Selenium URL
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		
		//quit
		//driver.quit();
		

	}

}
