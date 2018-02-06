package src4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FisrtSeleniumChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\test_automation\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		String expectedTitle = "Welcome: Mercury Tours";
		driver.get("http://newtours.demoaut.com");
		String actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)){
			System.out.println("Test Passed!");
        } else {
        	System.out.println("Test Failed");
        }
		driver.close();
	}

}
