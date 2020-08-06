package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReistrationFindFlight {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		driver.findElement(By.name("firstName")).sendKeys("Karthikeyan");
		driver.findElement(By.name("lastName")).sendKeys("Rajaram");
		driver.findElement(By.name("phone")).sendKeys("9840372968");
		driver.findElement(By.id("userName")).sendKeys("mukkar10@outlook.com");
		driver.findElement(By.name("address1")).sendKeys("30 Aziz Nagar First Street");
		driver.findElement(By.name("address2")).sendKeys("Kodambakkam");
		driver.findElement(By.name("city")).sendKeys("Chennai");
		driver.findElement(By.name("state")).sendKeys("TamilNadu");
		driver.findElement(By.name("postalCode")).sendKeys("600024");
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("INDIA ");
		driver.findElement(By.id("email")).sendKeys("mukkar10@outlook.com");
		driver.findElement(By.name("password")).sendKeys("Mukunth@05");
		driver.findElement(By.name("confirmPassword")).sendKeys("Mukunth@05");
		WebElement Finish = driver.findElement(By.name("register"));
		Finish.click();
		driver.findElement(By.xpath("//a[contains(text(),'sign-in')]")).click();
		driver.findElement(By.name("userName")).sendKeys("mukkar10@outlook.com");
		driver.findElement(By.name("password")).sendKeys("Mukunth@05");
		driver.findElement(By.name("login")).click();
		WebElement triptype = driver.findElement(By.xpath("(//input[@name='tripType'])[2]"));
		triptype.click();
		Select noofpax = new Select(driver.findElement(By.name("passCount")));
		noofpax.selectByVisibleText("2");
		Select from = new Select(driver.findElement(By.name("fromPort")));
		from.selectByVisibleText("Frankfurt");
		Select month = new Select(driver.findElement(By.name("fromMonth")));
		month.selectByVisibleText("July");
		Select day = new Select(driver.findElement(By.name("fromDay")));
		day.selectByVisibleText("1");
		Select to = new Select(driver.findElement(By.name("toPort")));
		to.selectByVisibleText("London");
		WebElement bookingclass = driver.findElement(By.xpath("(//input[@name='servClass'])[3]"));
		bookingclass.click();
		Select airline = new Select(driver.findElement(By.name("airline")));
		airline.selectByVisibleText("Unified Airlines");
		driver.findElement(By.name("findFlights")).click();
		
		
		

	}

}
