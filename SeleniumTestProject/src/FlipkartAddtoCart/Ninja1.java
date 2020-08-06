package FlipkartAddtoCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ninja1 {
	
	/*click on cannon
	Print Model number link text
	Select Color
	Click Add to Cart
	Goto Shopping Cart
	Click Check Out
	click Continue in Billing Details
	click Continue in Delivery Details
	Add a comment and click continue
	check Terms and Condition
	Click Continue
	click Confirm Order
	Click My Account
	Click Order History*/
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
				//click on cameras
		
		//driver.findElement(By.xpath("(//a[contains(text(),'Canon EOS 5D')])[2]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Cameras')])[2]")).click();
		Thread.sleep(3000);
		//click on cannon
		driver.findElement(By.xpath("//select[@id='input-limit']/following::img[1]")).click();
		// select color
		Select color = new Select(driver.findElement(By.id("input-option226")));
		color.selectByVisibleText("Blue");
		//click Add to Cart
		WebElement Add = driver.findElement(By.id("button-cart"));
		Add.click();
		// to print the success message
		//String success = driver.findElement(By.xpath("//div[contains(text(),'Success: You have added ')]")).getText();
		//System.out.println("Success Message  :"+success);
		Thread.sleep(3000);
		// click shopping cart
		driver.findElement(By.xpath("//span[contains(text(),'Shopping Cart')]")).click();
		//String text = driver.findElement(By.xpath("//h1[contains(text(),'Shopping Cart')]")).getText();
		//System.out.println(text);
		driver.findElement(By.xpath("//a[text()='Checkout']")).click();
		//select guest check out
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@name='account'])[2]")).click();
		driver.findElement(By.id("button-account")).click();
		//enter billing details
		Thread.sleep(5000);
		driver.findElement(By.id("input-payment-firstname")).sendKeys("Karthik");
		driver.findElement(By.id("input-payment-lastname")).sendKeys("Raja");
		driver.findElement(By.id("input-payment-email")).sendKeys("july7karthik@yopmail.com");
		driver.findElement(By.id("input-payment-telephone")).sendKeys("9840372969");
		Thread.sleep(5000);
		driver.findElement(By.id("input-payment-address-1")).sendKeys("High Street");
		driver.findElement(By.id("input-payment-city")).sendKeys("London");
		driver.findElement(By.id("input-payment-postcode")).sendKeys("600024");
		Select country = new Select(driver.findElement(By.id("input-payment-country")));
		country.selectByVisibleText("Turkey");
		Select state = new Select(driver.findElement(By.id("input-payment-zone")));
		Thread.sleep(4000);
		state.selectByValue("3315");
		driver.findElement(By.id("button-guest")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("comment")).sendKeys("Delever to Address mentioned");
		Thread.sleep(3000);
		driver.findElement(By.id("button-shipping-method")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("agree")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("button-payment-method")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("button-confirm")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		
	
		


	}

}
