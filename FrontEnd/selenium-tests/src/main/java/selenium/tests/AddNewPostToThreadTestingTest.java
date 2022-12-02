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
public class AddNewPostToThreadTestingTest {
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
  public void addNewPostToThreadTesting() {
    // Test name: AddNewPostToThreadTesting
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:3000/");
    // 2 | setWindowSize | 1237x667 | 
    driver.manage().window().setSize(new Dimension(1237, 667));
    // 3 | click | css=.card:nth-child(3) .card-title | 
    driver.findElement(By.cssSelector(".card:nth-child(3) .card-title")).click();
    // 4 | click | css=.btn-outline-primary | 
    driver.findElement(By.cssSelector(".btn-outline-primary")).click();
    // 5 | click | id=inputAddress | 
    driver.findElement(By.id("inputAddress")).click();
    // 6 | type | id=inputAddress | vdosivhdsvubis
    driver.findElement(By.id("inputAddress")).sendKeys("vdosivhdsvubis");
    // 7 | click | id=exampleFormControlTextarea1 | 
    driver.findElement(By.id("exampleFormControlTextarea1")).click();
    // 8 | type | id=exampleFormControlTextarea1 | hwr8eghrehgw9e8hf89ewy
    driver.findElement(By.id("exampleFormControlTextarea1")).sendKeys("hwr8eghrehgw9e8hf89ewy");
    // 9 | click | css=.btn-primary | 
    driver.findElement(By.cssSelector(".btn-primary")).click();
    // 10 | click | id=list-question-list | 
    driver.findElement(By.id("list-question-list")).click();
    // 11 | click | css=#d0 > .card-body | 
    driver.findElement(By.cssSelector("#d0 > .card-body")).click();
    // 12 | click | css=#d0 > .card-body | 
    driver.findElement(By.cssSelector("#d0 > .card-body")).click();
    // 13 | click | css=#accordion > .card | 
    driver.findElement(By.cssSelector("#accordion > .card")).click();
    // 14 | click | css=#d0 > .card-body | 
    driver.findElement(By.cssSelector("#d0 > .card-body")).click();
  }
}
