package SELENIUMTESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdriver {
	@Test
	public void check() throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();//base
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title +"THE TITEL OF THE PAGE");
		if(title.contains("Facebook "))
		{
	      System.out.println("WE ARE ON RIGHT PAGE");
		}
		else
		{
			 System.out.println("WE ARE FUCKED UP");
			 
		}
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("skamehboovdb.com");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("odkwwd");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();

		
		
		
	
		

		driver.close();
		

		
		
		
	
	}

}
