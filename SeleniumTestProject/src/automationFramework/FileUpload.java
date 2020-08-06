package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		WebElement upload = driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("C://Users//DELL//Pictures//Saved Pictures//New Bitmap Image.bmp");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();

	}

}
