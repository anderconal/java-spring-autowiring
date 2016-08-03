package es.anderconal.modelo;

public class Registrador {
	private EscritorRegistro escritorConsola;
	private EscritorRegistro escritorArchivo;
	
	public void setEscritorConsola(EscritorRegistro escritor) {
		this.escritorConsola = escritor;
	}
	
	public void setEscritorArchivo(EscritorRegistro escritorDeArchivo) {
		this.escritorArchivo = escritorDeArchivo;
	}
	
	public void escribirArchivo(String texto) {
		escritorArchivo.escribir(texto);
	}
	
	public void escribirConsola(String texto) {
		escritorConsola.escribir(texto);
	}
}
