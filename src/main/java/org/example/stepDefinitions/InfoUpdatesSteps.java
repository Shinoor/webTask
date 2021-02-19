package org.example.stepDefinitions;

import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InfoUpdatesSteps {
    WebDriver driver;

    @When("^clicks on address$")
    public void clicks_on_address() throws Throwable {
        driver.findElement(By.xpath(" //*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span"));

    }

    @When("^clicks on update$")
    public void clicks_on_update() throws Throwable {
        driver.findElements(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[1]/span"));
        String actualTitle = driver.getTitle();
        String expectedTitle = "Address - My Store";
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @When("^user fill the text box$")
    public void user_fill_the_text_box() throws Throwable {
     WebElement textBox = (WebElement) driver.findElements(By.name("other"));
     textBox.sendKeys("I have moved in");


    }

    @When("^clicks on save button$")
    public void clicks_on_save_button() throws Throwable {
       WebElement saveBtn = (WebElement) driver.findElements(By.xpath("//*[@id=\"submitAddress\"]/span"));
       saveBtn.click();

    }

}
