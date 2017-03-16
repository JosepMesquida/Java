package org.foobarspam.figurasgeometricas.figuras;

import java.util.ArrayList;

public class Drawables {
	
	public static void dibujarDrawables(ArrayList<Drawable> lista){
		
		for(Drawable elemento: lista){
			elemento.draw();
		}
		
	}


	
}