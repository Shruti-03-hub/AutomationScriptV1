package scipts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		//int row=driver.findElements(By.tagName("tr")).size(); //for single table in web page
		System.out.println(rows);
		
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println(cols);
		
		///read data from specfic row and col
		
		/*for(int i=2;i<=rows;i++) {
			for(int j=1;j<=cols;j++) {
				String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
				System.out.println(data+"\t");
			}
		
		
		//for reading bookname for specific author
			for(int i=2;i<=rows;i++) {
				
					String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText();
					//System.out.println(author+"\t");
					
					if(author.equals("Amit")) {
						
						String books=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
						System.out.println(books+"\t"+author);
					}
				}
			System.out.println();*/
			
			
			//find total price
			int total=0;
		for(int i=2;i<=rows;i++) {
			
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]")).getText();
			total=total+Integer.parseInt(price);
			System.out.println(total);
		
		
		
		}
			
	driver.quit();}
	

}
