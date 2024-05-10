import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Single window handle
		driver.get("https://www.gmail.com/");
		String temp = driver.getWindowHandle();
		System.out.println(temp);
		
		// Multiple window handle
		driver.findElement(By.linkText("Privacy")).click();
	    Set<String> allwindows = driver.getWindowHandles();
	    System.out.println(allwindows);
}
}
	