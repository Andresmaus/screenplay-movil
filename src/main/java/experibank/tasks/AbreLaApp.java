package experibank.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.logging.Logger;


public class AbreLaApp implements Task {

    public AbreLaApp(){  }

    public static AbreLaApp experiBank(){
        return Tasks.instrumented(AbreLaApp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Logger.getAnonymousLogger().info("Se abre app ExperiBank");
    }
}