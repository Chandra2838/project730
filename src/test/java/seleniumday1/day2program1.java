package seleniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2program1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("chandra shekhar");
		
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("chandra");
		
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();

	}

}
