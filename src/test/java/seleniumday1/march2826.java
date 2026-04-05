package seleniumday1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class march2826 {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		
	//	driver.get("https://www.facebook.com/");// to open any website on browser 
		
		driver.navigate().to("https://www.facebook.com/"); // to open any website
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// navigation method 
		
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		
		driver.navigate().forward();
		
System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		
	
		
	}

}
