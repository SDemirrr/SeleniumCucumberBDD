package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTablesPage {
    public DataTablesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@*='dt-button buttons-create']")
    public WebElement newButton;
    @FindBy(xpath = "(//*[@*='DTE_Field_first_name'])[2]")
    public WebElement firstName;
    @FindBy(xpath = "//*[@type='search']")
    public WebElement searchTextBox;

    @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement isimDogrulamaWE;


}
