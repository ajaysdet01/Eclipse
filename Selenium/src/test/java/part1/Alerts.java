package part1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class Alerts {

    public static void main(String[] args) throws InterruptedException {
        
    	
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open a webpage that triggers an alert
        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");

        // Trigger the first alert
        driver.findElement(By.xpath("//button[text()='Alert']")).click();

        // Wait for the first alert to be present
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.alertIsPresent());

        // Switch to and accept the first alert
        driver.switchTo().alert().accept();

        // Trigger the second alert
        driver.findElement(By.xpath("(//button[text()='Click Me'])[1]")).click();

        // Wait for the second alert to be present for 6 seconds
       
        wait.until(ExpectedConditions.alertIsPresent());

        // Switch to and accept the second alert
        driver.switchTo().alert().accept();

        //3rd alert  
        driver.findElement(By.xpath("(//button[text()='Click Me'])[3]")).click();

        // Wait for the second alert to be present for 6 seconds
       
        wait.until(ExpectedConditions.alertIsPresent());
        // Switch to the alert
		Alert alert = driver.switchTo().alert();

		// Check if the alert is present
		if (alert != null) {
		    // Send text to the alert
		    alert.sendKeys("ajay");
		    Thread.sleep(5000);
		    // Accept the alert
		    alert.accept();
		}

    }
}
