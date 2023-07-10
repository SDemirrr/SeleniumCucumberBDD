package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebDriverPage {
    public WebDriverPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='LOGIN PORTAL']")
    public WebElement login;
    @FindBy(xpath = "//*[@*='text']")
    public WebElement userName;

    @FindBy(xpath = "//*[@*='password']")
    public WebElement password;



}
