package by.step.aqa.q1822.Test.framework.checkbox_test;

import by.step.aqa.q1822.Test.framework.base.BaseUITestClass;
import by.step.aqa.q1822.Test.framework.service.GooglePlayService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class GooglePlayTest extends BaseUITestClass {

    private GooglePlayService googlePlayService;
    @BeforeEach
    public  void openGooglePlayPage(){
        driver.navigate().to("https://vk.com/");
    }
    @Test
    public void verifyGooglePlayButton(){
        googlePlayService = new GooglePlayService(driver);
        Assertions.assertEquals(true, googlePlayService.getGooglePlayPage().getGooglePlayBlock().GoogleButtonElement.isDisplayed());
    }

}
