package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import userinterfaces.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuyProducts implements Task  {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(Home.PHONE),
                Click.on(phone.ADDPHONE)
        );

        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

        actor.attemptsTo(
                Click.on(phone.BACKHOME),
                Click.on(Home.NEXTPAGEBTN),
                Click.on(Home.LAPTOP),
                Click.on(laptop.ADDLAPTOP)
        );

        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

        actor.attemptsTo(
                Click.on(laptop.BACKHOME),
                Click.on(Home.NEXTPAGEBTN),
                Click.on(Home.MONITOR),
                Click.on(monitor.ADDMONITOR)
        );

        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

        actor.attemptsTo(
                Click.on(monitor.BACKHOME),
                Click.on(cart.CART)
        );

    }
    public static BuyProducts makeinformation() {
        return instrumented(BuyProducts.class);

    }



}
