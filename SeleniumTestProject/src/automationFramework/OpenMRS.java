package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenMRS {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		Thread.sleep(3000);
		driver.findElement(By.id("Registration Desk")).click();
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")).click();
		driver.findElement(By.name("givenName")).sendKeys("Karthikeyan");
		driver.findElement(By.name("familyName")).sendKeys("Rajaram");
		driver.findElement(By.xpath("//span[text()='Gender']")).click();
		Select gender = new Select(driver.findElement(By.id("gender-field")));
		gender.selectByVisibleText("Male");
		driver.findElement(By.xpath("//span[text()='Birthdate']")).click();
		driver.findElement(By.id("birthdateDay-field")).sendKeys("07");
		Select month = new Select(driver.findElement(By.id("birthdateMonth-field")));
		month.selectByVisibleText("June");
		driver.findElement(By.id("birthdateYear-field")).sendKeys("1972");
		driver.findElement(By.xpath("//span[text()='Address']")).click();
		driver.findElement(By.id("address1")).sendKeys("AzizNagar");
		driver.findElement(By.id("address2")).sendKeys("Kodambakkam");
		driver.findElement(By.id("cityVillage")).sendKeys("Chennai");
		driver.findElement(By.id("stateProvince")).sendKeys("TamilNadu");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("postalCode")).sendKeys("600024");
		driver.findElement(By.xpath("//span[text()='Phone Number']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9840372968");
		driver.findElement(By.xpath("//span[text()='Relatives']")).click();
		driver.findElement(By.id("confirmation_label")).click();
		driver.findElement(By.id("submit")).click();
		//String PatientID = driver.findElement(By.xpath("//em[text()='Patient ID']/following::span[1]]")).getText();
		//System.out.println("The Patient ID is  :"+PatientID);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Start Visit')]")).click();
		driver.findElement(By.id("start-visit-with-visittype-confirm")).click();
		Thread.sleep(6000);
		WebElement vitals = driver.findElement(By.id("referenceapplication.realTime.vitals"));
		vitals.click();
		//WebElement vitals = driver.findElement(By.xpath("//a[contains(text(),'Delete visit')]/following::a[5]"));
		//vitals.click();
		//driver.findElement(By.id("//a[@id='referenceapplication.realTime.simpleVisitNote']")).click();
		driver.findElement(By.id("w8")).sendKeys("175");
		driver.findElement(By.xpath("//span[contains(text(),'Weight (kg)')]")).click();
		driver.findElement(By.id("w10")).sendKeys("83");
		driver.findElement(By.xpath("(//span[contains(text(),'BMI')])[1]")).click();
		String BMI = driver.findElement(By.xpath("//span[contains(text(),'BMI is:')]")).getText();
		System.out.println(BMI);
		driver.findElement(By.xpath("//span[contains(text(),'Temperature')]")).click();
		driver.findElement(By.id("w12")).sendKeys("35");
		driver.findElement(By.xpath("//span[contains(text(),'Pulse')]")).click();
		driver.findElement(By.id("w14")).sendKeys("99");
		driver.findElement(By.xpath("//span[contains(text(),'Respiratory')]")).click();
		driver.findElement(By.id("w16")).sendKeys("100");
		driver.findElement(By.xpath("//span[contains(text(),'Blood Pressure')]")).click();
		driver.findElement(By.id("w18")).sendKeys("90");
		driver.findElement(By.id("w20")).sendKeys("120");
		driver.findElement(By.xpath("//span[contains(text(),'Blood oxygen saturation')]")).click();
		driver.findElement(By.id("w22")).sendKeys("98");
		driver.findElement(By.xpath("//span[contains(text(),'Confirm')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		
		
		
		

	}

}
