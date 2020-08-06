package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractise {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email")).sendKeys("may26th2019@yopmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Passw0rd$123");
		driver.findElement(By.id("SubmitLogin")).click();
		//Print Title
		String pagetitle = driver.getTitle();
		System.out.println("Page Title is:  "+pagetitle);
		//Page URL
		String url = driver.getCurrentUrl();
		System.out.println("Page URL is :  "+url);
		//Text in the Page
		String text = driver.findElement(By.xpath("//h1[contains(text(),'My account')]")).getText();
		System.out.println("Text in the Page:  "+text);
		//To identify Tag
		String Tag = driver.findElement(By.linkText("Women")).getTagName();
		System.out.println("Tag Name:  "+Tag); 
		//css value
		String Font = driver.findElement(By.linkText("Women")).getCssValue("font");
		System.out.println(Font);
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		driver.close();
		
		
		
		

	}

}
