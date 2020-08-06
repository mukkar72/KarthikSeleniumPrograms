package FlipkartAddtoCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JioMart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jiomart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("rel_pincode")).sendKeys("600024");
		driver.findElement(By.xpath("//button[contains(text(),'APPLY')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("search")).sendKeys("vegetables");
		driver.findElement(By.xpath("//button[@class='iconSearch']")).click();
		String PageTitle = driver.getTitle();
		System.out.println("The Page Title is  :"  +PageTitle);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(text(),' Coconut 1 pc ')])[1]")).click();
		Select qty = new Select(driver.findElement(By.id("qty")));
		qty.selectByValue("3");
		driver.findElement(By.id("product-addtocart-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='cart_text']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Remove')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Search with List')]/preceding::img")).click();
		driver.findElement(By.xpath("//span[contains(text(),' Dals & Pulses ')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'High to Low')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[contains(text(),'Pro Nature Organic Foods Pvt Limited')])[1]")).click();
		

	}

}
