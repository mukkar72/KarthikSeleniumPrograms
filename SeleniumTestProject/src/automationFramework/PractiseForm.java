package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PractiseForm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.practiceselenium.com/practice-form.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("Karthikeyan");
		driver.findElement(By.name("lastname")).sendKeys("Rajaram");
		WebElement sex = driver.findElement(By.id("sex-1"));
		sex.click();
		WebElement Years = driver.findElement(By.id("exp-4"));
		Years.click();
		driver.findElement(By.id("datepicker")).sendKeys("04 JUL 2020");
		WebElement chai = driver.findElement(By.id("tea1"));
		chai.click();
		driver.findElement(By.id("tool-0")).click();
		Select continent = new Select(driver.findElement(By.id("continents")));
		continent.selectByVisibleText("Asia");
		WebElement ele = driver.findElement(By.id("selenium_commands"));
		Select commands = new Select(ele);
		commands.selectByVisibleText("Switch Commands");
		commands.selectByVisibleText("WebElement Commands");
		driver.findElement(By.id("submit")).click();
		String title = driver.getTitle();
		System.out.println("Page Title is :  "+title);
		driver.findElement(By.xpath("//a[contains(text(),'Menu')]")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'Check Out')])[1]")).click();
		String title1 = driver.getTitle();
		System.out.println("Page Tilte is :  "+title1);
		driver.findElement(By.id("email")).sendKeys("mukkar72@gmail.com");
		driver.findElement(By.id("name")).sendKeys("Karthikeyan");
		driver.findElement(By.id("address")).sendKeys("New 30 Old 22A Aziz Nagar First Street Kodambakkam");
		Select cardtype = new Select(driver.findElement(By.id("card_type")));
		cardtype.selectByVisibleText("Visa");
		driver.findElement(By.id("card_number")).sendKeys("1234 5678 1234 0000");
		driver.findElement(By.id("cardholder_name")).sendKeys("Karthikeyan");
		driver.findElement(By.id("verification_code")).sendKeys("151");
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
				
		

	}

}
