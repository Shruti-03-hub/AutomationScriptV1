package scipts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement point=driver.findElement(By.xpath("//button[@class='dropbtn']"));
		WebElement mobile=driver.findElement(By.xpath("//div[@class='dropdown-content']//a[text()='Mobiles']"));
		Actions act=new Actions(driver);
		act.moveToElement(point).moveToElement(mobile).perform();
		
		
		act.contextClick(mobile).perform();
		
		WebElement drag=driver.findElement(By.id("draggable"));
		
		WebElement drop=driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(drag, drop).perform();
		Thread.sleep(3000);
		WebElement button=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		act.doubleClick(button).perform();
	
	}

}
