package org.example.stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class LoginSteps {
   public static WebDriver driver;

    //Global Hooks
    @Before
    public void InitializeBrowser(){
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") +
                        "\\src\\main\\java\\org\\example\\resource\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }


    @Given("^User is on Application Home Page$")
    public void user_is_on_Application_Home_Page() throws Throwable {

        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @Before("@Smoke")
    public void beforeSmoke(){
        // Doing Some SetUp
        System.out.println("Hi I am Pre-Req of Smoke Test");
    }

    @After("@Smoke")
    public void afterSmoke(){
        //Do Some Code
        System.out.println("After Smoke Test");
    }

    @When("^Application Page Tittle automation practice$")
    public void application_Page_Tittle_automation_practice() throws Throwable {
        WebDriverWait wait = new WebDriverWait ( driver, 20 );
        String actualTitle = driver.getTitle();
        String expectedTitle = "My Store";
        Assert.assertEquals(expectedTitle, actualTitle);

    }



    @Then("^user enters userEmail and password$")
    public void user_enter_useremail_and_password(DataTable credentials) throws Throwable {

            for (Map<String, String> dataMap : credentials.asMaps(String.class, String.class)) {
                WebDriverWait wait = new WebDriverWait ( driver, 20 );
                driver.findElements(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
                driver.findElement(By.id("index")).sendKeys(dataMap.get("userEmail"));
                driver.findElement(By.id("authentication")).sendKeys(dataMap.get("password"));
                wait = new WebDriverWait ( driver, 2 );
            }
    }
    @Then("^user clicks on sign in Button$")
    public void user_clicks_on_sign_in_Button() throws Throwable {
        //SubmitLogin
        WebElement signBtn = driver.findElement(By.id("SubmitLogin"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", signBtn);

    }

    @When("^User navigate to user Profile page$")
    public void user_navigate_to_user_Profile_page() throws Throwable {
        String actualTitle = driver.getTitle();
        String expectedTitle = "My account - My Store";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("^Close the Browser$")
    public void close_the_Browser() throws Throwable {
        driver.close();
    }
}
