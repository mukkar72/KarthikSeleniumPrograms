package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EcommerceSite1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
	driver.findElement(By.id("email")).sendKeys("july11karthik@yopmail.com");
	driver.findElement(By.id("passwd")).sendKeys("Mukunth@05");
	driver.findElement(By.id("SubmitLogin")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//a[contains(text(),'Dresses')])[5]")).click();
	driver.findElement(By.xpath("//a[text()='List']")).click();
	String count = driver.findElement(By.xpath("//span[contains(text(),'There are 5 products.')]")).getText();
	Thread.sleep(2000);
	System.out.println("Product Count  =  "+count);
	Thread.sleep(3000);
	//driver.findElement(By.xpath("(//div[contains(text(),'Showing 1 - 5 of 5 items')])[1]/following::img[1]")).click();check how to click an image with wider area
	driver.findElement(By.id("color_13")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='quantity_wanted']/following::i[2]")).click();
	Select size = new Select(driver.findElement(By.id("group_1")));
	size.selectByVisibleText("L");
	/*driver.findElement(By.id("wishlist_button")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='fancybox-item fancybox-close']")).click();*/
	WebElement add = driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]"));
	add.click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[@class='cross']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//b[text()='Cart']")).click();
	Thread.sleep(3000);
	WebElement checkout = driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]"));
	Thread.sleep(3000);
	checkout.click();
	Thread.sleep(3000);
	driver.findElement(By.name("processAddress")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("cgv")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("processCarrier")).click();
	Thread.sleep(2000);
	driver.findElement(By.className("cheque")).click();
	Thread.sleep(2000);
	WebElement confirmorder = driver.findElement(By.xpath("//span[contains(text(),'I confirm my order')]"));
	confirmorder.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'Back to orders')]")).click();

	}

}
