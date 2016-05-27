
package com.task.app.steps;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;

import org.openqa.selenium.By;

import com.stas.mobile.testing.framework.util.drivers.WebDriverWrapper;
import com.task.app.pages.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps
{
    private LoginPage _loginPage;

    public LoginSteps(LoginPage loginPage)
    {
        super();
        _loginPage = loginPage;
    }

    @Given("^I am on the Sign-in page$")
    public void i_am_on_the_Sign_in_page()
    {
        _loginPage.open();
    }

    @When("^I submit username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void i_submit_username_and_password(String username, String password)
    {
        _loginPage.doLogin(username, password);
    }

    @Then("^I should see Flight Finder page$")
    public void i_should_see_Flight_Finder_page()
    {
        assertThat(WebDriverWrapper.getWebDriver().getCurrentUrl(), is(TestData.FLIGHT_PAGE_URL));
    }

    @Then("^I see error message \"([^\"]*)\"$")
    public void i_see_error_message(String message)
    {
        assertThat(WebDriverWrapper.getWebDriver()
            .findElement(By.name("SOME_NAME_UPDATE_ME_VALIDATIONS_DONE")), is(message));
    }

    @After()
    public void afterRunningScenario()
    {
        _loginPage.performLogout();
    }
}

