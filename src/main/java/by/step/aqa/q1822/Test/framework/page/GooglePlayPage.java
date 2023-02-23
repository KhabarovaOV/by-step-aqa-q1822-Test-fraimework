package by.step.aqa.q1822.Test.framework.page;

import by.step.aqa.q1822.Test.framework.block.BaseBlock;
import by.step.aqa.q1822.Test.framework.block.GooglePlayBlock;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePlayPage extends BasePage {
    private GooglePlayBlock googlePlayBlock = new GooglePlayBlock(driver);
    public GooglePlayPage (WebDriver driver){
        super(driver);
    }

    public GooglePlayBlock getGooglePlayBlock() {
        return googlePlayBlock;
    }
}
