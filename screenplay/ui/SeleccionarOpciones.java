package proyecto.screenplay.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarOpciones extends PageObject {
	public static final Target TYPE = Target.the("SELECCIONA EL TIPO")			
			.located(By.name("tripType"));
	
	public static final Target TYPE_ONE = Target.the("Seleciona One Way")
			.located(By.xpath("//table/tbody/tr/td/form/table/tbody/tr/td/b/font[@face='Arial, Helvetica, sans-serif']/input[@value='oneway']"));
	public static final Target TYPE_ROUND = Target.the("Seleciona Round ")
			.located(By.xpath("//table/tbody/tr/td/form/table/tbody/tr/td/b/font[@face='Arial, Helvetica, sans-serif']/input[@value='roundtrip']"));
	public static final Target PASSENGERS = Target.the("Seleciona Pasajeros")
			.located(By.name("passCount"));
	public static final Target DEPARTING = Target.the("Seleciona Salida Departamento")
			.located(By.name("fromPort"));
	public static final Target ONMONTH = Target.the("Seleciona mes")
			.located(By.name("fromMonth"));
	public static final Target ONDAY = Target.the("Seleciona dia")
			.located(By.name("fromDay"));
	public static final Target ARRIVINGIN = Target.the("Selecionar destino")
			.located(By.name("toPort"));
	public static final Target RETURNINGMONTH = Target.the("Seleciona mes regreso")
			.located(By.name("toMonth"));
	public static final Target RETURNINGDAY = Target.the("Seleciona dia regreso")
			.located(By.name("toDay"));
	public static final Target SERVICECLASS1 = Target.the("Seleciona clase del servicio")
			.located(By.xpath("//INPUT[contains(@value, 'Business')]"));	
	public static final Target SERVICECLASS2 = Target.the("Seleciona clase del servicio")
			.located(By.xpath("//INPUT[contains(@value, 'Economy class')]")); 
	public static final Target SERVICECLASS3 = Target.the("Seleciona clase del servicio")
			.located(By.xpath("//INPUT[contains(@value, 'First')]"));
	public static final Target AIRLINE = Target.the("Seleciona la aerolinea")
			.located(By.name("airline"));
	public static final Target BTNCONTINUAR = Target.the("Clic boton continuar")
			.located(By.name("findFlights"));
	public static final Target OUTFLIGHT = Target.the("Los vuelos de ")
			.located(By.name("outFlight"));	
	public static final Target INFLIGHT = Target.the("Los inflight")
			.located(By.name("inFlight"));	
	public static final Target BTNCONTINUAR2 = Target.the("Clic boton continuar")
			.located(By.name("reserveFlights"));

}
