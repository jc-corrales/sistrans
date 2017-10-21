package vos;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Clase que contiene la informaci�n de un Representante.
 * @author dj.bautista10
 *
 */
public class Representante {
	/**
	 * Id del representante
	 */
	@JsonProperty(value="id")
	private Long id;

	/**
	 * Nombre del representante
	 */
	@JsonProperty(value="name")
	private String name;
	/**
	 * Atributo que contiene la contrase�a de este representante.
	 */
	@JsonProperty(value = "contrasenia")
	private String contrasenia;
	/**
	 * Atributo que contiene el Restaurante.
	 */
	@JsonProperty(value = "restaurante")
	private Restaurante restaurante;
	/**
	 * M�todo constructor de la Clase Representante.
	 * @param id Long
	 * @param name String
	 */
	public Representante(
			@JsonProperty(value="id")Long id,
			@JsonProperty(value="name")String name,
			@JsonProperty(value="contrasenia")String contrasenia
			)
	{
		super();
		this.id = id;
		this.name = name;
		this.contrasenia = contrasenia;
	}
	/**
	 * M�todo que obtiene el ID de un Representante.
	 * @return Long, ID del representante.
	 */
	public Long getId() {
		return id;
	}
	/**
	 * M�todo que establece el ID de un representante.
	 * @param id Long, nuevo ID del representate.
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * M�todo que obtiene el nombre de un Representante.
	 * @return String, nombre del Representante.
	 */
	public String getName() {
		return name;
	}
	/**
	 * M�todo que establece el nombre de un Representante.
	 * @param name String, nuevo nombre del Representante.
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * M�todo que obtiene la contrase�a de este Representante.
	 * @return String, contrase�a del representante.
	 */
	public String getContrasenia()
	{
		return contrasenia;
	}
	/**
	 * M�todo que establece la contrase�a de este representante.
	 * @param contrasenia, nueva contrase�a del representante.
	 */
	public void setContrasenia(String contrasenia)
	{
		this.contrasenia = contrasenia;
	}
	/**
	 * M�todo que obtiene el Restaurante que este Representante representa.
	 * @return Restaurante, Restaurante que este Representante representa.
	 */
	public Restaurante getRestaurante()
	{
		return restaurante;
	}
	/**
	 * M�todo que establece el Restaurante que este Representante representa.
	 * @param restaurante Restaurante, nuevo Restaurante que este Representante representa.
	 */
	public void setRestaurante(Restaurante restaurante)
	{
		this.restaurante = restaurante;
	}
}
