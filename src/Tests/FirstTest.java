package Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Arrays;
import java.util.List;

public class FirstTest {

    public static void main(String[] args) {
        // Set the path of chromedriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/shravan/Documents/SeleniumPractice/src/drivers/chromedriver");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the URL
        driver.get("https://6090.play.gamezop.com/");
        WebElement element = driver.findElement(By.cssSelector("[data-testid='language-dropdown']"));
        // you can click on the element
        element.click();
        // select the dropdown element
        WebElement element2 = driver.findElement(By.cssSelector("[class='style_language_list_wrapper__7LhxW style_block__Ew4Ab']"));
        // stores the texts found in this element
        String elementText = element2.getText();
        // creating a list to store languages as text values to check from
        List<String> expectedTexts = Arrays.asList("English", "हिंदी", "Español", "Chinese");
        // Assert that the element contains all the expected texts
        for (String expectedText : expectedTexts) {
            if (!elementText.contains(expectedText)) {
                System.out.println("Assertion failed for text: " + expectedText);
            } else {
                System.out.println("Assertion passed for text: " + expectedText);
            }
        }

        // Wait for a few seconds to see the page
        try {
            Thread.sleep(3000); // 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
