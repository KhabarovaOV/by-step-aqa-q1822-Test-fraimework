package by.step.aqa.q1822.Test.framework.page;

import by.step.aqa.q1822.Test.framework.block.CheckBoxBlock;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage extends BasePage{
    private CheckBoxBlock checkBoxBlock = new CheckBoxBlock(driver);
    public CheckBoxPage (WebDriver driver){
        super(driver);
    }

    public CheckBoxBlock getCheckBoxBlock() {
        return checkBoxBlock;
    }
}
