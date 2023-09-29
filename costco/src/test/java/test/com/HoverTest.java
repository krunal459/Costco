package test.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoverTest {
    
 private WebDriver driver;//global driver for selenium
    private String baseUrl;
    public HoverTest() {
    }
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");//geeko driver for google browser
       // driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions(); 
        options.addArguments("--headless"); 
        options.addArguments("--disable-gpu"); 
        options.addArguments("--window-size=1400,800");
 
        WebDriver driver = new ChromeDriver(options);
       
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    driver.close();
    }

     @Test
    public void hover() throws Exception {
        //   driver = new ChromeDriver();
        driver.manage().window().maximize();
        // implicit wait condition
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        // this opens the url
        driver.get("https://www.costco.com/");

        //Mouse hover
        //WebElement elem1 = driver.findElement(By.xpath("//a[contains(@id, 'navigation-dropdown')]"));
        WebElement elem1 = driver.findElement(By.xpath("//*[@id=\"navigation-dropdown\"]"));
        Actions act = new Actions(driver);
        Action a1 = act.moveToElement(elem1).build();
        a1.perform();

        //To wait for element visible
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("4")));

        WebElement elem2 = driver.findElement(By.id("4"));
        elem2.click();
    }

}
//sucessfull
