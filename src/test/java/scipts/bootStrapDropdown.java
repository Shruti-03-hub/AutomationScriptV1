package scipts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootStrapDropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		
		List<WebElement>list=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//a"));
		for(WebElement li:list) {
			System.out.println(li.getText());
			if(li.getText().equals("Angular") || li.getText().equals("Python")){
				li.click();
			}
			
			}
		}
	
	

}
