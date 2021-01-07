package Project13;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",MyConstants.DRIVER_PATH);
        WebDriver driver=new ChromeDriver();
        driver.get("http://demoqa.com/text-box");
        driver.manage().window().maximize();

        //3) Enter full name as "Automation"
        driver.findElement(By.id("userName")).sendKeys("Automation");

        //4) Enter Email as "Testing@gmail.com"
        driver.findElement(By.id("userEmail")).sendKeys("Testing@gmail.com");

        //5) Enter Current Address as "Testing Current Address"
        driver.findElement(By.id("currentAddress")).sendKeys("Testing Current Address");

        //6) Enter Permanent Address as "Testing Permanent Address"
        driver.findElement(By.id("permanentAddress")).sendKeys("Testing Permanent Address");

        //7) Click on submit button
        driver.findElement(By.id("submit")).click();

        //8) Print Name in the text box
        String Name = driver.findElement(By.id("name")).getText();
        System.out.println(Name);

        //9) Print Email in the text box
        String Email = driver.findElement(By.id("email")).getText();
        System.out.println(Email);

        //10) Print Current Address in the text box
        String CurrentAddress = driver.findElement(By.cssSelector("p[id='currentAddress']")).getText();
        System.out.println(CurrentAddress);

        //11) Print Permanent Address in the text box
        String PermanentAddress = driver.findElement(By.cssSelector("p[id=permanentAddress]")).getText();
        System.out.println(PermanentAddress);
    }
}
