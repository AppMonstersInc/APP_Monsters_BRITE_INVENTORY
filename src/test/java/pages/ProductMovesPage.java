package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductMovesPage {
public ProductMovesPage(){ PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//span[contains(text(),'Product Moves')])")
    public WebElement productMovesButton;

    @FindBy(xpath = "//div[@class='o_searchview']")
    public WebElement searchBoxProductMoves;

    @FindBy(xpath = "(//*[.='Product Moves'])[2]")
    public WebElement productMovesText;

    @FindBy(xpath = "//table")
    public WebElement table;


}



