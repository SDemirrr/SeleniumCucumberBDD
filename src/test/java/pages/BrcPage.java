package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class BrcPage {
    public BrcPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@*='btn btn-primary btn-sm']")
   public WebElement login1;

    @FindBy(xpath = "//*[@*='email']")
    public WebElement email;

    @FindBy(xpath = "(//*[text()=' Login'])[2]")
    public WebElement login2;
    @FindBy(xpath = "(//*[@*='formBasicPassword'])[2]")
    public WebElement password;
}
