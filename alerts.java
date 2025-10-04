package SELENIUMTESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts {
	@Test
	public  void aleertsandhandles() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver bash=new ChromeDriver();
		bash.get("https://www.facebook.com/");
		bash.findElement(By.xpath(""));
		
		
		
		
		
	}

}
