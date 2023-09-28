package test.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DealsTest {

    private WebDriver driver;
    private String baseUrl;

    public DealsTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);  // implicit wait// it wait until 30 sec

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.close();
    }

    @Test
    public void testDeal() throws Exception {

        driver.manage().window().maximize();
        // implicit wait condition
        driver.get("https://www.costco.com/");

        WebElement elem1 = driver.findElement(By.xpath("//*[@id=\"Home_Ancillary_2\"]"));
        Actions act = new Actions(driver);
        Action a1 = act.moveToElement(elem1).build();
        a1.perform();

        driver.findElement(By.linkText("Home & Kitchen")).click();
        driver.findElement(By.xpath("//div[@id='WC_ContentAreaESpot_div_1_ProductsSpotlight']/div[2]/ul/li/div[2]/a/div")).click();
        driver.findElement(By.xpath("//img[@alt='Barcalounger Bradford Executive Office Chair']")).click();
        driver.findElement(By.id("__richfx_id_0_2_1790176_850889_2")).click();
    }

}
