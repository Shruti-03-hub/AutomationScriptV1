package scipts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearch {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		int length=driver.findElement(By.id("APjFqb")).getSize().getHeight();
		int width=driver.findElement(By.id("APjFqb")).getSize().getWidth();
		System.out.println("Length and width is :" +length+ " "+width);
		
		driver.findElement(By.id("APjFqb")).sendKeys("java");
		
		List<WebElement> options=driver.findElements(By.xpath("//div[@class='OBMEnb']//li"));
		
		for(WebElement op:options) {
			System.out.println("list of options"+ op.getText());
			if(op.getText().equals("java compiler")) {
				op.click();
			}
		}
		
		

	}

}
