package by.step.aqa.q1822.Test.framework.checkbox_test;

import by.step.aqa.q1822.Test.framework.base.BaseUITestClass;
import by.step.aqa.q1822.Test.framework.service.CheckBoxService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CheckBoxTest extends BaseUITestClass {

    private CheckBoxService checkBoxService;

    @BeforeEach
    public  void openCheckBoxPage(){
        driver.navigate().to("https://vk.com/");
    }
    @Test
    public void verifyCheckBoxSaveInput(){
        checkBoxService = new CheckBoxService(driver);
        Assertions.assertEquals(true, checkBoxService.getCheckBoxPage().getCheckBoxBlock().checkBoxOnSaveInputElement.isDisplayed());
    }


    @Test
    public void verifyCheckBoxOff(){
        checkBoxService = new CheckBoxService(driver);
        Assertions.assertEquals(false, checkBoxService.getCheckBoxPage().getCheckBoxBlock().checkBoxOffSaveInputElement.isDisplayed());
    }

    @Test
    public void verifyCheckBoxClick(){
        checkBoxService = new CheckBoxService(driver);
        checkBoxService.getCheckBoxPage().getCheckBoxBlock().checkBoxOnSaveInputElement.click();
        Assertions.assertEquals(true, checkBoxService.getCheckBoxPage().getCheckBoxBlock().checkBoxOffSaveInputElement.isDisplayed());
    }

}
