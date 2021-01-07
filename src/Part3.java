package Project13;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();

        //1) Navigate to https://www.snapdeal.com/
        driver.get("https://www.snapdeal.com/");

        //2) Maximize the window
        driver.manage().window().maximize();

        //3) Search for "teddy bear" and click on search button

        WebElement searchButton = driver.findElement(By.cssSelector("input[id='inputValEnter']"));
        searchButton.sendKeys("teddy bear");

        driver.findElement(By.cssSelector(".searchTextSpan")).click();

        //4) Get and print the following text -->> We've got .... results for 'teddy bear'

        System.out.println(driver.findElement(By.cssSelector("#searchMessageContainer>div>.nnn")).getText());

        //5) Print the URL
        System.out.println(driver.getCurrentUrl());

        //6) Click on logo snepdeal logo
        driver.findElement(By.cssSelector("img[title='Snapdeal'][class='notIeLogoHeader aspectRatioEqual sdLogo cur-pointer']")).click();

        //7) Print the URL
        System.out.println(driver.getCurrentUrl());

        //8) Navigate back and check if the automatically written text in the search bar is "teddy bear"
        //(Hint: You may use the "value" attribute of the input tag for the search bar)
        driver.navigate().back();


        searchButton=driver.findElement(By.cssSelector("input[id='inputValEnter']"));
        Assert.assertEquals(searchButton.getAttribute("value"), "teddy bear");





    }
}
