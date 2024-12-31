package scipts;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions op=new ChromeOptions();
		
		
		HashMap<String, Object> hp=new HashMap<>();
		
		hp.put("profile.default_content_settings.popups",0);
		String dFilePath=System.getProperty("user.dir");
		hp.put("download.default_directory", dFilePath);
		
		op.setExperimentalOption("prefs",hp);
		
		
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		
		//check and delete any older file
		File downloadDir=new File(dFilePath);
		File [] downloadedFile=downloadDir.listFiles();
		
		if(downloadedFile!=null) {
			for(File fp:downloadedFile) {
				if(fp.getName().startsWith("APKFiles")) {
					fp.delete();
				}
			}
		}
		
		driver.get("https://codenboxautomationlab.com/practice/");
		driver.findElement(By.linkText("Download Apk files")).click();
		
		Thread.sleep(3000);
		//check whether the file is downloaded or not
		
		File downloadFile=new File(dFilePath+"\\APKFiles-1.zip");
		
		if(downloadFile.exists()) {
			System.out.println("File Downloaded");
		}else {
			System.out.println("File did not Downloaded");
		}
driver.quit();
	}
	

}
