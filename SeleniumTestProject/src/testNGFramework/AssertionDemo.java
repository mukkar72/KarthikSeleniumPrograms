package testNGFramework;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	WebDriver driver;

	@Test
	public void a_pageload() {

		System.setProperty("webdriver.chrome.driver",
				"D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/online-banking.html");
		driver.manage().window().maximize();
	}

	@Test
	public void b_assertequals() {
		String text = driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
		Assert.assertEquals(text, "ONLINE BANKING");
		System.out.println("Assert Equals Pass");
	}

	@Test
	public void c_assertnotequals() {
		String text = driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
		Assert.assertNotEquals(text, "ONline BANKING");
		System.out.println("Assert Not Equals Pass");
	}
	@Test
	public void d_asserttrue() {
		Assert.assertTrue("ONLINE BANKING".equals(driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText()));
		System.out.println("Assert True Pass");
	}
	@Test
	public void e_assertfalse() {
		String text = driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
		Assert.assertFalse("online banking".equals(text));
		System.out.println("Assert False Pass");
				
	}
	@Test
	public void f_assertnotnull() {
		Object obj1 = driver.getTitle();
		Assert.assertNotNull(obj1);
		System.out.println("Assert Not Null Pass");
	}
		@Test
		public void g_assertnull() {
			Object obj2 = null;
			Assert.assertNull(obj2);
			System.out.println("Assert Null Pass");
		}
}
