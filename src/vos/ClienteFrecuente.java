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


import java.util.List;

import org.codehaus.jackson.annotate.*;


public class ClienteFrecuente extends Cliente
{
	/**
	 * Atributo que contiene la contrasenia de este cliente.
	 */
	@JsonProperty(value="contrasenia")
	private String contrasenia;
	/**
	 * Atributo que contiene los productos pre seleccionados de este cliente.
	 */
	@JsonProperty(value = "productosPreSeleccionados")
	private List<Producto> preferencias;
	
	/**
	 * M�todo Constructor de la clase ClienteFrecuente.
	 * @param productosPreSeleccionados List<Producto> Lista de productos preseleccionados de este cliente.
	 * @param contrasenia String, contrase�a del cliente.
	 * @param id Long, ID del cliente.
	 * @param mesa Integer, n�mero de la mesa de este cliente.
	 * @param nombre String, nombre del cliente.
	 */
	public ClienteFrecuente(@JsonProperty(value = "productosPreSeleccionados")List<Producto> productosPreSeleccionados, @JsonProperty(value="contrasenia")String contrasenia,@JsonProperty(value="id")Long id, @JsonProperty(value = "mesa")Integer mesa, @JsonProperty(value = "nombre")String nombre)
	{
		super(id, mesa, nombre);
		this.contrasenia = contrasenia;
		this.preferencias = productosPreSeleccionados;
	}
	/**
	 * M�todo que obtiene la contrasenia de este cliente frecuente registrado.
	 * @return String, contrasenia de este cliente.
	 */
	public String getContrasenia()
	{
		return this.contrasenia;
	}
	/**
	 * M�todo que establece la contrasenia de este cliente frecuente.
	 * @param contrasenia String, nueva contrasenia de este cliente frecuente.
	 */
	public void setContrasenia(String contrasenia)
	{
		this.contrasenia = contrasenia;
	}
	/**
	 * M�todo que obtiene los productos pre seleccionados de este cliente frecuente.
	 * @return List<ProductoVos>, lista de productos pre seleccionados de este cliente.
	 */
	public List<Producto> getProductosPreSeleccionados()
	{
		return preferencias;
	}
	/**
	 * M�todo que establece la lista de productos pre seleccionados de este cliente frecuente.
	 * @param productosPreSeleccionados List<ProductoVos>, nueva lista de productos pre seleccionados de este cliente.
	 */
	public void setProductosPreSeleccionados(List<Producto> productosPreSeleccionados)
	{
		this.preferencias = productosPreSeleccionados;
	}
}
