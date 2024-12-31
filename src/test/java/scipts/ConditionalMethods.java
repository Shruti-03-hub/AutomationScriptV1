package scipts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		boolean status=driver.findElement(By.xpath("//a[text()='Best Sellers']")).isDisplayed()	;
		System.out.println(status);
		boolean st=driver.findElement(By.xpath("//a[text()='Sell']")).isEnabled();
		System.out.println(st);
		driver.quit();
	}

}
