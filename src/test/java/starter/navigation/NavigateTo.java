package starter.pages;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theLoginPage() {
        return Task.where("{0} opens the OreangeHRM home page",
                Open.browserOn().the(LoginPage.class));

    }
}
