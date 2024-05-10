import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrimusBankAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://primusbank.qedgetech.com/");
		Select drp = new Select(driver.findElement(By.id("drlist")));
		drp.selectByValue("ameerpet");
		
		
		driver.findElement(By.id("txtuId")).sendKeys("Mona");
		driver.findElement(By.id("txtPword")).sendKeys("123");
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}

}
