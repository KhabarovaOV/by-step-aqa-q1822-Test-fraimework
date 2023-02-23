package by.step.aqa.q1822.Test.framework.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxBlock extends BaseBlock {
    public CheckBoxBlock (WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//span[@class='VkIdCheckbox__checkboxOn']")
    public WebElement checkBoxOnSaveInputElement;

    @FindBy(xpath = "//span[@class='VkIdCheckbox__checkboxOff']")
    public WebElement checkBoxOffSaveInputElement;
}
