package by.step.aqa.q1822.Test.framework.service;

import by.step.aqa.q1822.Test.framework.page.GooglePlayPage;
import org.openqa.selenium.WebDriver;

public class GooglePlayService extends BaseService{
    private GooglePlayPage googlePlayPage = new GooglePlayPage(driver);
    public GooglePlayService(WebDriver driver){
        super(driver);
    }
    public GooglePlayPage getGooglePlayPage(){return googlePlayPage;}
}
