package proyecto.screenplay.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ReservaPage extends PageObject {
	
	public static final Target NAME_PASSAGER1 = Target.the("Ingresar nombre del pasajero 1")
			.located(By.name("passFirst0"));	
	public static final Target LASTNAME_PASSAGER1 = Target.the("Ingresar apellido del pasajero 1")
			.located(By.name("passLast0"));
	public static final Target NAME_PASSAGER2 = Target.the("Ingresar nombre del pasajero 2")
			.located(By.name("passFirst1"));	
	public static final Target LASTNAME_PASSAGER2 = Target.the("Ingresar apellido del pasajero 2")	
			.located(By.name("passLast1"));	
	public static final Target CREDITCARD = Target.the("seleccionar tarjeta de credito")
			.located(By.name("creditCard"));	
	public static final Target NUM_CREDITCARD = Target.the("Ingresar numero de tarjeta de credito")
			.located(By.name("creditnumber"));
	public static final Target COMPRAR_VUELO = Target.the("seleccionar el boton comprar vuelo")
			.located(By.name("buyFlights"));
	public static final Target COMFIRMA_RESERVA = Target.the("Mensaje confirmación de la reserva")
			.located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]"));
	

}
