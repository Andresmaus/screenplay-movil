package experibank.tasks;

import com.choucair.moviles.app.interactions.choucair.TakeScreenshot;
import com.choucair.moviles.app.interactions.choucair.builders.Tap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static experibank.ui.ContenedorLogin.BTN_CERRAR_SESION;

public class Cerrar implements Task {
    public static Cerrar sesion() {
        return Tasks.instrumented(Cerrar.class);
    }

    @Override
    public <T extends Actor> void performAs(T andres) {
        andres.attemptsTo(Tap.on(BTN_CERRAR_SESION),
                TakeScreenshot.asEvidence());
    }
}
