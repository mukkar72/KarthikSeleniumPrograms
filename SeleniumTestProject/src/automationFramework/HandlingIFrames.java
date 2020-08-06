package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nunzioweb.com/index.shtml");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		int iframecount = driver.findElements(By.tagName("iframe")).size();
		System.out.println(iframecount);
		/*driver.switchTo().frame("oddcouple");
		String iframetext = driver.findElement(By.xpath("//div[contains(text(),'always liked')]")).getText();
		System.out.println(iframetext);*/
		Thread.sleep(5000);
		driver.switchTo().frame("html_references");
		String ift2 = driver.findElement(By.xpath("//td[contains(text(),'Web Authoring')]")).getText();
		System.out.println(ift2);
		/*driver.switchTo().frame("kk");
		driver.findElement(By.xpath("//div[contains(text(),'Killer Klowns!')]/following::img[2]")).click();*/
		
	}

}
