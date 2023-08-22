package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Testing01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Web Driver Initialization
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		String ExpectedUrl="https://www.saucedemo.com/";
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.navigate().refresh();
		
		String ActualUrl= driver.getCurrentUrl();
		System.out.println(ActualUrl);
		
		//if...else
		
//		if(ActualUrl.equals(ExpectedUrl)) {
//	
//			System.out.println("Same URL");
//			
//		}
//		else {
//			System.out.println("Different URL");
//			}
		
		//Assert...
		
		Assert.assertEquals(ActualUrl, ExpectedUrl, "Condition True");
		
		
		
		
		
		}

}
