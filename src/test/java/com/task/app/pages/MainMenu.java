
package com.task.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stas.mobile.testing.framework.util.drivers.WebDriverWrapper;

public class MainMenu
{
    public MainMenu()
    {
        PageFactory.initElements(WebDriverWrapper.getWebDriver(), this);
    }

    @FindBy(linkText = "SIGN-ON")
    private WebElement _signin;

    @FindBy(linkText = "SIGN-OFF")
    private WebElement _signout;

    @FindBy(linkText = "REGISTER")
    private WebElement _register;

    @FindBy(linkText = "PROFILE")
    private WebElement _profile;

    public WebElement getSignin()
    {
        return _signin;
    }

    public WebElement getSignout()
    {
        return _signout;
    }

    public WebElement getRegister()
    {
        return _register;
    }

    public WebElement getProfile()
    {
        return _profile;
    }

}
