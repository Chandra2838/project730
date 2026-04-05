package seleniumday1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methodsss {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
	   driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
	   
	   Thread.sleep(2000);
	   
	   driver.switchTo().alert().accept();
		
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//button[text()='Confirmation Alert']")).click();
	   
	   Thread.sleep(2000);
	   
	   driver.switchTo().alert().dismiss();
	   
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//button[text()='Prompt Alert']")).click();
	   
	   Alert al= driver.switchTo().alert();
	   
	   al.sendKeys("chandra");
	   al.accept();
	   
	   
	}

}
