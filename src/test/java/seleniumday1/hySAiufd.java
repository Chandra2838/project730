package seleniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class hySAiufd {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeOptions op = new ChromeOptions();
		
		op.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(op);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Actions keyboard = new Actions(driver);
		
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("chandrashekhar");
		
		Thread.sleep(1000);
		keyboard.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		Thread.sleep(1000);
		keyboard.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		keyboard.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		Thread.sleep(1000);
		keyboard.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		
		
		
		
	

		
		

		
	

	}

}
