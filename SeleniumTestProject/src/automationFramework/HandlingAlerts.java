package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]")).click();
		Alert one = driver.switchTo().alert();
		String content = one.getText();
		System.out.println(content);
		one.accept();
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]")).click();
		Alert two = driver.switchTo().alert();
		String content1 = two.getText();
		System.out.println(content1);
		two.accept();
		String message = driver.findElement(By.xpath("//p[contains(text(),'You pressed Ok')]")).getText();
		System.out.println(message);
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]")).click();
		Alert three = driver.switchTo().alert();
		String content2 = three.getText();
		System.out.println(content2);
		three.sendKeys("Karthik");
		three.accept();
		Thread.sleep(3000);
		String myname = driver.findElement(By.xpath("//p[contains(text(),'How are you today')]")).getText();
		System.out.println(myname);
		
		
		

	}

}
