package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Home {
    public static final Target PHONE = Target.the("phone").
            locatedBy("//a[normalize-space()='Iphone 6 32gb']");
    public static final Target NEXTPAGEBTN = Target.the("NextPageBtn").
            locatedBy("//button[@value='9']");
    public static final Target MONITOR = Target.the("monitor").
            locatedBy("//a[normalize-space()='ASUS Full HD']");
    public static final Target LAPTOP = Target.the("laptop").
            locatedBy("//a[normalize-space()='MacBook Pro']");
}


