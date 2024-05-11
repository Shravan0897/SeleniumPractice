package Tests;

import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // open chrome web browser
        WebDriver driver = new ChromeDriver();
        // opens the browser in full window size
        driver.manage().window().maximize();
        // navigate to the website
        driver.get("https://demo.opencart.com/");
        // validate home page title should be "Your Store"
        String act_title = driver.getTitle();
        if (act_title.equals("Your Store")) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test Failed");
        }
        driver.findElement(By.name("search")).sendKeys("mac");
        boolean logoStatus = driver.findElement(By.id("logo")).isDisplayed();
        System.out.println(logoStatus);

        List<WebElement> headerLinks = driver.findElements(
            By.className("list-inline-item")
        );
        System.out.println("Total number of links: " + headerLinks.size());
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links: " + links.size());
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total number of images: " + images.size());
        driver.close();
    }
}
