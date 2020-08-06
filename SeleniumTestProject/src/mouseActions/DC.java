package mouseActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DC {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uitestpractice.com/Students/Actions");
		driver.manage().window().maximize();
		WebElement dc = driver.findElement(By.xpath("(//button[contains(text(),'Double Click Me !')])"));
		Actions dclick = new Actions(driver);
		dclick.doubleClick(dc).build().perform();
		Alert aler = driver.switchTo().alert();
		String text = aler.getText();
		System.out.println(text);
		aler.accept();
		

	}

}
