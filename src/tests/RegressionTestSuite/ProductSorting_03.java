package tests.RegressionTestSuite;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ShopPage;

public class ProductSorting_03 {

  WebDriver driver;
  ShopPage shopPage;
  public ProductSorting_03() {

  }

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "C:/Users/Administrator/Desktop/chromedriver.exe");
    driver = new ChromeDriver();
    shopPage = new ShopPage(driver);
  }

  @Test
  public void Run() {
    driver.get("https://genelec.ba/notebookc-106");
    try {
      Thread.sleep(6000);
      driver.manage().window().maximize();
      shopPage.clickOnSortInput();
      shopPage.sortByDescendingNameOrder();
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
  }

}