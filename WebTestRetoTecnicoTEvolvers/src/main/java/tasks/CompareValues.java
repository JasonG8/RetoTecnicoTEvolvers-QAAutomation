package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import questions.Prices;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompareValues implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        int ProductPhonePrice, ProductMonitorPrice,ProductLaptopPrice,TotalValueProducts;
        ProductPhonePrice = Prices.priceProductPhone().answeredBy(theActorInTheSpotlight());
        ProductMonitorPrice = Prices.priceProductMonitor().answeredBy(theActorInTheSpotlight());
        ProductLaptopPrice = Prices.priceProductLaptop().answeredBy(theActorInTheSpotlight());
        TotalValueProducts = ProductPhonePrice + ProductMonitorPrice + ProductLaptopPrice;
        System.out.println("********" + "\n"
                + "El valor del producto 1 es: " + ProductPhonePrice + "\n"
                + "El valor del producto 2 es: " + ProductMonitorPrice + "\n"
                + "El valor del producto 3 es: " + ProductLaptopPrice + "\n"
                + "El valor Total esperado de la compra es de: " + TotalValueProducts + "\n" + "*******"
        );
        System.out.println(
                "El Valor Total de la compra es :"
                        + Prices.priceTotal().answeredBy(theActorInTheSpotlight())
        );
    }
    public static CompareValues validatePrice(){
        return instrumented(CompareValues.class);

    }

}

