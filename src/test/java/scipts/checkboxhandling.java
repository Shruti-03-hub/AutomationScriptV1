package scipts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxhandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement> checkBoxs=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		for(WebElement ch:checkBoxs) {
			ch.click();
		}
		//deselecting
		for(WebElement ch:checkBoxs) {
			if(ch.isSelected()) {
				
			
			ch.click();
		}}
	}

}
