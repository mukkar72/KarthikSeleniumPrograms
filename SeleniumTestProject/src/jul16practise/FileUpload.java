package jul16practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uitestpractice.com/Students/Widgets");
		driver.manage().window().maximize();
		WebElement chosefile =driver.findElement(By.id("image_file"));
		chosefile.sendKeys("C://Users//DELL//Pictures//Saved Pictures//New Bitmap Image.bmp");
		driver.findElement(By.xpath("//input[@id='image_file']/following::input")).click();
		Thread.sleep(5000);
		String success = driver.findElement(By.xpath("//p[contains(text(),'Successfully')]")).getText();
		System.out.println(success);
		
		
		
		

	}

}
