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

public class Orden
{
	/**
	 * Id de la orden.
	 */
	@JsonProperty(value="id")
	private Long id;
	/**
	 * Atributo que contiene el costo total de esta orden.
	 */
	@JsonProperty(value = "costoTotal")
	private Double costoTotal;
	/**
	 * Atributo que contiene los productos Ordenados.
	 */
	@JsonProperty(value = "productosOrdenados")
	private List<Producto> productosOrdenados;
	/**
	 * Atributo que contiene el cliente due�o de esta orden.
	 */
	@JsonProperty(value = "cliente")
	private Cliente cliente;
	/**
	 * M�todo constructor de la clase OrdenVos.
	 * @param id
	 * @param costoTotal
	 * @param productosOrdenados
	 * @param cliente
	 */
	public Orden(@JsonProperty(value = "id")Long id, @JsonProperty(value = "costoTotal") Double costoTotal, @JsonProperty(value = "productosOrdenados")List<Producto> productosOrdenados, @JsonProperty(value = "cliente")Cliente cliente)
	{
		this.id = id;
		this.costoTotal = costoTotal;
		this.productosOrdenados = productosOrdenados;
		this.cliente = cliente;
	}
	/**
	 * M�todo que obtiene el ID de este cliente frecuente.
	 * @return Long, ID de este cliente.
	 */
	public Long getId()
	{
		return this.id;
	}
	/**
	 * M�todo que establece el ID de esta orden.
	 * @param id Long, ID de esta orden.
	 */
	public void setId(Long id)
	{
		this.id = id;
	}
	/**
	 * M�todo que obtiene el costo total de esta orden.
	 * @return Double, costo total de esta orden.
	 */
	public Double getCostoTotal()
	{
		return this.costoTotal;
	}
	/**
	 * M�todo que obtiene la lista de productos ordenados de esta orden.
	 * @return List<ProductoVos>, Lista de productos Ordenados en esta orden.
	 */
	public List<Producto> getProductosOrdenados()
	{
		return this.productosOrdenados;
	}
	/**
	 * M�todo que establece la lista de productos ordenados de esta orden.
	 * @param productosOrdenados List<ProductoVos>, Nueva lista de productos ordenados en esta orden.
	 */
	public void setProductosOrdenados(List<Producto> productosOrdenados)
	{
		this.productosOrdenados = productosOrdenados;
	}
	/**
	 * M�todo que obtiene el cliente a nombre de quien est� esta orden.
	 * @return ClienteVos, Cliente de esta orden.
	 */
	public Cliente getCliente()
	{
		return this.cliente;
	}
	/**
	 * M�todo que establece el cliente a nombre de quien est� esta orden.
	 * @param cliente ClienteVos, nuevo cliente de esta orden.
	 */
	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}
}
