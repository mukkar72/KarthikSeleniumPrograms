package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		String pagetitle = driver.getTitle();
		System.out.println("The Page Title is :"+pagetitle);
		driver.findElement(By.name("name")).sendKeys("Karthikeyan");
		driver.findElement(By.name("phone")).sendKeys("9840372968");
		driver.findElement(By.name("email")).sendKeys("mukkar72@gmail.com");
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("India");
		driver.findElement(By.name("city")).sendKeys("Chennai");
		driver.findElement(By.xpath("(//label[contains(text(),'Username:')])[2]/following::input[1]")).sendKeys("mukkar72");
		driver.findElement(By.xpath("(//label[contains(text(),'Password:')])[2]/following::input[1]")).sendKeys("Mukunth@05");
		//driver.findElement(By.name("username")).sendKeys("mukkar72");
		//driver.findElement(By.name("password")).sendKeys("Mukunth@05");
		driver.findElement(By.xpath("//a[contains(text(),'Signin')]/following::input")).click();
		//driver.close();
		

	}

}
