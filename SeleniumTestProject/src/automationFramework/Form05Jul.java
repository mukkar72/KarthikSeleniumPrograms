package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form05Jul {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sqengineer.com/practice-sites/basic-web-elements/");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Karthikeyan");
		driver.findElement(By.id("lastName")).sendKeys("Rajaram");
		driver.findElement(By.id("maleGender")).click();
		driver.findElement(By.id("email")).sendKeys("mukkar72@gmail.com");
		Select city = new Select(driver.findElement(By.id("selectBox")));
		city.selectByValue("LA");
		String text = driver.findElement(By.xpath("//b[contains(text(),'Read this text and print the output')]")).getText();
		System.out.println("Text in the page"+text);
		driver.findElement(By.xpath("(//select[@id='selectBox']/following::input)[1]")).click();
		
		

	}

}
