package multipleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class HandleMultipleWindows {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.navigate().to("https://vinothqaacademy.com/multiple-windows/");
        driver.manage().window().maximize();
        
        
        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);
        
        //For Window
       driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();
        
        //For Tab
       // driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();

        Set<String> allWindows = driver.getWindowHandles();
        System.out.println(allWindows);

      
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(parentWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        driver.manage().window().maximize();
        System.out.println("New window title: " + driver.getTitle());

        driver.close();

       driver.switchTo().window(parentWindow);
       
        System.out.println("Back to parent window: " + driver.getTitle());

       driver.quit();
    }
}
