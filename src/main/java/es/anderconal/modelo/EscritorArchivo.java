package es.anderconal.modelo;

public class EscritorArchivo implements EscritorRegistro {

	public void escribir(String texto) {
		System.out.println("Escribir en archivo: " + texto);
	}

}
