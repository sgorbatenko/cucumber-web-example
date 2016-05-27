
package com.task.app.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.stas.mobile.testing.framework.util.drivers.WebDriverWrapper;

public abstract class ApplicationUi
{
    private MainMenu _menu = new MainMenu();
    public final WebDriverWait _wait = new WebDriverWait(WebDriverWrapper.getWebDriver(), 10, 100);

    public abstract void open();

    public ApplicationUi()
    {
        PageFactory.initElements(WebDriverWrapper.getWebDriver(), this);
    }

    protected void goToRegister()
    {
        _wait.until(ExpectedConditions.elementToBeClickable(_menu.getRegister()));
        _menu.getRegister().click();
    }

    public void performLogout()
    {
        List tmp = WebDriverWrapper.getWebDriver().findElements(By.linkText("SIGN-OFF"));
        if (!tmp.isEmpty())
        {
            _menu.getSignout().click();
        }
    }

    protected void goToSignin()
    {
        _menu.getSignin().click();
    }

    protected void goToProfile()
    {
        _menu.getProfile().click();
    }

}
