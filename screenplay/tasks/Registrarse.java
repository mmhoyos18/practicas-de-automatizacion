package proyecto.screenplay.tasks;

import java.util.List;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import proyecto.screenplay.Model.Datos;
import proyecto.screenplay.ui.Formularioregistro;

public class Registrarse implements Task{
	
	List<Datos> datos;
	Formularioregistro formularioregistro;

	public Registrarse(List<Datos> datos) {
		this.datos = datos;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(formularioregistro.SELECCIONAR_REGISTRAR));	
		actor.attemptsTo(Enter.theValue(datos.get(0).getFirstName()).into(formularioregistro.FIRSTNAME));
		actor.attemptsTo(Enter.theValue(datos.get(0).getLastName()).into(formularioregistro.LASTNAME));
		actor.attemptsTo(Enter.theValue(datos.get(0).getPhone()).into(formularioregistro.PHONE));
		actor.attemptsTo(Enter.theValue(datos.get(0).getEmail()).into(formularioregistro.EMAIL));
		actor.attemptsTo(Enter.theValue(datos.get(0).getAddress()).into(formularioregistro.ADDRESS));
		actor.attemptsTo(Enter.theValue(datos.get(0).getCity()).into(formularioregistro.CITY));
		actor.attemptsTo(Click.on(formularioregistro.COUNTRY));
		actor.attemptsTo(Enter.theValue(datos.get(0).getUserName()).into(formularioregistro.USERNAME));
		actor.attemptsTo(Enter.theValue(datos.get(0).getPassword()).into(formularioregistro.PASSWORD));
		actor.attemptsTo(Enter.theValue(datos.get(0).getConfirmPassword()).into(formularioregistro.COMFIRM_PASSWORD));
		actor.attemptsTo(Click.on(formularioregistro.BOTON_SUBMIT));
		
	}
	
	public static Registrarse enlapagina(List<Datos> datos) {
		return Tasks.instrumented(Registrarse.class, datos);
	}



}
