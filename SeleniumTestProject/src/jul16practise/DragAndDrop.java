package jul16practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement john =driver.findElement(By.xpath("//h5[text()='Mr John']"));
		WebElement Trash = driver.findElement(By.xpath("//span[text()='Trash']"));
		Actions drag = new Actions(driver);
		drag.dragAndDrop(john, Trash).build().perform();
		WebElement Mary = driver.findElement(By.xpath("//h5[text()='Mary']"));
		drag.dragAndDrop(Mary, Trash).build().perform();
		
		
		

	}

}
