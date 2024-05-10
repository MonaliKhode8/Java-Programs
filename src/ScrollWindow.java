import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollWindow {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	driver.findElement(By.name("search_query")).sendKeys("Hindi songs");
	
	Actions act = new Actions(driver);
    act.moveToElement(driver.findElement(By.xpath("//*[@id=\"thumbnail\"]/yt-image/img")));
	act.click();
	act.build().perform();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,800)", "");
	
	

	
	
//	Actions act1 = new Actions(driver);
//	act1.moveToElement(driver.findElement(By.id("thumbnail"))).click();
//	act1.click();
//	act1.build().perform();
	
	
	

	}

}
