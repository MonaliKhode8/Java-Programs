import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Practise_tset {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Gmail")).click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File trgfile = new File("C:\\Test_Screenshot\\SC_1");
		Files.copy(srcfile, trgfile);
		
	   
		
		driver.close();

	}

}
