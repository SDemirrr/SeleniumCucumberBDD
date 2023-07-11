package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoQaPages {

    public DemoQaPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@*='btn btn-light '])[11]")
    public WebElement alertsButton;

    @FindBy(xpath = "(//*[text()='Click me'])[2]")
    public WebElement clickMeButton;








}
