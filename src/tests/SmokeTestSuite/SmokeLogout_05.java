package tests.SmokeTestSuite;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.LoginPage;

public class SmokeLogout_05 {
  private WebDriver driver;
  private HomePage homePage;
  private LoginPage loginPage;

  public SmokeLogout_05() {

  }

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "C:/Users/Administrator/Desktop/chromedriver.exe");
    driver = new ChromeDriver();
    homePage = new HomePage(driver);
    loginPage = new LoginPage(driver);
  }

  @Test
  public void Run() {
    driver.get("https://www.genelec.ba");
    try {
      Thread.sleep(6000);
      driver.manage().window().maximize();
      homePage.clickOnHeaderLinksWrapper();
      loginPage.login();
      Thread.sleep(2000);
      homePage.clickOnHeaderLinksWrapper();
      homePage.clickOnLogout();
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
  }
}