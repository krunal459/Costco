package test.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TravelTest {
private WebDriver driver;
    private String baseUrl;

    public TravelTest() {
    }

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
        //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);  // implicit wait// it wait until 30 sec
//driver.manage()timeouts().implicitlyWait(timeSpan.FromSeconds(5));
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
          driver.close();

    }
    
    
    @Test
     public void testTravel() throws Exception {
      
    driver.manage().window().maximize();
    driver.get("https://www.costco.com/");
    WebElement elem1 = driver.findElement(By.xpath("//*[@id=\"Home_Ancillary_8\"]"));
        Actions act = new Actions(driver);
        Action a1 = act.moveToElement(elem1).build();
        a1.perform();  
    driver.findElement(By.linkText("Vacation Packages")).click();
    driver.get("https://www.costcotravel.com/Vacation-Packages?utm_source=costco.com&utm_medium=fly_down&utm_campaign=vp&utm_term=Vacation-Packages&utm_content=20211206");
    driver.findElement(By.id("vacation_package_destination")).click();
    new Select(driver.findElement(By.id("vacation_package_destination"))).selectByVisibleText("Fiji");
    driver.findElement(By.id("region")).click();
    new Select(driver.findElement(By.id("region"))).selectByVisibleText("Pacific Harbor (PHR)");
    driver.findElement(By.xpath("//img[@alt='Departure date calendar']")).click();
    driver.findElement(By.linkText("5")).click();
    driver.findElement(By.xpath("//img[@alt='Return date calendar']")).click();
    driver.findElement(By.linkText("19")).click();
  
    driver.findElement(By.id("departureCityTextWidget")).click();
    driver.findElement(By.id("departureCityTextWidget")).sendKeys("(ORD) Chicago O'Hare International");
    new Select(driver.findElement(By.id("serviceClassWidget"))).selectByVisibleText("Business");
    
    driver.findElement(By.xpath("//div[@id='number_of_rooms_widget']/select")).click();
    driver.findElement(By.id("adultsInRoomForWidget_1")).click();
    
    driver.findElement(By.xpath("//*[@id=\"vpSearchSubmitId\"]/button")).click();
    
    driver.get("https://www.costcotravel.com/h=1001_1_true_5919");
}
}