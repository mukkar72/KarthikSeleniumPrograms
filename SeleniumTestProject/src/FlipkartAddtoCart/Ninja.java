package FlipkartAddtoCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ninja {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		String PageURL = driver.getCurrentUrl();
		System.out.println("The Page URL is :"+PageURL  );
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		String PageURL1 = driver.getCurrentUrl();
		System.out.println("The Page URL is :"+PageURL1  );
		Thread.sleep(2000);
		driver.findElement(By.id("input-firstname")).sendKeys("Karthikeyan");
		driver.findElement(By.id("input-lastname")).sendKeys("Rajaram");
		driver.findElement(By.id("input-email")).sendKeys("july7karthik@yopmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9840372969");
		driver.findElement(By.id("input-password")).sendKeys("Mukunth@05");
		driver.findElement(By.id("input-confirm")).sendKeys("Mukunth@05");
		WebElement subscribe = driver.findElement(By.xpath("//label[contains(text(),'Subscribe')]/following::input[1]"));
		subscribe.click();
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@name='agree']/following::input")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Your Store')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Wish List (0)')]")).click();
		driver.findElement(By.id("input-email")).sendKeys("july7karthik@yopmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Mukunth@05");
		driver.findElement(By.xpath("(//a[contains(text(),'Forgotten Password')])[1]/following::input")).click();
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		driver.findElement(By.xpath("(//a[text()='Desktops'])[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Show All Desktops')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='input-limit']/following::img[3]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'HP LP3065')]/preceding::img[1]")).click(); was working but currently not working
		driver.findElement(By.xpath("//h1[contains(text(),'HP LP3065')]/preceding::button[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Wish List')]")).click();
		//add to cart
		driver.findElement(By.xpath("//a[contains(text(),'Continue')]/preceding::button[1]")).click();
		Thread.sleep(2000);
		//click the button add to cart
		driver.findElement(By.id("button-cart")).click();
		//click the shopping cart icon in the tool bar
		driver.findElement(By.xpath("//span[contains(text(),'Shopping Cart')]")).click();
		//click Estimate Shipping & Taxes
		driver.findElement(By.xpath("//a[contains(text(),'Estimate Shipping & Taxes ')]")).click();
		// select country
		Select country = new Select(driver.findElement(By.id("input-country")));
		country.selectByVisibleText("India");
		
		Select state = new Select(driver.findElement(By.name("zone_id")));
		Thread.sleep(4000);
		state.selectByValue("1503");
		//enter postal code
		driver.findElement(By.id("input-postcode")).sendKeys("600024");
		//click get quote
		driver.findElement(By.id("button-quote")).click();
		//select flat rate
		Thread.sleep(3000);
		WebElement flat = driver.findElement(By.name("shipping_method"));
		flat.click();
		WebElement Apply = driver.findElement(By.id("button-shipping"));
		Apply.click();
		//String success = driver.findElement(By.xpath("//a[contains(text(),'Shopping Cart')]/following::div[1]")).getText();
		//System.out.println("Success Message  :" +success);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.id("button-payment-address"))).click();
		driver.findElement(By.id("button-payment-address")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("button-shipping-address")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("comment")).sendKeys("Deliver to the mentioned Address");
		driver.findElement(By.id("button-shipping-method")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[contains(text(),'Terms & Conditions')]/following::input[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("button-payment-method")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("button-confirm")).click();
		Thread.sleep(3000);
		String con = driver.findElement(By.xpath("//h1[contains(text(),'Your order has been placed!')]")).getText();
		System.out.println(con);
				
		//String confirmation = driver.findElement(By.xpath("//h1[contains(text(),'placed')])]")).getText();
		//System.out.println("Order Confirmation  :"+confirmation);
		String text = driver.findElement(By.xpath("//p[contains(text(),'Your order has been successfully processed!')]")).getText();
		System.out.println(text);
		
		
		
		
		
		
		

	}

}
