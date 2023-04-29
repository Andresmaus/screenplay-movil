package experibank.tasks;

import com.choucair.moviles.app.interactions.choucair.TakeScreenshot;
import com.choucair.moviles.app.interactions.choucair.builders.Tap;
import experibank.models.DatosExperiBank;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static experibank.ui.ContenedorLogin.*;

public class Ingresar implements Task {
    private DatosExperiBank datosExperiBank;

    public Ingresar(DatosExperiBank datosExperiBank) {
        this.datosExperiBank = datosExperiBank;
    }
    public static Ingresar credenciales(DatosExperiBank datosExperiBank) {
        return Tasks.instrumented(Ingresar.class, datosExperiBank);
    }

    @Override
    public <T extends Actor> void performAs(T andres) {
        andres.attemptsTo(
                //Tap.on(BTN_POPUP_ERIBANK),
                Enter.theValue("datosExperiBank.getUsuario()").into(TXT_USUARIO),
                TakeScreenshot.asEvidence(),
                Enter.theValue("datosExperiBank.getClave()").into(TXT_CLAVE),
                TakeScreenshot.asEvidence(),
                Tap.on(BTN_LOGIN_APP));
    }
}
