package com.crud.h2.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="empleado")//en caso que la tabala sea diferente
public class Empleado {

	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Integer id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "apellido")//no hace falta si se llama igual
	private String apellido;
	@Column(name = "trabajo")//no hace falta si se llama igual
	private String trabajo;
	@Column(name = "salario")//no hace falta si se llama igual
	private Integer salario;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	//Constructores
	
	public Empleado() {
	
	}

	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param trabajo
	 * @param salario
	 * @param fecha
	 */
	public Empleado(Integer id, String nombre, String apellido, String trabajo, Integer salario, Date fecha) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.trabajo = trabajo;
		this.salario = salario;
		this.fecha = fecha;
	}

	
	//Getters y Setters
	
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the trabajo
	 */
	public String getTrabajo() {
		return trabajo;
	}

	/**
	 * @param trabajo the trabajo to set
	 */
	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
		}
	

	/**
	 * @return the salario
	 */
	public int getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + trabajo
				+ ", dni=" + salario + ", fecha=" + fecha + "]";
	}

	
	
}
