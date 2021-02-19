package org.example.stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderProductsSteps {
   public static WebDriver driver;
   public static WebDriverWait wait = new WebDriverWait(driver, 20);

    @When("^clicks on T-shirt$")
    public void clicks_on_T_shirt() throws Throwable {


        WebElement tshirt = driver.findElement ( By.xpath ( "//*[@id=\"block_top_menu\"]/ul/li[3]/a" ) );
        wait = new WebDriverWait ( driver, 2 );
        tshirt.click ( );
        String actualTitle = driver.getTitle();
        String expectedTitle = "T-shirts - My Store";
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @When("^clicks on the shirt image view$")
    public void clicks_on_the_shirt_image_view() throws Throwable {
        // Move mousesHover and select item
        WebElement viewImageItem = driver.findElement ( By.xpath (
                "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[2]/span" ) );

        Actions action = new Actions (driver);
        action.moveToElement ( viewImageItem  ).build ().perform ();
        wait.until ( ExpectedConditions.visibilityOf ( viewImageItem  ) ).isSelected( );
        System.out.println ( "Printed dress successfully selected" );

    }

    @When("^add with the quantity button$")
    public void add_with_the_quantity_button() throws Throwable {

        String CurrentWidow = driver.getWindowHandle();
        WebElement addQuantity = driver.findElement ( By.id (
                "quantity_wanted" ) );
        addQuantity.click();

        wait = new WebDriverWait ( driver, 2 );
       WebElement addBtn = (WebElement) driver.findElements(By.xpath(
               " xpath //*[@id=\"add_to_cart\"]/button/span"));
       addBtn.click();


    }

    @Then("^successful message seen$")
    public void successful_message_seen() throws Throwable {
        // page verification
        WebElement pageVer = driver.findElement(By.xpath(
                "//*[@id=\"layer_cart\"]/div[1]/div[1]/h2/text()"));
        pageVer.equals("Product successfully added to your shopping car");



    }
}
