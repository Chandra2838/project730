package seleniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo28march26 {

	
		
		WebDriver driver ; 
		@Test(priority =1 , groups = "regression")
		void setup() {
			
			driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		}
		
		@Test(priority= 2 , groups = "smoke")
		void test1() {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("chandrashekhar");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("chandrashekhar");
		}
	
		
		

}
