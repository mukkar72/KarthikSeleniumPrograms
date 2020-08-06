package testNGFramework;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class OrangeHRMAddUser {
		WebDriver driver;
		@Test 
		public void a_BrowserOpening() throws IOException {
		//browser opening
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
		driver.manage().window().maximize();
		getscreenshot();
		}
		@Test
		public void b_clicklogin() throws IOException {
		// click login
		driver.findElement(By.id("btnLogin")).click();
		getscreenshot();
		}
		@Test
		public void c_selectpim() throws InterruptedException, IOException {
		//select pim and click Add Employee
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'PIM')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("firstName")).sendKeys("Jack");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB,"Micheal").build().perform();
		act.sendKeys(Keys.TAB,"Son").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		for(int i =0;i <4; i++) {
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		}
		
		WebElement next =driver.findElement(By.id("systemUserSaveBtn"));
		next.click();
		getscreenshot();
		}
		@Test
		public void d_personaldetails() throws IOException {
		//Personal Details
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("emp_birthday")).sendKeys("Wed, 07 Jun 1972");
		driver.findElement(By.id("emp_marital_status_inputfileddiv")).click();
		Actions act1 = new Actions(driver);
		act1.sendKeys(Keys.ARROW_DOWN).build().perform();
		act1.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.id("emp_gender_inputfileddiv")).click();
		act1.sendKeys(Keys.ARROW_DOWN).build().perform();
		act1.sendKeys(Keys.ARROW_DOWN).build().perform();
		act1.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.id("nation_code_inputfileddiv")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		for(int i=1;i<=87;i++) {
			act1.sendKeys(Keys.ARROW_DOWN).build().perform();
			
		}
		act1.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.id("1_inputfileddiv")).click();
		for(int i=0;i<3;i++) {
			act1.sendKeys(Keys.ARROW_DOWN).build().perform();
			act1.sendKeys(Keys.ENTER).build().perform();
		}
		driver.findElement(By.xpath("//div[@id='1_inputfileddiv']/following::input")).sendKeys("Cricket");
		WebElement next1 = driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
		next1.click();
		getscreenshot();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		}
		
		@Test
		
		public void e_Job() {
			driver.findElement(By.id("joined_date")).sendKeys("Sat, 04 Jul 2020");
			driver.findElement(By.id("date_of_permanency")).sendKeys("Sat, 04 Jul 2020");
			driver.findElement(By.id("job_title_id_inputfileddiv")).click();
			Actions act2 = new Actions(driver);
			for(int i=0;i<3;i++) {
				act2.sendKeys(Keys.ARROW_DOWN).build().perform();
				
			}
			act2.sendKeys(Keys.ENTER).build().perform();
			driver.findElement(By.id("employment_status_id_inputfileddiv")).click();
			act2.sendKeys(Keys.ARROW_DOWN).build().perform();
			act2.sendKeys(Keys.ENTER).build().perform();
			driver.findElement(By.id("job_category_id_inputfileddiv")).click();
			act2.sendKeys(Keys.ARROW_DOWN).build().perform();
			act2.sendKeys(Keys.ARROW_DOWN).build().perform();
			act2.sendKeys(Keys.ARROW_DOWN).build().perform();
			act2.sendKeys(Keys.ARROW_DOWN).build().perform();
			act2.sendKeys(Keys.ENTER).build().perform();
			driver.findElement(By.id("subunit_id_inputfileddiv")).click();
			act2.sendKeys(Keys.ARROW_DOWN).build().perform();
			act2.sendKeys(Keys.ARROW_DOWN).build().perform();
			act2.sendKeys(Keys.ENTER).build().perform();
			driver.findElement(By.id("costCentre_value")).sendKeys("0003 - Cost Center (Finance)");
			driver.findElement(By.xpath("//div[@id='work_shift_id_inputfileddiv']//select[@id='work_shift_id']")).click();
			
			
			
		}
		
		public void getscreenshot() throws IOException {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("D:\\Selenium\\OrangeHRMScreenShots\\Screenshot" +System.currentTimeMillis()+ ".png"));
		}
		
		
		
		
		
		/*driver.findElement(By.id("lastName")).sendKeys("Suresh");
		Select location = new Select(driver.findElement(By.id("location")));
		location.selectByVisibleText("Australia");
		driver.findElement(By.xpath("(//span[@class='caret'])[2]")).click();
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();*/
		
		

	}


