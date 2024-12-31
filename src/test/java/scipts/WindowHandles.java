package scipts;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandles {

	
		
		WebDriver driver;
		@Test
		public void step() {
			
			driver=new ChromeDriver();
			driver.get("https://tutorialsninja.com/demo/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get("https://tutorialsninja.com/demo/index.php?route=product/product&product_id=43");
			
			Set<String> tabs=driver.getWindowHandles();
			
			List<String> tab=new ArrayList<>(tabs);
			
			driver.switchTo().window(tab.get(0));
			System.out.println(tab);
			
			
			for(String st:tab) {
				String title=driver.switchTo().window(st).getTitle();
				System.out.println("title is:" +title);
				if(title.equals("MacBook")) {
					driver.findElement(By.id("button-cart")).click();
				}
			}
			
			//driver.close();
			
		}

	}


