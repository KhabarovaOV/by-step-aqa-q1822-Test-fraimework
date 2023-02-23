package by.step.aqa.q1822.Test.framework.service;

import by.step.aqa.q1822.Test.framework.page.CheckBoxPage;
import org.openqa.selenium.WebDriver;

public class CheckBoxService extends BaseService{

    private CheckBoxPage checkBoxPage = new CheckBoxPage(driver);

    public CheckBoxService(WebDriver driver){
        super(driver);
    }

    public CheckBoxPage getCheckBoxPage() {
        return checkBoxPage;
    }
}
