package es.anderconal.modelo;

public class EscritorConsola implements EscritorRegistro {

	public void escribir(String texto) {
		System.out.println(texto);
	}

}
