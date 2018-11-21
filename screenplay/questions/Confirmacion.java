package proyecto.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import proyecto.screenplay.ui.Formularioregistro;
import proyecto.screenplay.ui.ReservaPage;

public class Confirmacion implements Question<String>{
	
	public static Confirmacion reserva() {
		// TODO Auto-generated method stub
		return new Confirmacion();
	}

	@Override
	public String answeredBy(Actor actor) {
	
		return Text.of(ReservaPage.COMFIRMA_RESERVA).viewedBy(actor).asString();
	}

	

	
}
