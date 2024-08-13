import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class GridTest {
    private WebDriver driver;
    private WebDriverWait wait;
    ChromeOptions options;
    private HomePage homePage;

    @BeforeTest
    public void setup() throws MalformedURLException {
        options = new ChromeOptions();
        driver = new RemoteWebDriver(new URL("http://localhost:4444"),options);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.nashtechglobal.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        homePage = new HomePage(driver, wait);
    }

    @AfterTest
    public void teardown(){
        driver.quit();
    }

    @Test(priority = 0)
    public void verifypageload(){
        String ExpTitle = "IT Consulting Services & Solutions | Technology Services - NashTech";
        Assert.assertEquals(ExpTitle,driver.getTitle());
    }

    @Test(priority = 1)
    public void validateLogo(){
        Assert.assertTrue(homePage.ValidateVisibilityOfLogo());
    }

    @Test(priority = 2)
    public void validateGlobalIcon(){
        Assert.assertTrue(homePage.ValidateVisibilityOfGlobalIcon());
    }

    @Test(priority = 3)
    public void clickAcceptAllButton(){
        homePage.clickAcceptAllButton();
        homePage.clickGetInTouchButton();
    }

    @Test(priority = 4)
    public void enterInformation(){
        homePage.enterDetails();
        homePage.clickCheckBox();
        homePage.clickSubmitButton();
    }

    @Test(priority = 5)
    public void navigateToQualitySolutions(){
        homePage.clickCrossButton();
        homePage.clickLogo();
        homePage.clickQualitySolutions();
    }

    @Test(priority = 6)
    public void navigateToAutomatedTesting(){
        homePage.clickAutomatedTesting();
    }

    @Test(priority = 7)
    public void searchResult(){
        homePage.clickSearchIcon();
        homePage.clickSearchTabField();
    }

    @Test(priority = 8)
    public void clickFirstResult(){
        homePage.clickSearchResult();
    }

    @Test(priority = 9)
    public void clickBlogFooter(){
        homePage.clickBlogFooter();
        homePage.switchToTab(1);
        homePage.clickTestAutomation();
    }
}
