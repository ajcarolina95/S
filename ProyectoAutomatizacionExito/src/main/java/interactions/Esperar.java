package interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.concurrent.TimeUnit;

import org.awaitility.Awaitility;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Esperar implements Interaction{
	
private int segundos;

	public Esperar(int segundos) {
		this.segundos = segundos;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		Awaitility.await().forever().pollInterval(segundos, TimeUnit.SECONDS);   
	}
	
	public static Esperar unMomento(int segundos) {
		return instrumented(Esperar.class, segundos);
	}

}
