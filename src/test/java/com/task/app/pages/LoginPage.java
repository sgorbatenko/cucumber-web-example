
package com.task.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stas.mobile.testing.framework.util.drivers.WebDriverWrapper;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends ApplicationUi
{
    public LoginPage()
    {
        PageFactory.initElements(
            new AppiumFieldDecorator(WebDriverWrapper.getWebDriver()), this);
    }

    @FindBy(name = "userName")
    private WebElement _userName;

    @FindBy(name = "password")
    private WebElement _password;

    @FindBy(name = "login")
    private WebElement _loginBtn;

    @Override
    public void open()
    {
        goToSignin();
    }

    public void doLogin(String username, String password)
    {
        _userName.clear();
        _userName.sendKeys(username.equals("empty") ? "" : username);
        _password.clear();
        _password.sendKeys(password.equals("empty") ? "" : password);
        _loginBtn.click();
    }
}
