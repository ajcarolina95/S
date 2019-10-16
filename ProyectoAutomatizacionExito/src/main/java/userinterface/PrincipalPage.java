package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.omg.IOP.TAG_RMI_CUSTOM_MAX_STREAM_FORMAT;
import org.openqa.selenium.By;

public class PrincipalPage {

    public static final Target ELECTRODOMESTICOS = Target.the("Electrodomesticos").located(By.xpath("//a[contains(text(),'Electrodomésticos')]"));
}
