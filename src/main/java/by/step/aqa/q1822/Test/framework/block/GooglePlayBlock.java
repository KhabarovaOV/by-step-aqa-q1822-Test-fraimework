package by.step.aqa.q1822.Test.framework.block;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePlayBlock extends BaseBlock{

    public GooglePlayBlock(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@class='LoginMobilePromoStore__link' and @href=\"https://play.google.com/store/apps/details?id=com.vkontakte.android\"]//span[@class='FlatButton__content']")
    public WebElement GoogleButtonElement;

}
