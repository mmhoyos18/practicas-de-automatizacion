package proyecto.screenplay.tasks;

import java.util.List;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import proyecto.screenplay.Model.DatosReserva;
import proyecto.screenplay.ui.ReservaPage;

public class ReservaVuelo implements Task{
	
	private List<DatosReserva> losdatos;
	private ReservaPage reservaPage;
	
	public ReservaVuelo (List<DatosReserva> losdatos) {
		super();
		this.losdatos = losdatos;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(losdatos.get(0).getPassenger1FirstName()).into(reservaPage.NAME_PASSAGER1));
		actor.attemptsTo(Enter.theValue(losdatos.get(0).getPassenger1LastName()).into(reservaPage.LASTNAME_PASSAGER1));
		actor.attemptsTo(Enter.theValue(losdatos.get(0).getPassenger2FirstName()).into(reservaPage.NAME_PASSAGER2));
		actor.attemptsTo(Enter.theValue(losdatos.get(0).getPassenger2LastName()).into(reservaPage.LASTNAME_PASSAGER2));
		actor.attemptsTo(SelectFromOptions.byVisibleText(losdatos.get(0).getCreditCardType()).from(reservaPage.CREDITCARD));
		actor.attemptsTo(Enter.theValue(losdatos.get(0).getNumberCreditCard()).into(reservaPage.NUM_CREDITCARD));
		actor.attemptsTo(Click.on(reservaPage.COMPRAR_VUELO));			
	}
	
	public static ReservaVuelo ingresa(List<DatosReserva> losdatos2) {
		return Tasks.instrumented(ReservaVuelo.class, losdatos2);
	}
	
	
	

}
