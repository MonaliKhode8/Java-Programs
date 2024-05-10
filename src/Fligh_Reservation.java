import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fligh_Reservation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumproject\\MyFirst_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Register User
		
		driver.get("http://flights.qedgetech.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("name")).sendKeys("Monali Khode");
		driver.findElement(By.id("contact")).sendKeys("9529041418");
		driver.findElement(By.id("email")).sendKeys("monalikhode1997@gmail.com");
		driver.findElement(By.name("password")).sendKeys("khode@456789");
		Select Glist = new Select(driver.findElement(By.name("gender")));
		Glist.selectByValue("F");
		driver.findElement(By.id("popupDatepicker")).sendKeys("08-12-1997");
		driver.findElement(By.id("flexCheckChecked")).click();
		driver.findElement(By.name("submit")).click();
		
		//Login User
		
		driver.findElement(By.name("email")).sendKeys("monalikhode1997@gmail.com");
		driver.findElement(By.name("password")).sendKeys("khode@456789");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		//Booking a flight ticket
		
		driver.findElement(By.id("search-date")).sendKeys("03/12/2024");
	    driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[5]/a")).click();
	    Thread.sleep(1000);
		
		Select Fromlist = new Select(driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div[2]/div[1]/div/div/div[2]/select")));
		Fromlist.selectByVisibleText("Kolkatha");
		Thread.sleep(1000);
		
		Select Tolist = new Select(driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div[2]/div[1]/div/div/div[3]/select")));
		Tolist.selectByVisibleText("Hyderabad");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div[2]/div[1]/div/div/div[4]/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/button")).click();
		
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/table/tbody/tr[2]/td[9]/button")).click();
		
		driver.findElement(By.id("name")).sendKeys("Monali Khode");
		driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div[2]/div[1]/div/div/form/div/div[2]/div[2]/div/div[2]/input")).click();
		driver.findElement(By.id("tickets")).clear();
		driver.findElement(By.id("tickets")).sendKeys("2");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div[2]/div[1]/div/div/form/div/div[4]/div/button")).click();
	
	
	
	}

}
