package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AP {
	WebDriver driver;

	@Test (priority=1)
	public void BrowserInitiation() {
		//Browser initiation
				System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("http://automationpractice.com/index.php");
				driver.manage().window().maximize();
	}
	
	@Test (priority=2)
	public void signin() {
				//Sign In
				driver.findElement(By.className("login")).click();
				driver.findElement(By.id("email_create")).sendKeys("Jack20@yopmail.com");
				WebElement submit = driver.findElement(By.id("SubmitCreate"));
				submit.click();
	}
	@Test (priority=3)
	public void personalinfo() throws InterruptedException {
				//Personal Info
				Thread.sleep(5000);
				driver.findElement(By.id("id_gender1")).click();
				driver.findElement(By.id("customer_firstname")).sendKeys("Jack");
				driver.findElement(By.id("customer_lastname")).sendKeys("daniel");
				driver.findElement(By.id("passwd")).sendKeys("Mukunth@05");
				Select day =new Select(driver.findElement(By.id("days")));
				day.selectByVisibleText("10  ");
				Select month = new Select(driver.findElement(By.id("months")));
				month.selectByVisibleText("October ");
				Select year = new Select(driver.findElement(By.id("years")));
				year.selectByVisibleText("2000  ");
	}
	@Test (priority=4)
	public void addressinfo() {
				//Address Info
				driver.findElement(By.id("firstname")).sendKeys("Jack");
				driver.findElement(By.id("lastname")).sendKeys("daniel");
				driver.findElement(By.id("address1")).sendKeys("Kodambakkam");
				driver.findElement(By.id("city")).sendKeys("Newyork");
				Select state = new Select(driver.findElement(By.id("id_state")));
				state.selectByVisibleText("New York");
				driver.findElement(By.id("postcode")).sendKeys("10005");
				driver.findElement(By.id("phone_mobile")).sendKeys("9845200000");
				WebElement register = driver.findElement(By.id("submitAccount"));
				register.click();
	}

	}


