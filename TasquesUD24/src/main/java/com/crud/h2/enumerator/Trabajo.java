/**
 * 
 */
package com.crud.h2.enumerator;

/**
 * @author Víctor Lozano
 *
 */
public enum Trabajo {
	PROGRAMADOR("Programador", 1000), DIRECTOR("Director", 1500), RECURSOS_HUMANOS("Recursos humanos", 2000);

	private String trabajo;
	private int salario;

	private Trabajo(String string, int i) {
		this.trabajo = string;
		this.salario = i;
	}

	/**
	 * @return the trabajo
	 */
	public String getTrabajo() {
		return trabajo;
	}

	/**
	 * @return the salario
	 */
	public int getSalario() {
		return salario;
	}
	

}
