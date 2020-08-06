package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		WebElement prompt= driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]"));
		prompt.click();
		Thread.sleep(3000);
		Alert pro = driver.switchTo().alert();
		String prompt1 = pro.getText();
		System.out.println(prompt1);
		Thread.sleep(3000);
		pro.sendKeys("Karthikeyan");
		pro.accept();
		String myname = driver.findElement(By.xpath("//p[contains(text(),'You have entered')]")).getText();
		System.out.println(myname);
		
		

	}

}
