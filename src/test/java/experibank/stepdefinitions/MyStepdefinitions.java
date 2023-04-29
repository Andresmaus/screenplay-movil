package experibank.stepdefinitions;

import cucumber.api.java.*;
import cucumber.api.java.en.*;
import experibank.models.DatosExperiBank;
import experibank.questions.Validar;
import experibank.tasks.AbreLaApp;
import experibank.tasks.Ingresar;
import io.cucumber.datatable.DataTable;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class MyStepdefinitions {
    @Before
    public void iniciar(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Andres ingresa a la apk erikbank$")
    public void andresIngresaALaApkErikbank() {
        OnStage.theActorCalled("andres").wasAbleTo(AbreLaApp.experiBank());
    }

    @When("^Digita las credenciales de acceso$")
    public void digitaLasCredencialesDeAcceso(DataTable datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.credenciales(DatosExperiBank.setTablaDatos(datos).get(0)));
    }

    @Then("^verifica que ingreso correctamente$")
    public void verificaQueIngresoCorrectamente() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.ingreso(), Matchers.equalTo("x")));
    }
}
