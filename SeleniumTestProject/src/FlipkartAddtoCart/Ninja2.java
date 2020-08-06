package FlipkartAddtoCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ninja2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Cameras']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='input-limit']/following::img[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("button-cart")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Shopping Cart')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='account'])[2]")).click();
		driver.findElement(By.id("button-account")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("input-payment-firstname")).sendKeys("Karthik");
		driver.findElement(By.id("input-payment-lastname")).sendKeys("Raja");
		driver.findElement(By.id("input-payment-email")).sendKeys("july7karthik@yopmail.com");
		driver.findElement(By.id("input-payment-telephone")).sendKeys("9840372696");
		Thread.sleep(3000);
		driver.findElement(By.id("input-payment-address-1")).sendKeys("Test");
		driver.findElement(By.id("input-payment-city")).sendKeys("Chennai");
		driver.findElement(By.id("input-payment-postcode")).sendKeys("600024");
		Select Country = new Select(driver.findElement(By.id("input-payment-country")));
		Thread.sleep(5000);
		Country.selectByVisibleText("India");
		Select State = new Select(driver.findElement(By.id("input-payment-zone")));
		Thread.sleep(5000);
		State.selectByVisibleText("Tamil Nadu");
		Thread.sleep(2000);
		driver.findElement(By.id("button-guest")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("comment")).sendKeys("Deliver to the mentioned Address");
		Thread.sleep(2000);
		driver.findElement(By.id("button-shipping-method")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("agree")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("button-payment-method")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("button-confirm")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Login'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("input-email")).sendKeys("july7karthik@yopmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("input-password")).sendKeys("Mukunth@05");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten Password')]/following::input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Order History')])[2]")).click();
		
		

	}

}
