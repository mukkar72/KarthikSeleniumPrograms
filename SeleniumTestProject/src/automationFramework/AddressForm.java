package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddressForm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://a.testaddressbook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("sign-in")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("session_email")).sendKeys("mukkar72@gmail.com");
		driver.findElement(By.id("session_password")).sendKeys("Mukunth@05");
		driver.findElement(By.name("commit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Addresses')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'New Address')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("address_first_name")).sendKeys("Karthikeyan");
		driver.findElement(By.id("address_last_name")).sendKeys("Rajaram");
		driver.findElement(By.id("address_street_address")).sendKeys("Aziz Nagar First Street");
		driver.findElement(By.id("address_secondary_address")).sendKeys("Kodambakkam");
		driver.findElement(By.id("address_city")).sendKeys("Texas");
		Select state = new Select(driver.findElement(By.id("address_state")));
		state.selectByVisibleText("Texas");
		driver.findElement(By.id("address_zip_code")).sendKeys("600024");
		WebElement country = driver.findElement(By.id("address_country_us"));
		country.click();
		driver.findElement(By.id("address_birthday")).sendKeys("07-06-1972");
		driver.findElement(By.id("address_age")).sendKeys("47");
		driver.findElement(By.id("address_website")).sendKeys("http://www.abc.com");
		driver.findElement(By.id("address_phone")).sendKeys("9840372968");
		WebElement interest = driver.findElement(By.xpath("//label[contains(text(),'Reading')]"));
		interest.click();
		driver.findElement(By.id("address_note")).sendKeys("Practise Form");
		driver.findElement(By.name("commit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'List')]")).click();
		//driver.findElement(By.xpath("((//a[contains(text(),'Edit')])[1]/following::a[10]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='container']/descendant::a[12]")).click();

	}

}
