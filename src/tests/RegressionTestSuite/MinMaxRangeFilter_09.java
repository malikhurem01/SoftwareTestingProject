package tests.RegressionTestSuite;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.LoginPage;
import pages.ShopPage;

public class MinMaxRangeFilter_09 {

    WebDriver driver;
    HomePage homePage;
    ShopPage shopPage;

    public MinMaxRangeFilter_09() {

    }

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "C:/Users/Administrator/Desktop/chromedriver.exe");
    driver = new ChromeDriver();
    homePage = new HomePage(driver);
    shopPage = new ShopPage(driver);
  }

  @Test
  public void Run() {
    driver.get("https://genelec.ba/mobitelic-576");
    try {
      Thread.sleep(6000);
      driver.manage().window().maximize();
      shopPage.inputMinPrice();
} catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
  }
}

