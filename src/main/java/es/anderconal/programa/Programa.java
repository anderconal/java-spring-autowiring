package es.anderconal.programa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.anderconal.modelo.Registrador;

public class Programa {

	public static void main(String[] args) {
		ApplicationContext contexto = new ClassPathXmlApplicationContext("es/anderconal/bean/beans.xml");
		
		Registrador registrador = (Registrador) contexto.getBean("registrador");
		
		registrador.escribirConsola("Hola");
		registrador.escribirArchivo("Hola de nuevo");
		
		((ClassPathXmlApplicationContext)contexto).close();
	}

}
