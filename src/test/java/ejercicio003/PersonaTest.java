package ejercicio003;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
	List<String> listaNombres = new ArrayList<>();
	
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		listaNombres.add("Jorge");
		listaNombres.add("Adrian");
		listaNombres.add("Lau");
		listaNombres.add("Juan");
		listaNombres.add("Angela");
	}

	@Test
	void testDevuelveNombre() {
		String nombre;
		int posicion=(int) Math.floor(Math.random()*listaNombres.size());
		nombre= listaNombres.get(posicion);
		nombre= listaNombres.get(posicion);
	}

	@Test
	void testDevuelveNombres() {
		String nombre;
		List<String>listaNombresObtenidos= new ArrayList<>();
		for(int i= 3;i>0;i--) {
		int posicion=(int) Math.floor(Math.random()*listaNombres.size());
		nombre= listaNombres.get(posicion);
		if(listaNombresObtenidos.contains(nombre)) {
			i++;
		}else {
			listaNombresObtenidos.add(nombre);
		}
		}
		listaNombres.add("Marisa");
	}

}
