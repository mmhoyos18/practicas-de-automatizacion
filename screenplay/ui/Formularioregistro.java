package proyecto.screenplay.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl ("http://newtours.demoaut.com/mercurysignon.php")
public class Formularioregistro extends PageObject{
	
	public static final Target SELECCIONAR_REGISTRAR = Target.the("SELECCIONA LA OPCION REGISTRAR")
			.located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
	public static final Target FIRSTNAME= Target.the("Ingresar nombre")
			.located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
	public static final Target LASTNAME= Target.the("Ingresar apellido")
			.located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input"));
	public static final Target PHONE = Target.the("Ingresar telefono")
			.located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input"));
	public static final Target EMAIL = Target.the("Ingresar correo").located(By.xpath("//*[@id=\'userName\']"));
	public static final Target ADDRESS = Target.the("Ingresar dirección")
			.located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input"));
	public static final Target CITY = Target.the("Ingresar ciudad")
			.located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input"));
	public static final Target COUNTRY = Target.the("Ingresar ciudad")
			.located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select/option[52]"));
	public static final Target USERNAME = Target.the("Ingresar ciudad")
			.located(By.xpath("//*[@id=\'email\']"));
	public static final Target PASSWORD = Target.the("Ingresar ciudad")
			.located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input"));
	public static final Target COMFIRM_PASSWORD = Target.the("Ingresar ciudad")
			.located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input"));
	public static final Target BOTON_SUBMIT = Target.the("Seleccionar boton enviar")
			.located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input"));
	public static final Target MENSAJE_CONFIRM = Target.the("Seleccionar boton enviar")
			.located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b"));
}

