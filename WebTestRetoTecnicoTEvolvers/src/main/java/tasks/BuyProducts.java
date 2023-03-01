package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuyProducts implements Task  {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(Home.PHONE, WebElementStateMatchers.isVisible()),
                Click.on(Home.PHONE),
                Click.on(Phone.ADDPHONE)
        );

        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

        actor.attemptsTo(
                Click.on(Phone.BACKHOME),
                Click.on(Home.NEXTPAGEBTN),
                Click.on(Home.LAPTOP),
                Click.on(Laptop.ADDLAPTOP)
        );

        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

        actor.attemptsTo(
                Click.on(Laptop.BACKHOME),
                Click.on(Home.NEXTPAGEBTN),
                Click.on(Home.MONITOR),
                Click.on(Monitor.ADDMONITOR)
        );

        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

        actor.attemptsTo(
                Click.on(Monitor.BACKHOME),
                Click.on(Cart.CART)
        );

    }
    public static BuyProducts makeinformation() {
        return instrumented(BuyProducts.class);

    }



}
