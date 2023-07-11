package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPracticePage{
    public AmazonPracticePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@*='nav-link-accountList-nav-line-1']")
    public WebElement signinButton;

    @FindBy(xpath = "(//*[@*='ap_email'])[2]")
    public WebElement emailTextBox;

    @FindBy(xpath = "(//*[@*='continue'])[2]")
    public WebElement continueButton;
    @FindBy(xpath = "(//*[@*='a-alert-heading'])[1]")
    public WebElement mesajText;
    @FindBy(xpath = "//*[@*='a-expander-prompt']")
    public WebElement needHelp;
    @FindBy(xpath = "(//*[@*='a-link-normal'])[1]")
    public WebElement forgotYourPass;
    @FindBy(xpath = "//h1")
    public WebElement passAssistance;
    @FindBy(xpath = "//*[@*='createAccountSubmit']")
    public WebElement crateYourAcc;

    @FindBy(xpath = "//h1")
    public WebElement createAccText;








        }
