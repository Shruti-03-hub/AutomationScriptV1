package scipts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSL_CertificationIssue {

	public static void main(String[] args) {
		
		ChromeOptions op=new ChromeOptions();
		op.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver(op);
		
		driver.manage().window().maximize();
		driver.get("https://self-signed.badssl.com");
		System.out.println("Title is :" +driver.getTitle());

		driver.quit();
	}

}
