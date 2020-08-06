package testNGFramework;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BankDemoOne {
		WebDriver driver;
		@Test (groups = "X")
		//browser opening
		public void a_browseropening() throws IOException {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://dbankdemo.com/login");
		driver.manage().window().maximize();
		getscreenshot();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		@Test (groups = "X")
		public void b_signup() {
		// sign up
		driver.findElement(By.partialLinkText("Sign Up He")).click();
		}
		@Test (groups = "X")
		public void c_personalinfo() throws IOException {
		//Personal Info
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);	
		Select title = new Select(driver.findElement(By.id("title")));
		title.selectByVisibleText("Mr.");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB,"John").build().perform();
		act.sendKeys(Keys.TAB,"Cool").build().perform();
		driver.findElement(By.xpath("(//input[@id='gender'])[1]")).click();
		act.sendKeys(Keys.TAB,"06/07/1972").build().perform();
		act.sendKeys(Keys.TAB,"109-08-6666").build().perform();
		act.sendKeys(Keys.TAB,"jan09@yopmail.com").build().perform();
		act.sendKeys(Keys.TAB,"Mukunth@05").build().perform();
		act.sendKeys(Keys.TAB,"Mukunth@05").build().perform();
		WebElement next = driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
		next.click();
		getscreenshot();
		}
		@Test (groups = "X")
		public void d_AddressInfo() throws IOException {
		//Address Info
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.id("address")).sendKeys("10 High Street");
		Actions act1 = new Actions(driver);
		act1.sendKeys(Keys.TAB,"Hounslow").build().perform();
		act1.sendKeys(Keys.TAB,"UK").build().perform();
		act1.sendKeys(Keys.TAB,"10005").build().perform();
		act1.sendKeys(Keys.TAB,"United Kingdom").build().perform();
		act1.sendKeys(Keys.TAB,"(044)786-7866").build().perform();
		act1.sendKeys(Keys.TAB,"(044)786-7866").build().perform();
		act1.sendKeys(Keys.TAB,"(044)786-7866").build().perform();
		driver.findElement(By.id("agree-terms")).click();
		WebElement reg = driver.findElement(By.xpath("//button[contains(text(),'Register')]"));
		reg.click();
		getscreenshot();
		}
		@Test (groups = "X")
		public void e_signin() {
		// sign in
		driver.findElement(By.id("password")).sendKeys("Mukunth@05");
		WebElement signin = driver.findElement(By.id("submit"));
		signin.click();
		}
		@Test (groups = "X")
		public void f_savingaccount() throws IOException {
		// create a new savings account
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.id("savings-menu")).click();
		driver.findElement(By.id("new-savings-menu-option")).click();
		driver.findElement(By.id("Savings")).click();
		driver.findElement(By.id("Individual")).click();
		driver.findElement(By.id("name")).sendKeys("Personal Savings");
		driver.findElement(By.id("openingBalance")).sendKeys("25000");
		driver.findElement(By.id("newSavingsSubmit")).click();
		getscreenshot();
		}
		@Test (groups = "X")
		public void g_companyaccount() throws IOException {
		// create another savings account
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.id("savings-menu")).click();
		driver.findElement(By.id("new-savings-menu-option")).click();
		driver.findElement(By.id("Savings")).click();
		driver.findElement(By.id("Individual")).click();
		driver.findElement(By.id("name")).sendKeys("Company Account");
		driver.findElement(By.id("openingBalance")).sendKeys("10000");
		driver.findElement(By.id("newSavingsSubmit")).click();
		getscreenshot();
		}
		@Test (groups = "X")
		public void h_transfer() throws IOException {
		//Transfer
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Transfer")).click();
		driver.findElement(By.linkText("Between Accounts")).click();
		driver.findElement(By.name("fromAccount")).click();
		Actions act3 = new Actions(driver);
		for (int from=0;from<1;from++) {
			act3.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		driver.findElement(By.id("toAccount")).click();
		for (int to=0;to<2;to++) {
			act3.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		driver.findElement(By.id("amount")).sendKeys("5000");
		driver.findElement(By.xpath("//button[text()=' Submit']")).click();
		getscreenshot();
		}
		
		public void getscreenshot() throws IOException {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("D:\\Selenium\\ScreenShots\\Screenshot" +System.currentTimeMillis()+ ".png"));
		}
		
		
		
	}


