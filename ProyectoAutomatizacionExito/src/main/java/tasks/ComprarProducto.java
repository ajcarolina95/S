package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.SeleccionarProducto.ANNADIR_AL_CARRITO;
import static userinterface.SeleccionarProducto.CHB_SISTEMA_OPERATIVO;
import static userinterface.SeleccionarProducto.COMPUTADORES;
import static userinterface.SeleccionarProducto.INICIO;
import static userinterface.SeleccionarProducto.IR_AL_CARRITO;
import static userinterface.SeleccionarProducto.LBL_FILTRO_SISTEMA_OPERATIVO;
import static userinterface.SeleccionarProducto.LBL_RESULTADO_PRODUCTO;
import static userinterface.SeleccionarProducto.LBL_X;
import static userinterface.SeleccionarProducto.MENSAJE_AGREGADO;
import static userinterface.SeleccionarProducto.MENU_TECNOLOGIA;
import static userinterface.SeleccionarProducto.PORTATILES;
import static userinterface.SeleccionarProducto.PRODUCTO;

import interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class ComprarProducto implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		 actor.attemptsTo(
				 WaitUntil.the(MENU_TECNOLOGIA, isVisible()).forNoMoreThan(10).seconds(),
				 Click.on(MENU_TECNOLOGIA),
				 WaitUntil.the(COMPUTADORES, isVisible()).forNoMoreThan(30).seconds(),
				 Scroll.to(COMPUTADORES),
				 Click.on(COMPUTADORES),
				 WaitUntil.the(PORTATILES, isVisible()).forNoMoreThan(30).seconds(),
				 Click.on(PORTATILES),
				 WaitUntil.the(LBL_FILTRO_SISTEMA_OPERATIVO, isVisible()).forNoMoreThan(30).seconds(),
				 Scroll.to(LBL_FILTRO_SISTEMA_OPERATIVO),
				 Click.on(CHB_SISTEMA_OPERATIVO),
				 WaitUntil.the(PRODUCTO, isVisible()).forNoMoreThan(30).seconds(),
				 Click.on(PRODUCTO),
				 WaitUntil.the(LBL_RESULTADO_PRODUCTO, isVisible()).forNoMoreThan(30).seconds(),
				 Scroll.to(LBL_RESULTADO_PRODUCTO),
				 Click.on(ANNADIR_AL_CARRITO),
				 WaitUntil.the(MENSAJE_AGREGADO, isVisible()).forNoMoreThan(30).seconds(),
				// Scroll.to(LBL_X),
				 Scroll.to(INICIO),
				 Esperar.unMomento(10),
				 MoveMouse.to(IR_AL_CARRITO),
				 WaitUntil.the(IR_AL_CARRITO, isVisible()).forNoMoreThan(30).seconds(),
				 Click.on(IR_AL_CARRITO)
				 //Scroll.to(INICIO),
				 // WaitUntil.the(IR_AL_CARRITO, isVisible()).forNoMoreThan(30).seconds(),
				 //Click.on(IR_AL_CARRITO)
				 /* 
				 Scroll.to(INICIO),
				 WaitUntil.the(CARRITO, isVisible()).forNoMoreThan(30).seconds(),
				 // Scroll.to(CARRITO),
				 Click.on(CARRITO)
				 */
				
				
				 );		 
	}
	
	public static ComprarProducto delExito() {
		return instrumented(ComprarProducto.class);
	}

}
