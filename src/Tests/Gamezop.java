package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gamezop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://6090.play.gamezop.com/en/intro?int-nav=1");
        try {
            Thread.sleep(3000); // 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement element1 = driver.findElement(By.cssSelector("[alt='Company logo']"));
        boolean logoStatus = element1.isDisplayed();
        System.out.println("Company logo visible: "+logoStatus);
        String act_logo = element1.getAttribute("src");
        String expected_logo = "/_next/image?url=https%3A%2F%2Fstatic.gamezop.com%2Flogo%2Fgamezop-logo-dark.png&w=3840&q=75";
        if (act_logo.contains(expected_logo)) {
            System.out.println("Test 1 Passed: Company logo image value is found correctly");
        } else{
            System.out.println("Test 1 Failed");
        }

        WebElement element2 = driver.findElement(By.cssSelector("[http-equiv='origin-trial']"));
        String act_orgin_value = element2.getAttribute("content");
        String expected_orgin_value = "A7A1mAzeb9L/mnXZozdzM3Ib+XGlEqoDEIfX0fzRzVtcowON3yAW4LCLpXoP4umrCvxtnGXhOoXdSenBUCTXRAEAAACMeyJvcmlnaW4iOiJodHRwczovL2dhbWV6b3AuY29tOjQ0MyIsImZlYXR1cmUiOiJXZWJWaWV3WFJlcXVlc3RlZFdpdGhEZXByZWNhdGlvbiIsImV4cGlyeSI6MTcxOTUzMjc5OSwiaXNTdWJkb21haW4iOnRydWUsImlzVGhpcmRQYXJ0eSI6dHJ1ZX0=";
        if (act_orgin_value.contains(expected_orgin_value)) {
            System.out.println("Test 2 Passed: origin-trial meta data is found correctly");
        } else{
            System.out.println("Test 2 Failed");
        }
        String act_website_title = driver.getTitle();
        if (act_website_title.equals("Best Free Games Online | Play Online Games on gamezop.com")) {
            System.out.println("Test 3 Passed: Website title is found correctly");
        } else{
            System.out.println("Test 3 Failed");
        }
        WebElement element3 = driver.findElement(By.cssSelector("[class='style_selection_head__uTrBi']"));
        String act_title = element3.getText();
        if (act_title.equals("Select Any 2 Games")) {
            System.out.println("Test 4 Passed: Catgory selection text is found correctly");
        } else{
            System.out.println("Test 4 failed");
        }

        WebElement element4 = driver.findElement(By.cssSelector("[alt='select card games']"));
        String act_category1_image_value = element4.getAttribute("src");
        String expected_category1_image_value = "/_next/image?url=https%3A%2F%2Fstatic.gamezop.com%2Fcomet%2Fassets%2Fimg%2Fintro-flow%2Fm%2Fsolitaire.png&w=384&q=100";
        if (act_category1_image_value.contains(expected_category1_image_value)) {
            System.out.println("Test 5 Passed: Category 1 image value is found correctly");
        } else{
            System.out.println("Test 5 Failed");
        }

        WebElement element5 = driver.findElement(By.cssSelector("[alt='select sports games']"));
        String act_category2_image_value = element5.getAttribute("src");
        String expected_category2_image_value = "/_next/image?url=https%3A%2F%2Fstatic.gamezop.com%2Fcomet%2Fassets%2Fimg%2Fintro-flow%2Fm%2Fcricket.png&w=384&q=100";
        if (act_category2_image_value.contains(expected_category2_image_value)) {
            System.out.println("Test 6 Passed: Category 2 image value is found correctly");
        } else{
            System.out.println("Test 6 Failed");
        }

        WebElement element6 = driver.findElement(By.cssSelector("[alt='select action games']"));
        String act_category3_image_value = element6.getAttribute("src");
        String expected_category3_image_value = "/_next/image?url=https%3A%2F%2Fstatic.gamezop.com%2Fcomet%2Fassets%2Fimg%2Fintro-flow%2Fm%2Ffruit.png&w=384&q=100";
        if (act_category3_image_value.contains(expected_category3_image_value)) {
            System.out.println("Test 7 Passed: Category 3 image value is found correctly");
        } else{
            System.out.println("Test 7 Failed");
        }

        WebElement element7 = driver.findElement(By.cssSelector("[alt='select sport or racing games']"));
        String act_category4_image_value = element7.getAttribute("src");
        String expected_category4_image_value = "/_next/image?url=https%3A%2F%2Fstatic.gamezop.com%2Fcomet%2Fassets%2Fimg%2Fintro-flow%2Fm%2Fcar.png&w=384&q=100";
        if (act_category4_image_value.contains(expected_category4_image_value)) {
            System.out.println("Test 8 Passed: Category 4 image value is found correctly");
        } else{
            System.out.println("Test 8 Failed");
        }

        WebElement element8 = driver.findElement(By.className("style_selection_para__DbM0_"));
        String act_headlineString = element8.getText();
        if (act_headlineString.equals("Help Us Personalize Your Experience")) {
            System.out.println("Test 9 Passed: Sub-text is found correctly");
        } else{
            System.out.println("Test 9 failed");
        }

        WebElement element9 = driver.findElement(By.cssSelector("[alt='select sports games']"));
        element9.click();
        try {
            Thread.sleep(2000); // 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement element10 = driver.findElement(By.cssSelector("[alt='select action games']"));
        element10.click();
        try {
            Thread.sleep(2000); // 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }
}
