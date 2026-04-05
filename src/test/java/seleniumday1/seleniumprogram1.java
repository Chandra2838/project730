package seleniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumprogram1 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver(); // how to open the browser 
		
		driver.get("https://www.facebook.com/");// to open website on browser 
		
		driver.manage().window().maximize();// if we want maximize the window 
		
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("chandra");
		
		
		
		
		
		

	}

}
