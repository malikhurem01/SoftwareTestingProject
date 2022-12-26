package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
  private WebDriver driver;

  private By HeaderLinksWrapper = By.className("header-links-wrapper");
  private By RegisterNav = By.className("ico-register");
  private By GenderMale = By.id("gender-male");
  private By FirstName = By.id("FirstName");
  private By LastName = By.id("LastName");
  private By Email = By.id("Email");
  private By Company = By.id("Company");
  private By StreetAddress = By.id("StreetAddress");
  private By ZipPostalCode = By.id("ZipPostalCode");
  private By City = By.id("City");
  private By Phone = By.id("Phone");
  private By Newsletter = By.id("Newsletter");
  private By Password = By.id("Password");
  private By ConfirmPassword = By.id("ConfirmPassword");
  private By ConfirmButton = By.id("register-button");

  public RegisterPage(WebDriver _driver) {
    driver = _driver;
  }

  public void clickOnHeaderLinksWrapper() {
    driver.findElement(HeaderLinksWrapper).click();
  }

  public void clickOnRegisterLink() {
    driver.findElement(RegisterNav).click();
  }

  public void clickOnGenderMale() {
    driver.findElement(GenderMale).click();
  }

  public void setFirstName(String firstName) {
    driver.findElement(FirstName).sendKeys(firstName);
  }

  public void setLastName(String lastName) {
    driver.findElement(LastName).sendKeys(lastName);
  }

  public void setEmail(String email) {
    driver.findElement(Email).sendKeys(email);
  }

  public void setCompany(String company) {
    driver.findElement(Company).sendKeys(company);
  }

  public void setStreetAddress(String streetAddress) {
    driver.findElement(StreetAddress).sendKeys(streetAddress);
  }

  public void setZipPostalCode(String zipPostalCode) {
    driver.findElement(ZipPostalCode).sendKeys(zipPostalCode);
  }

  public void setCity(String city) {
    driver.findElement(City).sendKeys(city);
  }

  public void setPhone(String phone) {
    driver.findElement(Phone).sendKeys(phone);
  }

  public void clickOnNewsletter() {
    driver.findElement(Newsletter).click();
  }

  public void setPassword(String password) {
    driver.findElement(Password).sendKeys(password);
  }

  public void setConfirmPassword(String confirmPassword) {
    driver.findElement(ConfirmPassword).sendKeys(confirmPassword);
  }

  public void clickConfirmButton() {
    driver.findElement(ConfirmButton).click();
  }
}