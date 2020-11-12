package test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ready {
	
	static WebDriver driver;

	@Test
	public void launch() throws FileNotFoundException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\xyz\\eclipse-workspace\\start123\\chromedriver.exe");
		//ExcelDataConfig excel = new ExcelDataConfig("C:\\kyc data\\kyc.xlsx");
			
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://dashboard.stage.kychub.com/login");
	}
	

}
