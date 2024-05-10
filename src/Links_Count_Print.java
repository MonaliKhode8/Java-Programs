import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_Count_Print {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("About")).click();
		
		
		java.util.List<WebElement> Llist =  driver.findElements(By.tagName("a"));
		System.out.println(Llist.size());
		
		for(WebElement link: Llist) {
			System.out.println(link.getText());
		}
	}
}


