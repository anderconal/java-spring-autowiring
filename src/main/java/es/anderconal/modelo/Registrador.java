package es.anderconal.modelo;

public class Registrador {
	private EscritorArchivo escritorArchivo;
	private EscritorConsola escritorConsola;
	
	public void setEscritorArchivo(EscritorArchivo escritorArchivo) {
		this.escritorArchivo = escritorArchivo;
	}
	
	public void setEscritorConsola(EscritorConsola escritorConsola) {
		this.escritorConsola = escritorConsola;
	}
	
	public void escribirArchivo(String texto) {
		escritorArchivo.escribir(texto);
	}
	
	public void escribirConsola(String texto) {
		escritorConsola.escribir(texto);
	}
}
