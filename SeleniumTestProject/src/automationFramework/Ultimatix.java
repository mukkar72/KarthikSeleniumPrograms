package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ultimatix {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://auth.ultimatix.net/utxLogin/login?TYPE=33554432&REALMOID=06-000e128c-664b-1c1a-9ba7-abcac0a8f081&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-EdbHMX6T%2bWb8DN7DVmL5sbY%2bn%2b30S7n%2fgIBptYa9dLbudResX4AYm9ObPeNozoDH&TARGET=-SM-HTTPS%3a%2f%2fwww%2eultimatix%2enet%2futxHomeApp%2fredirectToHome%3fTARGET%3dhttps-%3A-%2F-%2Fwww%2eultimatix%2enet-%2Fcontent-%2FultimatixPortal-%2Fultimatixportalhome%2ehtml");
		driver.findElement(By.id("form1")).sendKeys("348095");
		driver.findElement(By.id("proceed-button")).click();
		driver.findElement(By.id("authcode1")).sendKeys("0");
		driver.findElement(By.id("authcode2")).sendKeys("6");
		driver.findElement(By.id("authcode3")).sendKeys("5");
		driver.findElement(By.id("authcode4")).sendKeys("3");
		driver.findElement(By.id("authcode5")).sendKeys("1");
		driver.findElement(By.id("authcode6")).sendKeys("0");
		driver.findElement(By.id("form-submit")).click();
		
		

	}
}
