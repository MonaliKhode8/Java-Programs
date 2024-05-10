import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal_Shopping {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		//To purchase a item in snap deal shopping application
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		String curURL = driver.getCurrentUrl();
		System.out.println(curURL);
		
		String Tiltle = driver.getTitle();
		System.out.println(Tiltle);
		
    	//driver.findElement(By.id("inputValEnter")).sendKeys("Watches for women");
    	//driver.findElement(By.className("searchTextSpan")).click();

    	//driver.findElement(By.xpath("/html/body/div[11]/div[7]/div[5]/div[3]/div[2]/div/div[2]/input")).sendKeys("411057");
    	//driver.findElement(By.xpath("/html/body/div[11]/div[7]/div[5]/div[3]/div[2]/div/div[2]/button")).click();
    	 
    	
//      Thread.sleep(2000);
//    	Select drp = new Select(driver.findElement(By.xpath("/html/body/div[11]/div[7]/div[5]/div[3]/div[1]/div/div[2]/div/i")));
//    	drp.selectByIndex(4);
    	
    	
		
//		driver.findElement(By.className("catText")).click();
//		List<WebElement> links = driver.findElements(By.linkText("/a"));
//		int Nooflinks = links.size();
//		System.out.println(Nooflinks);		
		
		/*
		Thread.sleep(3000);
		List<WebElement> SList =  driver.findElements(By.xpath("//ul[@class='suggestionList_menu']"));
		int count = SList.size();
		System.out.println(count);
		*/
		
		
		
		
	}

}
