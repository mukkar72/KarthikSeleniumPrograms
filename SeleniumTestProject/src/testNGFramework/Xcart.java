package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Xcart {
		WebDriver driver;
		@Test (priority=1)
		public void browseropening() {
		//browser opening
		System.setProperty("webdriver.chrome.driver","D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demostore.x-cart.com/");
		driver.manage().window().maximize();
		}
		@Test (priority=2)
		public void signup() {
		//click signup
		driver.findElement(By.xpath("(//span[contains(text(),'Sign in / sign up')])[2]")).click();
		}
		@Test (priority=3)
		public void createaccount() throws InterruptedException {
		// click create a new account
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[contains(text(),'Sign in')])[6]/following::a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("login")).sendKeys("july1001karthik@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("Mukunth@05");
		driver.findElement(By.id("password-conf")).sendKeys("Mukunth@05");
		WebElement create = driver.findElement(By.xpath("//span[contains(text(),'Create')]"));
		create.click();
		}
		@Test (priority=4)
		public void search() throws InterruptedException {
		//search
		Thread.sleep(3000);
		WebElement hotdeals = driver.findElement(By.xpath("(//span[contains(text(),'Hot deals')])[2]"));
		Actions mo = new Actions(driver);
		mo.moveToElement(hotdeals).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Sale'])[2]")).click();
		}
		@Test  (priority=5)
		public void cart() throws InterruptedException {
		// select a product and click add to cart
		driver.findElement(By.xpath("//a[contains(text(),'Bluetooth Smartwatch')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(text(),'Add to cart')])[1]")).click();
		}
		@Test (priority=6)
		public void checkout() throws InterruptedException {
		// checkout
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(text(),'Checkout')])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("shippingaddress-firstname")).sendKeys("Karthikeya");
		driver.findElement(By.id("shippingaddress-lastname")).sendKeys("Rajaram");
		driver.findElement(By.id("shippingaddress-street")).sendKeys("Kodambakkam");
		driver.findElement(By.id("shippingaddress-city")).clear();
		driver.findElement(By.id("shippingaddress-city")).sendKeys("Chennai");
		Select state = new Select(driver.findElement(By.id("shippingaddress-state-id")));
		state.selectByVisibleText("Tamil Nadu");
		driver.findElement(By.id("shippingaddress-zipcode")).sendKeys("600034");
		driver.findElement(By.id("shippingaddress-phone")).sendKeys("9840300000");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("july601karthik@yopmail.com");
		WebElement shipping = driver.findElement(By.xpath("//button[contains(text(),'Choose shipping')]"));
		shipping.click();
		}
		@Test (priority=7)
		public void payment() throws InterruptedException {
		// payment
		WebElement payment = driver.findElement(By.xpath("//button[contains(text(),'Proceed to payment')]"));
		payment.click();
		driver.findElement(By.id("pmethod6")).click();
		Thread.sleep(3000);
		WebElement placeorder = driver.findElement(By.xpath("(//button[contains(text(),'Place order')])[2]"));
		placeorder.click();
		}
		
		
	}


