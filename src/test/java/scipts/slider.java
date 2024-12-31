package scipts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//WebElement location=driver.findElement(By.xpath("//div[@id='slider-range']"));
		//System.out.println(location.getLocation());
		
		WebElement startPoint=driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		System.out.println(startPoint.getLocation());
		Actions act=new Actions(driver);
		act.dragAndDropBy(startPoint, 1200, 0).perform();
		System.out.println(startPoint.getLocation());

	}

}
