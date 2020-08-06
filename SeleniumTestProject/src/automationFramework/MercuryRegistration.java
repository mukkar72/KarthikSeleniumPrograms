package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryRegistration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		driver.findElement(By.name("firstName")).sendKeys("Karthikeyan");
		driver.findElement(By.name("lastName")).sendKeys("Rajaram");
		driver.findElement(By.name("phone")).sendKeys("9840372968");
		driver.findElement(By.id("userName")).sendKeys("mukkar72@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("New 30 Aziz Nagar First Street");
		driver.findElement(By.name("address2")).sendKeys("Kodambakkam");
		driver.findElement(By.name("city")).sendKeys("Chennai");
		driver.findElement(By.name("state")).sendKeys("TamilNadu");
		driver.findElement(By.name("postalCode")).sendKeys("600024");
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("BURMA ");
		driver.findElement(By.id("email")).sendKeys("mukkar72@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Mukunth@05");
		driver.findElement(By.name("confirmPassword")).sendKeys("Mukunth@05");
		driver.findElement(By.name("register")).click();
		driver.close();
		
		
	}

}
