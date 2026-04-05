package seleniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseaction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		
	    Thread.sleep(2000);
	    
	    Actions mouse = new Actions(driver);
	    
//	    mouse.doubleClick(driver.findElement(By.xpath("//button[text()='Copy Text']"))).build().perform();
//	    
//	    Thread.sleep(1000);
//	    
//	    mouse.moveToElement(driver.findElement(By.xpath("//button[text()='Point Me']"))).build().perform();
//	    
//	    Thread.sleep(1000);
//
//	    WebElement drag= driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
//	    
//	    WebElement drop = driver .findElement(By.xpath("//p[text()='Drop here']"));
//	    
//	    Thread.sleep(1000);
//
//	    mouse.dragAndDrop(drag, drop).build().perform();
//	    
//	    Thread.sleep(1000);
//	    
//	    mouse.click(driver.findElement(By.xpath("//button[text()='Simple Alert']"))).build().perform();
	    
	    mouse.contextClick(driver.findElement(By.xpath("//button[text()='Right Click Me']"))).build().perform();

	}
	
}
