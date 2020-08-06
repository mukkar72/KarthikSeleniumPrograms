package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsRightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement right = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Actions rc = new Actions(driver);
		rc.contextClick(right).build().perform();
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		Alert aler = driver.switchTo().alert();
		String content= aler.getText();
		System.out.println(content);
		aler.accept();
		

	}

}
