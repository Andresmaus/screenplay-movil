package experibank.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static experibank.ui.ContenedorLogin.*;

public class ValidarSesion implements Question {
    public static ValidarSesion ingresoFallido() {
        return new ValidarSesion();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(LBL_USUARIO_INVALIDO).viewedBy(actor).asString();
    }

}

