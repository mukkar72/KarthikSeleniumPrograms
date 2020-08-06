package FlipkartAddtoCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class saucedeom {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='password']/following::input")).click();
		Thread.sleep(2000);
		//to select the first image
		driver.findElement(By.xpath("//div[text()='Products']/following::img[1]")).click();
		//driver.findElement(By.id("item_4_img_link")).click(); not working
		String bagname = driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]")).getText();
		System.out.println("The Bag Name is  :" +bagname);
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
		String cartcount = driver.findElement(By.xpath("//span[contains(text(),'1')]")).getText();
		System.out.println("No of Items in the Cart is  :" +cartcount);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[contains(text(),'REMOVE')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'<- Back')]")).click();
		Select opt = new Select(driver.findElement(By.xpath("//div[contains(text(),'Products')]/following::select")));
		opt.selectByVisibleText("Name (Z to A)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Open Menu')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("about_sidebar_link")).click();
		String title = driver.getTitle();
		System.out.println("The Page Title is  :" +title);
		driver.findElement(By.xpath("//a[contains(text(),'Try it free')]")).click();
		String title1 = driver.getTitle();
		System.out.println("The Page Title is  :" +title1);
		Thread.sleep(2000);
		driver.findElement(By.id("first_name_step1")).sendKeys("Karthikeyan");
		driver.findElement(By.id("last_name_step1")).sendKeys("Rajaram");
		driver.findElement(By.id("email_step1")).sendKeys("mukkar72@gmail.com");
		driver.findElement(By.id("organization_name_step1")).sendKeys("ABC");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'OK')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("mukkar72");
		driver.findElement(By.id("password")).sendKeys("Mukunth@05");
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText("India");
		Select datacentre = new Select(driver.findElement(By.id("data_center")));
		datacentre.selectByValue("EU");
		Thread.sleep(60000);
		driver.findElement(By.xpath("//button[contains(text(),'Get started')]")).click();
	
		
		

	}

}
