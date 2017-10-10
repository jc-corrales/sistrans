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

public class ListaProductosVos
{
	/**
	 * Atributo que contiene los productos.
	 */
	@JsonProperty(value = "productos")
	private List<Producto> productos;
	/**
	 * M�todo constructor de la clase ListaProductosVos
	 * @param productos
	 */
	public ListaProductosVos(@JsonProperty(value = "productos") List<Producto> productos)
	{
		this.productos = productos;
	}
	/**
	 * M�todo para obtener los productos.
	 * @return List<ProductoVos>, lista de productos.
	 */
	public List<Producto> getProductos()
	{
		return this.productos;
	}
	/**
	 * M�todo que establece la lista de productos.
	 * @param productos List<ProductoVos>, nueva lista de productos.
	 */
	public void setProductos(List<Producto> productos)
	{
		this.productos = productos;
	}
}