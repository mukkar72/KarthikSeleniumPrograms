package testNGFramework;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SpiceJetDemo {
	WebDriver driver;
	@Test
	public void a_browser_opening() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}
	
	@Test
	public void b_from() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		ArrayList <WebElement> dropfrom = new ArrayList <WebElement> (driver.findElements(By.xpath("(//td[@class='mapbg'])[1]//ul/li/a")));
		for(WebElement from:dropfrom) {
			String Fromvalues = from.getText();
			System.out.println(Fromvalues);
			if(Fromvalues.equalsIgnoreCase("Chennai (MAA)")) {
				from.click();
				break;
			}
		}
	}
	@Test
	public void c_destination() throws InterruptedException {
		Thread.sleep(5000);
		ArrayList <WebElement> dropto = new ArrayList <WebElement> (driver.findElements(By.xpath("(//td[@class='mapbg'])[2]//ul/li/a")));
		for(WebElement to:dropto) {
			String ToValues = to.getText();
			System.out.println(ToValues);
			if(ToValues.equalsIgnoreCase("Bengaluru (BLR)")) {
				to.click();
				break;
			}
		}
		}
	@Test
	public void d_departuredate() throws InterruptedException {
		Thread.sleep(5000);
		for(int i=0;i<3;i++) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
		//driver.findElement(By.xpath("(//a[text()='10'])[2]")).click();
			ArrayList<WebElement> departuredate = new ArrayList<WebElement> (driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar'])[2]//td/a")));
			for(WebElement date:departuredate) {
				String datevalues = date.getText();
				if(datevalues.equals("10")) {
					
					date.click();
					break;
				}
								
			}
			
		}
	@Test
	public void e_passenger() throws InterruptedException {
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		Select child = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		child.selectByVisibleText("2");
		Select inf = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		inf.selectByVisibleText("1");
	}
	@Test
	public void f_currency() {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Select cur = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		cur.selectByVisibleText("USD");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}
	
	}
	
