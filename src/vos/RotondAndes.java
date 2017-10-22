package vos;


import org.codehaus.jackson.annotate.JsonProperty;
/**
 * Clase que contiene la informaci�n de RotondAndes
 * @author dj.Bautista
 *
 */
public class RotondAndes {
	public static final String[] categoria = {"ENTRADA", "BEBIDA", "POSTRE", "PLATOFUERTE", "ACOMPANIAMIENTO"};
	/**
	 * Id de rotondAndes
	 */
	@JsonProperty(value="id")
	private Long id;

	/**
	 * Nombre de rotondAndes
	 */
	@JsonProperty(value="name")
	private String name;
	/**
	 * M�todo constructor de la clase RotondAndes
	 * @param id Long
	 * @param name String
	 */
	public RotondAndes(@JsonProperty(value="id")Long id, @JsonProperty(value="name")String name) {
		super();
		this.id = id;
		this.name = name;
	}
	/**
	 * M�todo que obtiene el ID de RotondAndes.
	 * @return Long, ID de RotondAndes.
	 */
	public Long getId() {
		return id;
	}
	/**
	 * M�todo que establece el ID de RotondAndes.
	 * @param id Long, nuevo ID de RotondAndes
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * M�todo que obtiene el nombre de RotondAndes.
 	 * @return String, nombre de RotondAndes.
	 */
	public String getName() {
		return name;
	}
	/**
	 * M�todo que establece el nombre de RotondAndes.
	 * @param name String, nuevo nombre de RotondAndes.
	 */
	public void setName(String name) {
		this.name = name;
	}
}