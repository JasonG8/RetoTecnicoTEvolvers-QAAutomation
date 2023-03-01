package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Values;
import tasks.BuyProducts;
import tasks.CompareValues;
import tasks.PlaceOrder;
import utils.drivers.MyChromeDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;
import static utils.constantes.ConstantManage.ACTOR;
import static utils.constantes.ConstantManage.URL;

public class BuyProductsSteps {

    @Before
    public void SetUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^user navigate to home page$")
    public void userNavigateToHomePage() throws InterruptedException {
        theActorCalled(ACTOR);
        theActorInTheSpotlight().can(BrowseTheWeb.with(MyChromeDriver.chromeHisBrowserWeb().onTheUrl(URL)));
        Thread.sleep(2000);
    }

    @When("^user adds products to shopping cart$")
    public void userAddsProductsToShoppingCart() throws InterruptedException{
        theActorInTheSpotlight().attemptsTo(BuyProducts.makeinformation());
        Thread.sleep(2000);
    }

    @And("validate that the total price is equal to the sum of all products")
    public void validateThatTheTotalPriceIsEqualToTheSumOfAllProducts() throws InterruptedException {
        Thread.sleep(2000);
        theActorInTheSpotlight().attemptsTo(CompareValues.validatePrice());
        theActorInTheSpotlight().should(seeThat("El valor esperado", Values.value4(), equalTo(2120)));
    }

    @Then("^the user makes a successful purchase$")
    public void theUserMakesASuccessfulPurchase() throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(PlaceOrder.completePurchase());
        Thread.sleep(2000);

    }

}
