package testNGFramework;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakingScreenShots {
	WebDriver driver;
	@Test
	public void browseropening() throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	driver.findElement(By.partialLinkText("Sign")).click();
	driver.findElement(By.id("email_create")).sendKeys("karthikeyan");
	driver.findElement(By.id("SubmitCreate")).click();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	getscreenshot();
	driver.findElement(By.id("email")).sendKeys("maran.yopmail.com");
	driver.findElement(By.id("passwd")).sendKeys("Mukunth@05");
	driver.findElement(By.id("SubmitLogin")).click();
	Thread.sleep(2000);
	getscreenshot();
	}
	public void getscreenshot() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:\\Selenium\\ScreenShots\\Screenshot" +System.currentTimeMillis()+ ".png"));
	}
	

}
