package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishlistPage {
  WebDriver driver;

  private By UpdateWishListButton = By.className("update-wishlist-button");
  private By NoData = By.className("no-data");

  public WishlistPage(WebDriver _driver) {
    driver = _driver;
  }

  public void clickOnUpdateWishlistButton() {
    driver.findElement(UpdateWishListButton).click();
  }

  public Boolean isWishlistEmpty() {
    return driver.findElement(NoData).getText().trim().equals("Vaša lista želja trenutno je prazna!");
  }

}