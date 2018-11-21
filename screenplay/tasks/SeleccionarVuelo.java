package proyecto.screenplay.tasks;

import java.util.List;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;
import proyecto.screenplay.Model.Datos;
import proyecto.screenplay.Model.DatosVuelo;
import proyecto.screenplay.interactions.SeleccionarItinerario;
import proyecto.screenplay.ui.SeleccionarOpciones;

public class SeleccionarVuelo implements Task {
	
	private List<DatosVuelo> datos;
	private SeleccionarOpciones seleccionaropciones;

	public SeleccionarVuelo(List<DatosVuelo> datos) {
		super();
		this.datos = datos;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Check.whether(datos.get(0).getType().equals("oneway")).
                andIfSo(Click.on(seleccionaropciones.TYPE_ONE)));
		actor.attemptsTo(Check.whether(datos.get(0).getType().equals("roundtrip")).
               andIfSo(Click.on(seleccionaropciones.TYPE_ROUND)));
		actor.attemptsTo(SelectFromOptions.byVisibleText("2").from(seleccionaropciones.PASSENGERS));
		actor.attemptsTo(SelectFromOptions.byVisibleText(datos.get(0).getDepartingFrom()).from(seleccionaropciones.DEPARTING));
		actor.attemptsTo(SelectFromOptions.byVisibleText(datos.get(0).getOnMonth()).from(seleccionaropciones.ONMONTH));
		actor.attemptsTo(SelectFromOptions.byVisibleText(datos.get(0).getOnDay()).from(seleccionaropciones.ONDAY));
		actor.attemptsTo(SelectFromOptions.byVisibleText(datos.get(0).getArrivingIn()).from(seleccionaropciones.ARRIVINGIN));
		actor.attemptsTo(SelectFromOptions.byVisibleText(datos.get(0).getReturningMonth()).from(seleccionaropciones.RETURNINGMONTH));
		actor.attemptsTo(SelectFromOptions.byVisibleText(datos.get(0).getReturningDay()).from(seleccionaropciones.RETURNINGDAY));
		actor.attemptsTo(Check.whether(datos.get(0).getServiceClass().equals("Business")).
                andIfSo(Click.on(seleccionaropciones.SERVICECLASS1)).otherwise());
		actor.attemptsTo(Check.whether(datos.get(0).getServiceClass().equals("Economy class")).
                andIfSo(Click.on(seleccionaropciones.SERVICECLASS2)).otherwise());
		actor.attemptsTo(Check.whether(datos.get(0).getServiceClass().equals("First")).
                andIfSo(Click.on(seleccionaropciones.SERVICECLASS3)).otherwise());
		actor.attemptsTo(SelectFromOptions.byVisibleText(datos.get(0).getAirline()).from(seleccionaropciones.AIRLINE));
		actor.attemptsTo(Click.on(seleccionaropciones.BTNCONTINUAR));		
		actor.attemptsTo(SeleccionarItinerario.conVuelo(seleccionaropciones.OUTFLIGHT, datos.get(0).getDepartFly()));
		actor.attemptsTo(SeleccionarItinerario.conVuelo(seleccionaropciones.INFLIGHT, datos.get(0).getReturnFly()));
		actor.attemptsTo(Click.on(seleccionaropciones.BTNCONTINUAR2));
		
	}
	
	public static SeleccionarVuelo opciones(List<DatosVuelo> depreferencia) {
		return Tasks.instrumented(SeleccionarVuelo.class, depreferencia);
	}

}
