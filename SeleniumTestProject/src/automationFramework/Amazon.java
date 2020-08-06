package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
		driver.findElement(By.id("ap_email")).sendKeys("mukkar72@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Mukunth@05");
		driver.findElement(By.id("signInSubmit")).click();
		String name = driver.findElement(By.xpath("//h2[contains(text(),'Hi, Karthikeyan')]")).getText();
		System.out.println("My Name is :   " +name);
		String since = driver.findElement(By.xpath("//p[contains(text(),'Customer since 2018')]")).getText();
		System.out.println("Customer since  :" +since);
		Thread.sleep(5000);
		// to click grocery
		driver.findElement(By.xpath("(//p[contains(text(),'Top links for you')]/following::a)[4]")).click();
		String title = driver.getTitle();
		System.out.println("Page Title is  : " +title);
		//driver.findElement(By.xpath("//p[contains(text(),'Your Orders')]")).click(); not working
		//driver.findElement(By.xpath("(//p[contains(text(),'Top links for you')]/following::a)[1]")).click(); Yours Orders working
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//span[contains(text(),'Royal Dry Fruits California Almond (1 Kg)')])[1]")).click(); not working
		// to click the dry fruit image
		driver.findElement(By.xpath("(//span[contains(text(),'Bestsellers')])[2]/following::img[1]")).click();
		String title1 = driver.getTitle();
		System.out.println("Page Title is :  " +title1);
		Thread.sleep(5000);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(5000);
		WebElement cart = driver.findElement(By.id("hlb-view-cart-announce"));
		cart.click();
		//driver.findElement(By.xpath("//div[@id='priceInsideBuyBox_feature_div']/following::input[1]")).click();
		String title2 = driver.getTitle();
		System.out.println("The Page of Cart Window is :"  +title2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(text(),'Royal Dry')])[1]/following::input[3]")).click();
		driver.findElement(By.id("nav-logo")).click();
		

		


	}

}
