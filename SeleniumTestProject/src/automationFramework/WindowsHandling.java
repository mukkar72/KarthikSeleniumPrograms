package automationFramework;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Title of Main Page is "+title);
		WebElement tabbedwindow = driver.findElement(By.xpath("//button[contains(text(),'    click   ')]"));
		tabbedwindow.click();
		
	
				
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> iter = windowIds.iterator();
		
		String mainWindow = iter.next();
		String tabWindow = iter.next();
		
		driver.switchTo().window(tabWindow);
		
		title = driver.getTitle();
		System.out.println("Title of Tabbed Window is "+title);
		
		driver.switchTo().window(mainWindow);
		
		title = driver.getTitle();
		System.out.println("Title of Original Window"+title);
		
	
		
		

	}

}
