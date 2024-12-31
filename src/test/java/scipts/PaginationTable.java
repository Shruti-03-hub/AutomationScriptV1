package scipts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		int pages=driver.findElements(By.xpath("//ul[@class='pagination']//li")).size();
		double total=0.0;
		for(int i=1;i<=pages;i++) {
			driver.findElement(By.xpath("//ul[@class='pagination']//li[2]")).click();
			int rows=driver.findElements(By.xpath("//table[@id='productTable']//tr")).size();
			int cols=driver.findElements(By.xpath("//table[@id='productTable']//th")).size();
			
			//System.out.println(rows);
			//System.out.println(cols);
			
			for(int r=2;r<rows;r++) {
			String price=driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td[3]")).getText();
			price=price.replace("$", "");
			total=total+Double.parseDouble(price);
			//System.out.println(total);
			}
}System.out.println(total);

	}

}
