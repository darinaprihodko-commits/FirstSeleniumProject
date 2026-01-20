import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindElementDemoWeb {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void findElementByName(){
        WebElement strong = driver.findElement(By.tagName("strong"));
        System.out.println(strong.getText());
    }
    @Test
    public void findElementById() {
        WebElement element = driver.findElement(By.id("small-searchterms"));
        System.out.println(element.getAttribute("id"));
    }
    @Test
    public void findElementByClassName() {
        WebElement element = driver.findElement(By.className("page-body"));
        System.out.println(element.getText());

    }
}
