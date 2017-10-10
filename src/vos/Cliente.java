/**-------------------------------------------------------------------
 * $Id$
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 *
 * Materia: Sistemas Transaccionales
 * Ejercicio: RotondAndes
 * Autor: Juan Carlos Corrales - jc.corrales@uniandes.edu.co
 * -------------------------------------------------------------------
 */
package vos;


import org.codehaus.jackson.annotate.*;

public class Cliente
{
	/**
	 * Id del Cliente.
	 */
	@JsonProperty(value="id")
	private Long id;
	/**
	 * Mesa asignada del cliente;
	 */
	@JsonProperty(value = "mesa")
	private Integer mesa;
	/**
	 * Nombre del cliente.
	 */
	@JsonProperty(value = "nombre")
	private String nombre;

	
	
	/**
	 * M�todo constructor de la clase ClienteVos.
	 * @param id
	 * @param mesa
	 * @param nombre
	 */
	public Cliente(@JsonProperty(value="id")Long id, 
			@JsonProperty(value = "mesa")Integer mesa, 
			@JsonProperty(value = "nombre")String nombre)
	{
		this.id = id;
		this.mesa = mesa;
		this.nombre = nombre;
	}
	/**
	 * M�todo que obtiene el ID de este cliente-
	 * @return Long, ID del cliente.
	 */
	public Long getId()
	{
		return this.id;
	}
	/**
	 * M�todo que establece la ID de este cliente.
	 * @param id Long, ID del cliente.
	 */
	public void setId(Long id)
	{
		this.id = id;
	}
	/**
	 * M�todo que obtiene la mesa asignada a este cliente.
	 * @return String, mesa del cliente.
	 */
	public Integer getMesa()
	{
		return this.mesa;
	}
	/**
	 * M�todo que establece la mesa de este cliente.
	 * @param mesa
	 */
	public void setMesa(Integer mesa)
	{
		this.mesa = mesa;
	}
	/**
	 * M�todo que obtiene el nombre de este cliente.
	 * @return String, nombre del cliente.
	 */
	public String getNombre()
	{
		return this.nombre;
	}
	/**
	 * M�todo que establece el nombre de este cliente.
	 * @param nombre String, nuevo nombre del cliente.
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}


}
