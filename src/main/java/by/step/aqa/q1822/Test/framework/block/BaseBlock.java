package by.step.aqa.q1822.Test.framework.block;

import org.openqa.selenium.WebDriver;

public class BaseBlock {
    protected WebDriver driver;

    public BaseBlock (WebDriver driver){
        this.driver = driver;
    }
}
