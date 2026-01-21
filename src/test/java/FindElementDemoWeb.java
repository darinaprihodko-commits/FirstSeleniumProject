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

        WebElement h2 = driver.findElement(By.tagName("h2"));
        System.out.println(h2.getText());

        WebElement h3 = driver.findElement(By.tagName("h3"));
        System.out.println(h3.getText());
    }
    @Test
    public void findElementById() {
        WebElement element = driver.findElement(By.id("small-searchterms"));
        System.out.println(element.getAttribute("id"));

        WebElement topcartlink = driver.findElement(By.id("topcartlink"));
        System.out.println(topcartlink.getAttribute("id"));

        WebElement pollanswers = driver.findElement(By.id("pollanswers-1"));
        System.out.println(pollanswers.getAttribute("id"));

    }
    @Test
    public void findElementByClassName() {
        WebElement element = driver.findElement(By.className("page-body"));
        System.out.println(element.getText());

        WebElement actualprice= driver.findElement(By.className("actual-price"));
        System.out.println(actualprice.getText());

        WebElement title = driver.findElement(By.className("title"));
        System.out.println(title.getText());


    }
}
