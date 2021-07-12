package ejercicio003;

import java.util.List;

public class Persona {

	
	public String devuelveNombre(List<String>lista) {
		String nombre;
		int posicion=(int) Math.floor(Math.random()*lista.size());
		nombre= lista.get(posicion);
		return nombre;
		
	}
	
	
}
