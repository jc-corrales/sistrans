package vos;

import org.codehaus.jackson.annotate.JsonProperty;
/**
 * Clase que contiene la informaci�n de un Tipo De Comida.
 * @author Usuario
 *
 */
public class TipoComida {
	/**
	 * Atributo que contiene el ID de este Tipo De Comida.
	 */
	@JsonProperty(value="id")
	private Long id;
	/**
	 * Atributo que contiene el nombre de este Tipo De Comida.
	 */
	@JsonProperty(value="name")
	private String name;
	/**
	 * M�todo constructor de la clase TipoDeComida.
	 * @param id Long
	 * @param name String
	 */
	public TipoComida(@JsonProperty(value="id") Long id, 
			 @JsonProperty(value="name") String name) {
		 this.id = id;
		 this.name = name;
	 }
	/**
	 * M�todo que obtiene el ID de este Tipo De Comida.
	 * @return ID de este Tipo de Comida.
	 */
	public Long getId()
	{
		return this.id;
	}
	/**
	 * M�todo que establece el ID de este Tipo De Comida.
	 * @param id Long, nuevo ID de este Tipo De Comida.
	 */
	public void setId(Long id)
	{
		this.id = id;
	}
	/**
	 * M�todo que obtiene el nombre de este Tipo De Comida.
	 * @return String, nombre de este Tipo De Comida.
	 */
	public String getName()
	{
		return this.name;
	}
	/**
	 * M�todo que establece el nombre de este Tipo de Comida.
	 * @param name String, nuevo nombre de este Tipo de Comida.
	 */
	public void setName(String name)
	{
		this.name = name;
	}
}