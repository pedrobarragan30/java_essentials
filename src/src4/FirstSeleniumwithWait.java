package src4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumwithWait {

	    public static void main(String[] args) {
	        //System.setProperty("webdriver.gecko.driver", "C:\\test_automation\\drivers\\geckodriver.exe");
	        System.setProperty("webdriver.chrome.driver", "C:\\test_automation\\drivers\\chromedriver.exe");
	    	WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
