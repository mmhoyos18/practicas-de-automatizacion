package proyecto.screenplay.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarItinerario implements Interaction{

	private String vuelo;
	private Target opciones;
		
	public SeleccionarItinerario(Target opciones, String vuelo) {
		this.vuelo = vuelo;
		this.opciones=opciones;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
	
		for (int i = 0; i < opciones.resolveAllFor(actor).size(); i++) {
			
			if(opciones.resolveAllFor(actor).get(i).getValue().replaceAll("\\$", " ").contains(vuelo)) {
				opciones.resolveAllFor(actor).get(i).click();
				break;
			}
			
		}
		
	}
	
	public static SeleccionarItinerario conVuelo(Target opciones, String vuelo)
	{
		return Tasks.instrumented(SeleccionarItinerario.class,opciones, vuelo);
	}

}
