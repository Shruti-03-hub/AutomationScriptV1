package scipts;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import sun.net.www.protocol.http.HttpURLConnection;

public class BrokenLinkClass {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("size of link :" +links.size());
		
		for(WebElement link:links) {
			String hrefA=link.getDomAttribute("href");
			
			if(hrefA==null ||hrefA.isEmpty()) {
				System.out.println("Can not validate");
			}
			try {
			//hit the url to server
			//convert link from string to URL
			URL linkUrl=new URL(hrefA);
			
			HttpURLConnection conLink=(HttpURLConnection) linkUrl.openConnection(); // open the connection
			conLink.connect(); //connect server and sent request
			if(conLink.getResponseCode()>=400) {
				System.out.println("Link is broken");
			}else {
				System.out.println("Link is not broken");
			}
				
			}catch(Exception e) {
				e.getMessage();
			}
			
		}

	}

}
