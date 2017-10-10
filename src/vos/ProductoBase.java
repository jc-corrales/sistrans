package vos;

import org.codehaus.jackson.annotate.JsonProperty;

public class ProductoBase
{
	/**
	 * Id del producto.
	 */
	@JsonProperty(value="id")
	private Long id;

	/**
	 * Nombre del producto.
	 */
	@JsonProperty(value="nombre")
	private String nombre;
	
	public ProductoBase() {
		
	}
	
	public ProductoBase(@JsonProperty(value="id")Long id, @JsonProperty(value="nombre")String nombre)
	{
		this.id = id;
		this.nombre = nombre;
	}
	
	/**
	 * M�todo que obtiene el ID.
	 * @return Long, ID de este Producto.
	 */
	public Long getId()
	{
		return this.id;
	}
	/**
	 * M�todo que establece el ID de este producto.
	 * @param id Long, ID del producto.
	 */
	public void setId(Long id)
	{
		this.id = id;
	}
	/**
	 * M�todo que obtiene el nombre del producto.
	 * @return String, nombre de este producto.
	 */
	public String getNombre()
	{
		return this.nombre;
	}
	/**
	 * M�todo que establece el nombre de este producto.
	 * @param nombre String, Nombre nuevo del producto.
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
}
