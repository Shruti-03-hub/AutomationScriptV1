package scipts;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethods {

	public static void main(String[] args) {

			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			System.out.println("title of page :" +driver.getTitle());
			System.out.println("current URL of page :" +driver.getCurrentUrl());
			
			//System.out.println("pageSource of page :" +driver.getPageSource());
			System.out.println("window handle of page :" +driver.getWindowHandle());
			
			driver.findElement(By.xpath("//a[text()='Best Sellers']")).click();		
			driver.findElement(By.xpath("//a[text()='Sell']")).click();
			Set<String> windows=driver.getWindowHandles();
			
			for(String win:windows) {
				System.out.print(win);
			}
			

	}

}
