package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EcommerceSite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email_create")).sendKeys("july11karthik@yopmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("SubmitCreate")).click();
		Thread.sleep(3000);
		String account = driver.findElement(By.xpath("//h1[contains(text(),'Create an account')]")).getText();
		Thread.sleep(3000);
		System.out.println("Create an Account"+account);
		Thread.sleep(3000);
		WebElement title = driver.findElement(By.xpath("//label[contains(text(),'Title')]/following::label[1]"));
		Thread.sleep(3000);
		title.click();
		Thread.sleep(3000);
		driver.findElement(By.id("customer_firstname")).sendKeys("Karthi");
		driver.findElement(By.id("customer_lastname")).sendKeys("Raja");
		driver.findElement(By.id("passwd")).sendKeys("Mukunth@05");
		Select day = new Select(driver.findElement(By.id("days")));
		Thread.sleep(3000);
		day.selectByVisibleText("7  ");
		Select month = new Select(driver.findElement(By.id("months")));
		Thread.sleep(3000);
		month.selectByVisibleText("June ");
		Select years = new Select(driver.findElement(By.id("years")));
		Thread.sleep(3000);
		years.selectByVisibleText("1972  ");
		driver.findElement(By.xpath("//label[contains(text(),'Sign up for our newsletter!')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Receive special offers from our partners!')]")).click();
		driver.findElement(By.id("address1")).sendKeys("Aziz Nagar");
		driver.findElement(By.id("city")).sendKeys("Chennai");
		Select state = new Select(driver.findElement(By.id("id_state")));
		Thread.sleep(3000);
		state.selectByVisibleText("New York");
		driver.findElement(By.id("postcode")).sendKeys("60003");
		Select country = new Select(driver.findElement(By.id("id_country")));
		Thread.sleep(3000);
		country.selectByVisibleText("United States");
		driver.findElement(By.id("phone_mobile")).sendKeys("9840372956");
		driver.findElement(By.id("alias")).sendKeys("Kodambakkam");
		Thread.sleep(3000);
		driver.findElement(By.id("submitAccount")).click();
		
		
		
		
		

	}

}
