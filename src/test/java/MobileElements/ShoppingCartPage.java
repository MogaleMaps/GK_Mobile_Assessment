package MobileElements;

import Common.Base;
import Common.TestData;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Base {

    private final AndroidDriver driver;
    TestData testData = new TestData();

    String sauceLabsBikeLightImage = "//android.widget.TextView[@text='Sauce Labs Bike Light']";
    String addToCartButton = "//android.view.ViewGroup[@content-desc=\"Add To Cart button\"]";
    String cartImage = "//android.view.ViewGroup[@content-desc='cart badge']";
    String proceedToCheckOutButton = "//android.view.ViewGroup[@content-desc='Proceed To Checkout button']";
    String usernameTextBox = "//android.widget.EditText[@content-desc='Username input field']";
    String passwordTextBox = "//android.widget.EditText[@content-desc='Password input field']";
    String loginButton = "//android.view.ViewGroup[@content-desc='Login button']";
    String firstNameTextBox = "//android.widget.EditText[@content-desc='Full Name* input field']";
    String addressTextBox = "//android.widget.EditText[@content-desc='Address Line 1* input field']";
    String cityTextBox = "//android.widget.EditText[@content-desc='City* input field']";
    String zipCodeTextBox = "//android.widget.EditText[@content-desc='Zip Code* input field']";
    String countryTextBox = "//android.widget.EditText[@content-desc='Country* input field']";
    String toPaymentButton = "//android.view.ViewGroup[@content-desc='To Payment button']";
    String cardNumberTextBox ="//android.widget.EditText[@content-desc='Card Number* input field']";
    String expirationTextBox = "//android.widget.EditText[@content-desc='Expiration Date* input field']";
    String cvvTextBox = "//android.widget.EditText[@content-desc='Security Code* input field']";
    String reviewOrderButton = "//android.view.ViewGroup[@content-desc='Review Order button']";
    String placeOrderButton = "//android.view.ViewGroup[@content-desc='Place Order button']";
    String checkoutCompleteLabel = "//android.view.ViewGroup[@content-desc='checkout complete screen']/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[2]";

    public ShoppingCartPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clickSauceLabsBikeLightImage(){
        driver.findElement(By.xpath(sauceLabsBikeLightImage)).click();
    }

    public void clickAddToCartButton() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath(addToCartButton)).click();
    }

    public void clickShoppingCart() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(cartImage)).click();
    }

    public void clickProceedToCheckoutButton() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(proceedToCheckOutButton)).click();
    }

    public void enterUsername() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(usernameTextBox)).sendKeys(testData.USERNAME);
    }

    public void enterPassword(){
        driver.findElement(By.xpath(passwordTextBox)).sendKeys(testData.PASSWORD);
    }

    public void clickLogin(){
        driver.findElement(By.xpath(loginButton)).click();
    }

    public void enterFirstName() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(firstNameTextBox)).sendKeys(testData.FIRST_NAME);
    }

    public void enterAddress(){
        driver.findElement(By.xpath(addressTextBox)).sendKeys(testData.ADDRESS);
    }

    public void enterCity(){
        driver.findElement(By.xpath(cityTextBox)).sendKeys(testData.CITY);
    }

    public void enterZipCode(){
        driver.findElement(By.xpath(zipCodeTextBox)).sendKeys(testData.ZIP);
    }

    public void enterCountry(){
        driver.findElement(By.xpath(countryTextBox)).sendKeys(testData.COUNTRY);
    }

    public void clickToPaymentButton() {
        driver.findElement(By.xpath(toPaymentButton)).click();
    }

    public void enterCardNumber() {
        driver.findElement(By.xpath(cardNumberTextBox)).sendKeys(testData.CARD_NUMBER);
    }

    public void enterExpirationDate() {
        driver.findElement(By.xpath(expirationTextBox)).sendKeys(testData.EXPIRY);
    }

    public void enterCvvNumber() {
        driver.findElement(By.xpath(cvvTextBox)).sendKeys(testData.CVV);
    }

    public void clickReviewOrder() {
        driver.findElement(By.xpath(reviewOrderButton)).click();
    }

    public void clickPlaceOrderButton() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(placeOrderButton)).click();
    }

    public String checkoutCompleteMessageDisplayed() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(By.xpath(checkoutCompleteLabel)).getText();
    }
}
