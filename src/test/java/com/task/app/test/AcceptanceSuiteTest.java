
package com.task.app.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.stas.mobile.testing.framework.util.drivers.WebDriverWrapper;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"}, glue = {
    "com.task.app.steps"}, tags = {"~@ignore"})

public class AcceptanceSuiteTest
{
    protected static WebDriver driver;

    @BeforeClass
    public static void setupClass()
    {
        driver = WebDriverWrapper.getWebDriver();
        driver.get("http://newtours.demoaut.com/");
    }

    @AfterClass
    public static void afterClass()
    {
        driver.quit();
    }
}

