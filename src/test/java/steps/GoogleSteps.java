package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePage;
//Hello

public class GoogleSteps {

    GooglePage google = new GooglePage();

    @Given("^Go to the search page$")
    public void navigateToGoogle(){
        google.navigateToGoogle();
    }

    @When("^enter search criteria$")
    public void enterSearchCriteria(){
        google.enterSearchCriteria("Angel es cagá");

    }

    @And("^click on search button$")
    public void clickOnSearchButton(){
        google.clickGoogleSearch();
    }

    @Then("^validate search criteria$")
    public void validateSearchCriteria(){

    }



}
