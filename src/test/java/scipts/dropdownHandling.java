package scipts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement drp=driver.findElement(By.id("country"));
		Select sel=new Select(drp);
		//sel.selectByIndex(2);
		//Thread.sleep(3000);
		//sel.selectByValue("canada");
		//Thread.sleep(3000);
		//sel.selectByVisibleText("Canada");
		//Thread.sleep(3000);
		//.quit();
		
		//get all options of dropdwon
		
		List<WebElement> options=sel.getOptions();
		
		System.out.println("Option are :"+options.size());
		
		for(WebElement op:options) {
			if(op.getText().equals("China")) {
				op.click();
				
			}
		}
		
	}

}
