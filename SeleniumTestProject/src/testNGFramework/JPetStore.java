package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class JPetStore {
		WebDriver driver;
		@Test (priority=1)
		public void browseropening() {
		//browser opening
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		driver.manage().window().maximize();
		}
		@Test (priority=2)
		public void signin() {
		//Sign In
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		}
		@Test  (priority=3)
		public void register() {
		//Register now
		driver.findElement(By.xpath("//a[contains(text(),'Register Now!')]")).click();
		}
		@Test   (priority=4)
		public void userinfo() {
		// user information
		driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::input[1]")).sendKeys("jul200karthik@yopmail.com");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB,"Mukunth@05").build().perform();
		act.sendKeys(Keys.TAB,"Mukunth@05").build().perform();
		}
		@Test  (priority=5)
		public void accountinfo() {
		//Account Information
		Actions act1 = new Actions(driver);	
		act1.sendKeys(Keys.TAB,"Karthikeyannn").build().perform();
		act1.sendKeys(Keys.TAB,"Rajaram").build().perform();
		act1.sendKeys(Keys.TAB,"jun72karthik@yopmail.com").build().perform();
		act1.sendKeys(Keys.TAB,"9840300000").build().perform();
		act1.sendKeys(Keys.TAB,"Kodoambakkam").build().perform();
		act1.sendKeys(Keys.TAB,"Aziz Nagar").build().perform();
		act1.sendKeys(Keys.TAB,"Chennai").build().perform();
		act1.sendKeys(Keys.TAB,"TN").build().perform();
		act1.sendKeys(Keys.TAB,"600024").build().perform();
		act1.sendKeys(Keys.TAB,"India").build().perform();
		}
		@Test  (priority=6)
		public void profileinfo() {
		//Profile Info
		Select lang = new Select(driver.findElement(By.name("account.languagePreference")));
		lang.selectByVisibleText("english");
		Select category = new Select(driver.findElement(By.name("account.favouriteCategoryId")));
		category.selectByVisibleText("DOGS");
		driver.findElement(By.name("account.listOption")).click();
		driver.findElement(By.name("account.bannerOption")).click();
		WebElement save = driver.findElement(By.name("newAccount"));
		save.click();
		}
		@Test  (priority=7)
		public void signtoapp() {
		// sign to app
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("username")).sendKeys("jul200karthik@yopmail.com");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Mukunth@05");
		driver.findElement(By.name("signon")).click();
		}
		@Test  (priority=8)
		public void searchdog() {
		// search dog
		driver.findElement(By.xpath("//div[@id='WelcomeContent']/following::img[2]")).click();
		driver.findElement(By.linkText("K9-BD-01")).click();
		driver.findElement(By.linkText("EST-6")).click();
		WebElement cart = driver.findElement(By.linkText("Add to Cart"));
		cart.click();
		}
		@Test  (priority=9)
		public void checkout( ) {
		// checkout
		driver.findElement(By.linkText("Proceed to Checkout")).click();
		driver.findElement(By.name("newOrder")).click();
		driver.findElement(By.linkText("Confirm")).click();
		String orderno = driver.findElement(By.xpath("//th[contains(text(),'Order #')]")).getText();
		System.out.println("Your Order Confirmation Number is :"+orderno);
		}

	}


