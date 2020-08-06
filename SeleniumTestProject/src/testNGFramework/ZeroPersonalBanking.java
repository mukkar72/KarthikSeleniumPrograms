package testNGFramework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ZeroPersonalBanking {
		WebDriver driver;
		@Test (priority=1)
		public void browserinitiation() {
		//Browser Initiation
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/index.html");
		driver.manage().window().maximize();
		}
		
		@Test (priority=2)
		public void sigin() {
		// Sign in
		driver.findElement(By.id("signin_button")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		driver.findElement(By.id("user_password")).sendKeys("password");
		WebElement signin = driver.findElement(By.name("submit"));
		signin.click();
		}
		@Test (priority=3)
		public void Brokerage() {
		//Click on Brokerage
		driver.findElement(By.linkText("Brokerage")).click();
		Select account = new Select(driver.findElement(By.id("aa_accountId")));
		account.selectByVisibleText("Savings");
		}
		@Test (priority=4)
		public void Signout() {
		//Sign out
		driver.findElement(By.xpath("//input[@id='searchTerm']/following::a[5]")).click();
		driver.findElement(By.id("logout_link")).click();
		}
		
				

	}


