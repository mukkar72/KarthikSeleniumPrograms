package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSecurityMyPractise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("signin_button")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		driver.findElement(By.id("user_password")).sendKeys("password");
		driver.findElement(By.name("submit")).click();
		String pagetitle = driver.getTitle();
		System.out.println("Page Title is:"+pagetitle);
		String pageurl = driver.getCurrentUrl();
		System.out.println("Page URL Is :  "+pageurl);
		String investments = driver.findElement(By.xpath("//h2[contains(text(),'Investment Accounts')]")).getText();
		System.out.println("Text in the Page:  "+investments);
		String tagname = driver.findElement(By.linkText("Account Activity")).getTagName();
		System.out.println("HTML Tag Name :  "+tagname);
		String partial = driver.findElement(By.partialLinkText("Activity")).getAttribute("href");
		System.out.println("Partial example :  "+partial);
		String fontsize = driver.findElement(By.linkText("Transfer Funds")).getCssValue("font-size");
		System.out.println("Fontsize :  "+fontsize);
		driver.close();
		

	}

}
