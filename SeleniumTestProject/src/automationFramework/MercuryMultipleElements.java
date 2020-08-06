package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryMultipleElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		int linkcount = driver.findElements(By.tagName("a")).size();
		System.out.println("No of Links in the Page :  "+linkcount);
		int imagecount = driver.findElements(By.tagName("img")).size();
		System.out.println("No of Images in the Page"+imagecount);
		driver.close();
		
		
		

	}

}
