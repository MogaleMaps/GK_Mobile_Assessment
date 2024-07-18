package Test;

import Common.Base;
import Common.TestData;
import MobileElements.ShoppingCartPage;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class checkoutTest extends Base {

    ShoppingCartPage shoppingCartPage;
    TestData testData = new TestData();

    @Description("As a sauce labs customer, I should be able to successfully checkout a product")
    public void productCheckoutTest() throws InterruptedException {
        shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.clickSauceLabsBikeLightImage();
        shoppingCartPage.clickAddToCartButton();
        shoppingCartPage.clickShoppingCart();
        shoppingCartPage.clickProceedToCheckoutButton();
        shoppingCartPage.enterUsername();
        shoppingCartPage.enterPassword();
        shoppingCartPage.clickLogin();
        shoppingCartPage.enterFirstName();
        shoppingCartPage.enterAddress();
        shoppingCartPage.enterCity();
        shoppingCartPage.enterZipCode();
        shoppingCartPage.enterCountry();
        shoppingCartPage.clickToPaymentButton();
        shoppingCartPage.enterFirstName();
        shoppingCartPage.enterCardNumber();
        shoppingCartPage.enterExpirationDate();
        shoppingCartPage.enterCvvNumber();
        shoppingCartPage.clickReviewOrder();
        shoppingCartPage.clickPlaceOrderButton();
        shoppingCartPage.checkoutCompleteMessageDisplayed();
        Assert.assertEquals(shoppingCartPage.checkoutCompleteMessageDisplayed(), testData.ORDER_COMPLETE_MESSAGE);
    }
}
