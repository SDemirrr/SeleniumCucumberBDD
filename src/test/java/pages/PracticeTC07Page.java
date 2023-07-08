package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PracticeTC07Page {
    public PracticeTC07Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@*='/static/images/home/logo.png']")
    public WebElement anaSyfaWE;
    @FindBy(xpath = "//*[@*='/static/images/home/logo.png']")
    public WebElement testCaseTextWE;
    @FindBy(xpath = "(//i[@class='fa fa-list'])[1]")
    public WebElement testCaseButton;

}
