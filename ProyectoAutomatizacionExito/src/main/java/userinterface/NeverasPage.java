package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NeverasPage {

    public static final Target NO_FROST = Target.the("No Frost").located(By.xpath("//label[contains(text(),'No Frost')]")),
                               TIPO_EUROPEO = Target.the("Tipo Europeo").located(By.xpath("//label[contains(text(),'Tipo Europeo')]")),
                               SAMSUNG = Target.the("SAMSUNG").located(By.xpath("//label[contains(text(),'SAMSUNG')]")),
                               NEVECON = Target.the("Nevecon").located(By.xpath("//span[contains(text(),'Nevecon samsung family hub 700 litros black edition')]"));

}
