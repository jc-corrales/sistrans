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

public class ListaOrdenesVos
{
	/**
	 * Atributo que contiene los productos.
	 */
	@JsonProperty(value = "ordenes")
	private List<Orden> ordenes;
	/**
	 * M�todo constructor de la clase ListaProductosVos
	 * @param productos
	 */
	public ListaOrdenesVos(@JsonProperty(value = "ordenes") List<Orden> ordenes)
	{
		this.ordenes = ordenes;
	}
	/**
	 * M�todo para obtener los productos.
	 * @return List<OrdenVos>, lista de productos.
	 */
	public List<Orden> getOrdenes()
	{
		return this.ordenes;
	}
	/**
	 * M�todo que establece la lista de productos.
	 * @param productos List<OrdenVos>, nueva lista de productos.
	 */
	public void setOrdenes(List<Orden> ordenes)
	{
		this.ordenes = ordenes;
	}
}