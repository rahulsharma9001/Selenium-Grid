package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(css = "img[title='nashTech-logo-red.svg']")
    WebElement logo;
    @FindBy(css = "a.lang-icon-globe.elementskit-submenu-indicator")
    WebElement globalicon;
    @FindBy(css = "div[id='mainNavGetInTouch'] span[class='elementor-button-text']")
    WebElement getInTouchButton;
    @FindBy(css = "input[placeholder='Full Name']")
    WebElement nameField;
    @FindBy(xpath = "//input[@placeholder=\"Email I'd\"]")
    WebElement email;
    @FindBy(css = "textarea[placeholder='How can we help you?']")
    WebElement projectDetails;
    @FindBy(css = "span[class=\"wpcf7-form-control-wrap\"] input[type='checkbox']")
    WebElement checkbox;
    @FindBy(css = "input[class=\"wpcf7-form-control wpcf7-submit has-spinner form-control\"]")
    WebElement submitButton;
    @FindBy(css = "div[class='elementor-element elementor-element-40cfefa iconCard iconCardHover elementor-position-left elementor-vertical-align-top elementor-widget elementor-widget-image-box'] div[class='elementor-widget-container']")
    WebElement qualitySolutions;
    @FindBy(css = "a[href='#automatedtesting']")
    WebElement automatedTesting;
    @FindBy(css = ".e-font-icon-svg.e-fas-search")
    WebElement searchIcon;
    @FindBy(css = "input[placeholder=\"Search keywords\"]")
    WebElement searchTabField;
    @FindBy(css = "img[alt=\"Banner Microsoft Solutions Partner program\"]")
    WebElement searchResult;
    @FindBy(xpath = "(//button[@class='cky-btn cky-btn-accept'])[1]")
    WebElement acceptAll;
    @FindBy(css = "div[id='popupCloseBtn'] div[class='elementor-icon'] svg path")
    WebElement crossButton;
    @FindBy(css = ".hfe-menu-item[href='https://blog.nashtechglobal.com']")
    WebElement blog;
    @FindBy(css = "a[title='Test Automation']")
    WebElement testAutomation;
    @FindBy(css = "button[type='submit']")
    WebElement search;

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }


    public boolean ValidateVisibilityOfLogo(){
        wait.until(ExpectedConditions.visibilityOf(logo));
        return logo.isDisplayed();
    }

    public boolean ValidateVisibilityOfGlobalIcon(){
        wait.until(ExpectedConditions.visibilityOf(globalicon));
        return globalicon.isDisplayed();
    }

    public void clickGetInTouchButton(){
        wait.until(ExpectedConditions.visibilityOf(getInTouchButton));
        getInTouchButton.click();
    }

    public void clickAcceptAllButton(){
        wait.until(ExpectedConditions.visibilityOf(acceptAll));
        acceptAll.click();
    }

    public void enterDetails(){
        wait.until(ExpectedConditions.visibilityOf(nameField));
        nameField.sendKeys("Test Automation");
        wait.until(ExpectedConditions.visibilityOf(email));
        email.sendKeys("Testing@yopmail.com");
        wait.until(ExpectedConditions.visibilityOf(projectDetails));
        projectDetails.sendKeys("This is a Sample project in Selenium for KnolX Demo");
    }

    public void clickCheckBox(){
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        checkbox.click();
    }

    public void clickSubmitButton(){
        wait.until(ExpectedConditions.visibilityOf(submitButton));
        submitButton.click();
    }

    public void clickCrossButton(){
        wait.until(ExpectedConditions.visibilityOf(crossButton));
        crossButton.click();
    }

    public void clickLogo(){
        wait.until(ExpectedConditions.visibilityOf(logo));
        logo.click();
    }

    public void clickQualitySolutions(){
        wait.until(ExpectedConditions.visibilityOf(qualitySolutions));
        qualitySolutions.click();
    }

    public void clickAutomatedTesting(){
        wait.until(ExpectedConditions.visibilityOf(automatedTesting));
        automatedTesting.click();
    }

    public void clickSearchIcon(){
        wait.until(ExpectedConditions.visibilityOf(searchIcon));
        searchIcon.click();
    }

    public void clickSearchTabField(){
        wait.until(ExpectedConditions.visibilityOf(searchTabField));
        searchTabField.click();
        searchTabField.sendKeys("Nashtech");
        search.click();
    }

    public void clickSearchResult(){
        wait.until(ExpectedConditions.visibilityOf(searchResult));
        searchResult.click();
    }

    public void clickBlogFooter(){
        wait.until(ExpectedConditions.visibilityOf(blog));
        blog.click();
    }

    public void switchToTab(int index) {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
    }

    public void clickTestAutomation(){
        wait.until(ExpectedConditions.visibilityOf(testAutomation));
        testAutomation.click();
    }
}


