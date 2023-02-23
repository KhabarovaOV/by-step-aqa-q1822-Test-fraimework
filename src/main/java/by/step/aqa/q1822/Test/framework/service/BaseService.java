package by.step.aqa.q1822.Test.framework.service;

import org.openqa.selenium.WebDriver;

public class BaseService {
    protected WebDriver driver;

    public  BaseService (WebDriver driver){
        this.driver = driver;
    }

}
