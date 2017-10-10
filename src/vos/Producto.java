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


public class Producto extends ProductoBase
{
	

	/**
	 * Costo de Producci�del producto.
	 */
	@JsonProperty(value="costoDeProduccion")
	private Double costoDeProduccion;
	/**
	 * Descripcion en espa�ol del producto.
	 */
	@JsonProperty(value = "descripcionEspaniol")
	private String descripcionEspaniol;
	
	/**
	 * Descripcion en Ingl�s del producto.
	 */
	@JsonProperty(value = "descripcionIngles")
	private String descripcionIngles;
	/**
	 * Atributo que contiene los IDs de los productos equivalentes.
	 */
	@JsonProperty(value = "productosEquivalentes")
	private List<ProductoBase> productosEquivalentes;
	/**
	 * Atributo que contiene el precio.
	 */
	@JsonProperty(value = "precio")
	private Double precio;
	/**
	 * Atributo que contiene los tipos de comida.
	 */
	@JsonProperty(value = "tiposComida")
	private List<TipoComida> tiposComida;
	
	/**
	 * M�todo constructor de la clase Producto.
	 * @param id
	 * @param nombre
	 * @param costoDeProduccion
	 * @param descripcionEspaniol
	 * @param descripcionIngles
	 * @param idProductosEquivalentes
	 * @param precio
	 * @param tiposComida
	 */
	
	public Producto() {
		super();
	}
	
	public Producto(Long id, String nombre, Double costoDeProduccion,String descripcionEspaniol, String descripcionIngles, List<ProductoBase> productosEquivalentes, Double precio, List<TipoComida> tiposComida){
		super(id, nombre);
		this.costoDeProduccion = costoDeProduccion;
		this.descripcionEspaniol = descripcionEspaniol;
		this.descripcionIngles = descripcionIngles;
		this.productosEquivalentes = productosEquivalentes;
		this.precio = precio;
		this.tiposComida = tiposComida;
		
	}
	


	/**
	 * M�todo que obtiene el costo de producci�n.
	 * @return Double, Costo de producci�n de este Producto.
	 */
	public Double getCostoDeProduccion()
	{
		return this.costoDeProduccion;
	}
	/**
	 * M�todo que establece el costo de producci�n de este producto.
	 * @param costoDeProduccion Double, Nuevo costo de producci�n.
	 */
	public void setCostoDeProduccion(Double costoDeProduccion)
	{
		this.costoDeProduccion = costoDeProduccion;
	}
	/**
	 * M�todo que obtiene la descripci�n de este producto en espa�ol.
	 * @return String, descripci�n del producto en espa�ol.
	 */
	public String getDescripcionEspaniol()
	{
		return this.descripcionEspaniol;
	}
	/**
	 * M�todo que establece la descripci�n de este producto en espa�ol.
	 * @param descripcionEspaniol String, Nueva descripci�n del producto en espa�ol.
	 */
	public void setDescripcionEspaniol(String descripcionEspaniol)
	{
		this.descripcionEspaniol = descripcionEspaniol;
	}
	/**
	 * M�todo que obtiene la descripci�n de este producto en ingles.
	 * @return String, descripci�n del producto en espa�ol.
	 */
	public String getDescripcionIngles()
	{
		return this.descripcionIngles;
	}
	/**
	 * M�todo que establece la descripci�n de este producto en espa�ol.
	 * @param descripcionEspaniol String, Nueva descripci�n del producto en ingles.
	 */
	public void setDescripcionIngles(String descripcionIngles)
	{
		this.descripcionIngles = descripcionIngles;
	}
	/**
	 * M�todo que obtiene el precio de este producto.
	 * @return
	 */
	public Double getPrecio()
	{
		return this.precio;
	}
	/**
	 * M�todo que establece el precio de este producto.
	 * @param precio Double, Precio nuevo del producto.
	 */
	public void setPrecio(Double precio)
	{
		this.precio = precio;
	}
	/**
	 * M�todo que obtiene los IDs de los productos equivalentes a este.
	 * @return List<Long>, Lista de IDs de productos Equivalentes.
	 */
	public List<ProductoBase> getIdProductosEquivalentes()
	{
		return productosEquivalentes;
	}
	/**
	 * M�todo que establece una lista de IDs de productos equivalentes a este.
	 * @param idProductosEquivalentes List<Long>, Lista de IDs de productos equivalentes.
	 */
	public void setIdProductosEquivalentes(List<ProductoBase> productosEquivalentes)
	{
		this.productosEquivalentes = productosEquivalentes;
	}
	/**
	 * M�todo que obtiene los tipos de comida de este producto.
	 * @return List<String>, Tipos de comida de este producto.
	 */
	public List<TipoComida> getTiposComida()
	{
		return this.tiposComida;
	}
	/**
	 * M�todo que obtiene los tipos de comida.
	 * @param tiposComida
	 */
	public void setTiposComida(List<TipoComida> tiposComida)
	{
		this.tiposComida = tiposComida;
	}
}
