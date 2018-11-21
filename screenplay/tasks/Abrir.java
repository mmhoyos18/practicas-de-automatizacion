package proyecto.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import proyecto.screenplay.exceptions.PaginaNoCargaException;
import proyecto.screenplay.ui.Formularioregistro;

public class Abrir implements Task {
	
	private Formularioregistro formularioregistro;

	@Override
	public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(Open.browserOn(formularioregistro));
			
			actor.should(seeThat(the(formularioregistro.SELECCIONAR_REGISTRAR), isVisible()).
					orComplainWith(PaginaNoCargaException.class, "La pagina no cargo"));
	}
	
	public static Abrir sunavegador() {
		return 	Tasks.instrumented(Abrir.class);
	}
}
