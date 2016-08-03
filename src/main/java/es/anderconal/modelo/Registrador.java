package es.anderconal.modelo;

public class Registrador {
	private EscritorConsola escritorConsola;
	private EscritorArchivo escritorArchivo;
	
	public void setEscritorConsola(EscritorConsola escritor) {
		this.escritorConsola = escritor;
	}
	
	public void setEscritorArchivo(EscritorArchivo escritorDeArchivo) {
		this.escritorArchivo = escritorDeArchivo;
	}
	
	public void escribirArchivo(String texto) {
		escritorArchivo.escribir(texto);
	}
	
	public void escribirConsola(String texto) {
		escritorConsola.escribir(texto);
	}
}
