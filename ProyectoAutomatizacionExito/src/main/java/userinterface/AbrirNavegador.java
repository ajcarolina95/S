package userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.exito.com")
public class AbrirNavegador extends PageObject {

	public static final Target MENU_TECNOLOGIA = Target.the("Menu - opci�n tecnolog�a")
			.located(By.xpath("//*[contains(text(), 'Tecnolog�a') and contains(@href,'/tecnologia')]"));
	
	public static final Target COMPUTADORES = Target.the("Menu - opci�n tecnolog�a")
			.located(By.xpath("//*[contains(text(), 'Computadores y accesorios')]"));

	

	// A[@href='/tecnologia'])[1]
	// a[text()= 'Computadores y accesorios']

}
