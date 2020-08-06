package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfirmBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		WebElement confirm = driver.findElement(By.xpath("(//button[contains(text(),'Click me!')])[2]"));
		confirm.click();
		Thread.sleep(3000);
		Alert con = driver.switchTo().alert();
		String text = con.getText();
		System.out.println(text);
		con.accept();
		String confirmation = driver.findElement(By.xpath("//p[contains(text(),'You pressed OK!')]")).getText();
		System.out.println(confirmation);
		
		
		

	}

}
