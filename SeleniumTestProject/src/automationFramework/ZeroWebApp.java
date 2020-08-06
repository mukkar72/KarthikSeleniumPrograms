package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroWebApp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("signin_button")).click();
		driver.findElement(By.name("user_login")).sendKeys("username");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
		driver.findElement(By.name("submit")).click();
		String PageTitle = driver.getTitle();
		System.out.println(PageTitle);
		String pageurl = driver.getCurrentUrl();
		System.out.println(pageurl);
		// to get a text from the page
		String Cash = driver.findElement(By.xpath("//h2[contains(text(),'Cash Accounts')]")).getText();
		System.out.println(Cash);
		// to get link by tag name
		String Tag = driver.findElement(By.linkText("Account Activity")).getTagName();
		System.out.println(Tag);
		//Partial Link
		String Partial = driver.findElement(By.partialLinkText("Activity")).getAttribute("href");
		System.out.println(Partial);
		// By CSS
		String font = driver.findElement(By.linkText("Account Activity")).getCssValue("font-size");
		System.out.println(font);
		driver.close();
		
		

	}

}
