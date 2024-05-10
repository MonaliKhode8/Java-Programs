import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webDriver.chrome.driver", "E:\\seleniumproject\\MyFirst_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().deleteAllCookies();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		driver.get("http://orangehrm.qedgetech.com");		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(5000);
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		
		/*
		driver.findElement(By.name("btnAdd")).click();
		driver.findElement(By.id("systemUser_userType")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[1]/select/option[2]")).click();
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Arpoya Maya");
		driver.findElement(By.name("systemUser[status]")).click();
		driver.findElement(By.id("systemUser_userName")).sendKeys("Arpoya1");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[4]/select/option[1]")).click();
		driver.findElement(By.id("systemUser_password")).sendKeys("Arpoya789");
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Arpoya789");
		driver.findElement(By.name("btnSave")).click();
		*/
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("kavya");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[2]/select/option[3]")).click();
		driver.findElement(By.name("searchSystemUser[employeeName][empName]")).sendKeys("kavya mandha");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[4]/select/option[2]")).click();
		driver.findElement(By.id("searchBtn")).click();
		driver.findElement(By.id("ohrmList_chkSelectRecord_469")).click();
		
		driver.findElement(By.id("menu_admin_Job")).click();
		driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
		
		
		
		//driver.findElement(By.partialLinkText("Welcome")).click();
		//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		//driver.findElement(By.linkText("Logout")).click();
		
	}

}
