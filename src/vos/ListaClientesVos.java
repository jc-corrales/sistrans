package vos;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class ListaClientesVos 
{
	/**
	 * Atributo que contiene los productos.
	 */
	@JsonProperty(value = "clientes")
	private List<Cliente> clientes;
	/**
	 * M�todo constructor de la clase ListaClientesVos
	 * @param productos
	 */
	public ListaClientesVos(@JsonProperty(value = "clientes") List<Cliente> clientes)
	{
		this.clientes = clientes;
	}
	/**
	 * M�todo para obtener los productos.
	 * @return List<ClienteVos>, lista de productos.
	 */
	public List<Cliente> getClientes()
	{
		return this.clientes;
	}
	/**
	 * M�todo que establece la lista de productos.
	 * @param productos List<ClienteVos>, nueva lista de productos.
	 */
	public void setClientes(List<Cliente> clientes)
	{
		this.clientes = clientes;
	}
}
