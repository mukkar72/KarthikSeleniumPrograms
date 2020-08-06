package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediff {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//u[contains(text(),'Create a new account')]")).click();
		driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[1]")).sendKeys("Karthikeyan");
		driver.findElement(By.xpath("//td[contains(text(),'Choose a Rediffmail ID')]/following::input[1]")).sendKeys("mukkar72");
		driver.findElement(By.xpath("//td[contains(text(),'Choose a Rediffmail ID')]/following::input[2]")).click();
		driver.findElement(By.xpath("//td[contains(text(),'Password')]/following::input[1]")).sendKeys("Mukunth@05");
		driver.findElement(By.xpath("//td[contains(text(),'Retype password')]/following::input[1]")).sendKeys("Mukunth@05");
		driver.findElement(By.xpath("//td[contains(text(),'Alternate Email Address')]/following::input[1]")).sendKeys("mukkar72@gmail.com");
		driver.findElement(By.xpath("//div[@id='country_id']/following::input[2]")).sendKeys("9840372968");
		Select day = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::select[1]")));
		day.selectByVisibleText("07");
		Select month = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::select[2]")));
		month.selectByVisibleText("JUN");
		Select year = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::select[3]")));
		year.selectByVisibleText("1972");
		Select country = new Select(driver.findElement(By.xpath("//span[contains(text(),'Country')]/following::select[1]")));
		country.selectByVisibleText("India");
		Select city = new Select(driver.findElement(By.xpath("//td[contains(text(),'City')]/following::select")));
		city.selectByVisibleText("Chennai");
		//driver.findElement(By.xpath("//input[@class='captcha']")).sendKeys("BLCD"); how to handle captcha
		
		String textinpage = driver.findElement(By.xpath("//b[contains(text(),'chosen is available.')]")).getText();
		System.out.println("The Text is :"+textinpage);
		
		Thread.sleep(15000);
		driver.findElement(By.id("Register")).click();
		
		
		
		

	}

}
