package experibank.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static experibank.ui.ContenedorLogin.*;

public class Validar implements Question {
    public static Validar ingreso() {
        return new Validar();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(LBL_SALDO_CUENTA).viewedBy(actor).asString();
    }
}
