package scipts;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SearcjAmazon {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("watch");
		Thread.sleep(3000);
		
		List<WebElement> options=driver.findElements(By.xpath("//div[@class='left-pane-results-container' or @class='s-suggestion-container']"));
		
		//int opsize=options.size();
		
		
		//for(int i=0;i<options.size();i++) {
		for(WebElement op:options) {
			
			String value = op.getText();
			
			System.out.println(value);
		
		}}}
