package proyecto.screenplay.questions;

import proyecto.screenplay.ui.Formularioregistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElMensaje implements Question<String>{
	
	public static ElMensaje es() {
		
		return new ElMensaje();
	}
		

	@Override
	public String answeredBy(Actor actor) {
	
		return Text.of(Formularioregistro.MENSAJE_CONFIRM).viewedBy(actor).asString();
	}

	
	
	

}
