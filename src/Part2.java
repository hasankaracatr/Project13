package Project13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Part2 {
        public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();

        //1) Navigate to https://demo.applitools.com/
        driver.get("https://demo.applitools.com/");

        //2) Maximize the window
        driver.manage().window().maximize();

        //3) Enter the username as "ttechno@gmail.com"
        driver.findElement(By.id("username")).sendKeys("ttechno@gmail.com");

        //4) Enter the password as "techno123."
        driver.findElement(By.id("password")).sendKeys("techno123.");

        //5) Click on sign in button
        driver.findElement(By.id("log-in")).click();

        //6) Get the header text in red color ( starts with "Your nearest branch ...") and assign it to a String str
        String str= driver.findElement(By.id("time")).getText();

        //7) Print the String str
        System.out.println(str);

        //8) Print the URL
        System.out.println(driver.getCurrentUrl());
    }
}
