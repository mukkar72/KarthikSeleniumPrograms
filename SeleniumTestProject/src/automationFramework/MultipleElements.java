package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Sachin_Tendulkar");
		driver.manage().window().maximize();
		int linkcount = driver.findElements(By.tagName("a")).size();
		System.out.println("Total Links in Sachin Wikipedia Page"+linkcount);
		int imgcount = driver.findElements(By.tagName("img")).size();
		System.out.println("Total Images in Sachin Wikipedia Page"+imgcount);
		driver.close(); 

	}

}
