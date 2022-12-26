package tests.SmokeTestSuite;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;

public class SmokeLogin_02 {

  private WebDriver driver;
  private LoginPage loginPage;

  public SmokeLogin_02() {

  }

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "C:/Users/Administrator/Desktop/chromedriver.exe");
    driver = new ChromeDriver();
    loginPage = new LoginPage(driver);
  }

  @Test
  public void Run() {
    driver.get("https://www.genelec.ba");
    try {
      Thread.sleep(6000);
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
    driver.manage().window().maximize();
    loginPage.clickOnHeaderLinksWrapper();
    loginPage.clickOnLoginLink();
    loginPage.setEmail("xeucinneiviwoi-7958@yopmail.com");
    loginPage.setPassword("kosilicazatravu123123");
    loginPage.clickOnRememberMe();
    loginPage.loginSubmit();
    assertNotEquals(driver.getCurrentUrl(), "https://genelec.ba/");
  }
}