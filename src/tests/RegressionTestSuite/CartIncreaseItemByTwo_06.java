package tests.RegressionTestSuite;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;

public class CartIncreaseItemByTwo_06 {

  WebDriver driver;
  HomePage homePage;
  LoginPage loginPage;
  CartPage cartPage;

  public CartIncreaseItemByTwo_06() {

  }

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "C:/Users/Administrator/Desktop/chromedriver.exe");
    driver = new ChromeDriver();
    homePage = new HomePage(driver);
    loginPage = new LoginPage(driver);
    cartPage = new CartPage(driver);
  }

  @Test
  public void Run() {
    driver.get("https://www.genelec.ba");
    try {
      Thread.sleep(6000);
      driver.manage().window().maximize();
      loginPage.login();
      Thread.sleep(2000);
      homePage.clickOnMainCart();
      int beforeQty = cartPage.getQtyInput();
      cartPage.IncreaseQtyInput(2);
      cartPage.clickOnUpdateCart();
      int afterQry = cartPage.getQtyInput();
      assertEquals(afterQry, beforeQty + 2);
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
  }

}