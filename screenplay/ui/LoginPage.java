package proyecto.screenplay.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject{
	public static final Target USERNAME2 = Target.the("Ingresar usuario").located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input"));
	public static final Target USPASSWORD2 = Target.the("Ingresar contraseña").located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
	public static final Target BUTTONINGRESAR = Target.the("Boton Ingresar").located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input"));
	public static final Target DETAILS = Target.the(" verificar ingreso a la pagina").located(By.xpath("//table/tbody/tr/td/form/table/tbody/tr/td/b/font[@face='Arial, Helvetica, sans-serif']/input[@value='oneway']"));
	
}
