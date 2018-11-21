package proyecto.screenplay.tasks;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import java.util.List;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import proyecto.screenplay.Model.DatosVuelo;
import proyecto.screenplay.exceptions.PaginaNoCargaException;
import proyecto.screenplay.ui.LoginPage;

public class Ingresar implements Task {
	
	private List<DatosVuelo> datos2;
	private LoginPage loginPage;
		
	public Ingresar(List<DatosVuelo> datos2) {
		super();
		this.datos2 = datos2;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(datos2.get(0).getUserName2()).into(loginPage.USERNAME2));
		actor.attemptsTo(Enter.theValue(datos2.get(0).getPassword2()).into(loginPage.USPASSWORD2));
		actor.attemptsTo(Click.on(loginPage.BUTTONINGRESAR));	
		
		actor.should(seeThat(the(loginPage.DETAILS),isVisible())
		    .orComplainWith(PaginaNoCargaException.class, "Autenticacion fallida"));		    
		    
	}
	
	public static Ingresar alapagina(List<DatosVuelo> datos) {
		return Tasks.instrumented(Ingresar.class, datos);
	}
}
