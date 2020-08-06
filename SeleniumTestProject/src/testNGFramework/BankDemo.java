package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BankDemo {
		WebDriver driver;
		@Test (priority = 1)
		public void browseropen() {
	
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://dbankdemo.com/login");
		driver.manage().window().maximize();
		}
		//Sign Up
		@Test (priority = 2)
		public void signup() {
		driver.findElement(By.partialLinkText("Sign Up He")).click();
		Select title = new Select(driver.findElement(By.id("title")));
		title.selectByVisibleText("Mr.");
		driver.findElement(By.id("firstName")).sendKeys("Karthik");
		driver.findElement(By.id("lastName")).sendKeys("Rajaram");
		driver.findElement(By.xpath("(//input[@id='gender'])[1]")).click();
		driver.findElement(By.id("dob")).sendKeys("07/06/1972");
		driver.findElement(By.id("ssn")).sendKeys("222-90-8899");
		driver.findElement(By.id("emailAddress")).sendKeys("july401karthik@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("Mukunth@05");
		driver.findElement(By.id("confirmPassword")).sendKeys("Mukunth@05");
		WebElement next = driver.findElement(By.xpath("//button[text()='Next']"));
		next.click();
		}
		//Address Details
		@Test (priority = 3)
		public void address() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("address")).sendKeys("New30 old 22 A Kodambakkam");
		driver.findElement(By.id("locality")).sendKeys("NewYork");
		driver.findElement(By.id("region")).sendKeys("NewYork");
		driver.findElement(By.id("postalCode")).sendKeys("78605");
		driver.findElement(By.id("country")).sendKeys("United States");
		driver.findElement(By.id("homePhone")).sendKeys("(786) 392-5436");
		driver.findElement(By.id("mobilePhone")).sendKeys("(786) 792-5436");
		driver.findElement(By.id("workPhone")).sendKeys("(786) 792-5436");
		driver.findElement(By.id("agree-terms")).click();
		WebElement register = driver.findElement(By.xpath("//button[text()='Register']"));
		register.click();
		}
		//Sign In
		@Test (priority = 4)
		public void signin() {
			driver.findElement(By.id("password")).sendKeys("Mukunth@05");
			driver.findElement(By.id("submit")).click();
		}
		//New Checking
		@Test (priority = 5)
		public void newchecking() throws InterruptedException {
			Thread.sleep(3000);
			WebElement nc = driver.findElement(By.xpath("//h3[contains(text(),'Banking Accounts')]/following::a[1]"));
			nc.click();
			driver.findElement(By.linkText("New Checking")).click();
		}
		// Account Creation
		@Test (priority = 6)
		public void acountcreation() {
			driver.findElement(By.id("Standard Checking")).click();
			driver.findElement(By.id("Individual")).click();
			driver.findElement(By.id("name")).sendKeys("Personal");
			driver.findElement(By.id("openingBalance")).sendKeys("2500");
			driver.findElement(By.xpath("//button[text()=' Submit']")).click();
		}
		@Test (priority = 7)
		public void deposit() throws InterruptedException {
			Thread.sleep(4000);
			driver.findElement(By.linkText("Transactions")).click();
			driver.findElement(By.xpath("//a[text()='Deposit']")).click();
			Select account = new Select(driver.findElement(By.id("id")));
			account.selectByVisibleText("Personal  -  (Standard Checking)  -  ($2500.00)");
			driver.findElement(By.id("amount")).sendKeys("10000");
			driver.findElement(By.xpath("//button[text()=' Submit']")).click();
			
		}
		@Test (priority = 8)
		public void withdraw() throws InterruptedException {
			Thread.sleep(4000);
			driver.findElement(By.linkText("Transactions")).click();
			driver.findElement(By.linkText("Withdraw")).click();
			driver.findElement(By.name("id")).click();
			Actions act = new Actions(driver);
			act.sendKeys(Keys.ARROW_DOWN).build().perform();
			act.sendKeys(Keys.ENTER).build().perform();
			//Select account = new Select(driver.findElement(By.name("id")));
			//account.selectByVisibleText("Personal  -  (Standard Checking)  -  ($12500.00))");
			driver.findElement(By.id("amount")).sendKeys("1000");
			driver.findElement(By.xpath("//button[text()=' Submit']")).click();
		}

	}


