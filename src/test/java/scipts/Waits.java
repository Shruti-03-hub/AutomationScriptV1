package scipts;

import java.time.Duration;
import java.util.NoSuchElementException;
//import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Waits {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[text()='Best Sellers']")).click();		
		//driver.findElement(By.xpath("//a[text()='Sell']")).click();
		WebElement element=driver.findElement(By.xpath("//img[@alt='OnePlus Bullets Z2 Bluetooth Wireless in Ear Earphones with Mic, Bombastic Bass - 12.4 Mm Drivers, 10 Mins Charge - 20 Hrs Mu']"));
		//Explicit wait
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.elementToBeClickable(element));
//		
//		element.click();
		
		
		driver.close();
		

	}

}
