package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

  private WebDriver driver;

  private By QtyInput = By.className("qty-input");
  private By UpdateButton = By.className("update-cart-button");
  private By DeleteCheck = By.name("removefromcart");
  private By NoData = By.className("no-data");

  public CartPage(WebDriver _driver) {
    driver = _driver;
  }

  public int getQtyInput() {
    String qty = driver.findElement(QtyInput).getAttribute("value");
    return Integer.valueOf(qty).intValue();
  }

  public void decreaseQtyInput(int qty) {
    WebElement element = driver.findElement(QtyInput);
    int currentQty = Integer.valueOf(element.getAttribute("value")).intValue();
    element.clear();
    element.sendKeys(String.valueOf(currentQty - qty));
  }

  public void IncreaseQtyInput(int qty) {
    WebElement element = driver.findElement(QtyInput);
    int currentQty = Integer.valueOf(element.getAttribute("value")).intValue();
    element.clear();
    element.sendKeys(String.valueOf(currentQty + qty));
  }

  public void clickOnUpdateCart() {
    driver.findElement(UpdateButton).click();
  }

  public void clickOnDeleteCheck() {
    driver.findElement(DeleteCheck).click();
  }

  public Boolean isCartEmpty() {
    return driver.findElement(NoData).getText().trim().equals("Vaša korpa je prazna!");
  }

}