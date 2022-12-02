package selenium.tests;



import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class AddNewPostToThreadCodingTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void addNewPostToThreadCoding() {
    driver.get("http://localhost:3000/");
    driver.manage().window().setSize(new Dimension(1237, 667));
    driver.findElement(By.cssSelector(".card:nth-child(2) .card-title")).click();
    driver.findElement(By.cssSelector(".btn-outline-primary")).click();
    driver.findElement(By.id("inputAddress")).click();
    driver.findElement(By.id("inputAddress")).sendKeys("How do you do a for loop in Java");
    driver.findElement(By.id("exampleFormControlTextarea1")).click();
    driver.findElement(By.id("exampleFormControlTextarea1")).click();
    driver.findElement(By.id("exampleFormControlTextarea1")).sendKeys("I don\'t have idea");
    driver.findElement(By.cssSelector(".btn-primary")).click();
    driver.findElement(By.id("list-question-list")).click();
    driver.findElement(By.cssSelector("#d0 > .card-body")).click();
    driver.findElement(By.cssSelector("#d0 > .card-body")).click();
    driver.findElement(By.cssSelector("#accordion > .card")).click();
    driver.findElement(By.cssSelector(".btn-link")).click();
    driver.findElement(By.cssSelector(".btn-link")).click();
    driver.findElement(By.cssSelector(".btn-link")).click();
    driver.findElement(By.cssSelector(".btn-link")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".btn-link"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.id("list-suggestion-list")).click();
    driver.findElement(By.id("list-clarification-list")).click();
  }
}
