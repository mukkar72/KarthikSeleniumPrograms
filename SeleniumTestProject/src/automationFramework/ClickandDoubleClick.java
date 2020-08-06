package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickandDoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uitestpractice.com/Students/Actions");
		driver.manage().window().maximize();
		WebElement click = driver.findElement(By.xpath("(//button[contains(text(),'Click Me !')])[1]"));
		Actions single = new Actions(driver);
		single.click(click).build().perform();
		Alert ab = driver.switchTo().alert();
		String text = ab.getText();
		System.out.println(text);
		ab.accept();
		

	}

}
