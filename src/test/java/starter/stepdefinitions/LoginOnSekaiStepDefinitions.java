package starter.stepdefinitions;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.jbehave.core.annotations.BeforeStory;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import starter.login.LoginResult;
import starter.navigation.NavigateTo;
import starter.search.SearchFor;
import starter.login.EnterCred;
import starter.search.SearchResult;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.everyItem;
import static starter.matchers.StringContainsIgnoringCase.containsIgnoringCase;

public class LoginOnSekaiStepDefinitions {

   @BeforeStory
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("$user is on the landingPage")
    public void on_the_landingPage(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.theSekaiHomePage());
    }

    @When("he enters for \"$username\" and \"$password\"")
    public void enter_credentials(String username,String password) {
        theActorInTheSpotlight().attemptsTo( EnterCred.cred(username,password) );
    }

    @Then("error message should be displayed \"$errormsg\"")

    public void message_should_be_displayed(String errormsg) {
        theActorInTheSpotlight().should(
                seeThat("error message summaries",
                        LoginResult.summaries(), everyItem(containsIgnoringCase(errormsg)))
        );
}
}
