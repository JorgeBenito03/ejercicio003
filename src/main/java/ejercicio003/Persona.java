package ejercicio003;

import java.util.ArrayList;
import java.util.List;

public class Persona {

	public String devuelveNombre(List<String>lista) {
		String nombre;
		int posicion=(int) Math.floor(Math.random()*lista.size());
		nombre= lista.get(posicion);
		return nombre;
		
	}
	
	public List<String>devuelveNombres(List<String>lista,int numero){
		String nombre;
		List<String>listaNombresObtenidos= new ArrayList<>();
		for(int i= numero;i>0;i--) {
		int posicion=(int) Math.floor(Math.random()*lista.size());
		nombre= lista.get(posicion);
		listaNombresObtenidos.add(nombre);
		lista.remove(posicion);
		
		}
		return listaNombresObtenidos;
	}
	
}
