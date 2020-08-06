package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("mukkar72@gmail.com");
		driver.findElement(By.id("enterimg")).click();
		String pagetitle = driver.getTitle();
		System.out.println("Page Title is :  "+pagetitle);
		driver.findElement(By.xpath("(//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required'])[1]")).sendKeys("Karthikeyan");
		//driver.findElement(By.xpath("(//div[@class='col-md-4 col-xs-4 col-sm-4'])[2]")).sendKeys("Rajaram"); not working
		
		
		

	}

}
