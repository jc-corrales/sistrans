package vos;

import java.util.Collection;

import org.codehaus.jackson.annotate.JsonProperty;
/**
 * Clase que contiene la informaci�n de un Restaurante.
 * @author dj.bautista.
 *
 */
public class Restaurante {
	/**
	 * Atributo que contiene el ID del Restaurante.
	 */
	@JsonProperty(value="id")
	private Long id;
	/**
	 * Atributo que contiene el nombre del Restaurante.
	 */
	@JsonProperty(value="name")
	private String name;
	/**
	 * Atributo que contiene la URL de la p�gina web del Restaurante.
	 */
	@JsonProperty(value="paginaWeb")
	private String pagina;
	/**
	 * Atributo que contiene las Entradas que este Restaurante ofrece.
	 */
	@JsonProperty(value="entradas")
	private Collection<Entrada> entradas;
	/**
	 * Atributo que contiene los Platos Fuertes que este Restaurante ofrece.
	 */
	@JsonProperty(value="platosFuertes")
	private Collection<PlatoFuerte> platosFuertes;
	/**
	 * Atributo que contiene los Postres que este Restaurante ofrece.
	 */
	@JsonProperty(value="postres")
	private Collection<Postre> postres;
	/**
	 * Atributo que contiene las Bebidas que este Restaurante ofrece.
	 */
	@JsonProperty(value="bebidas")
	private Collection<Bebida> bebidas;
	/**
	 * M�todo constructor de la clase Restaurante.
	 * @param id Long
	 * @param name String
	 * @param pagina String
	 * @param entradas Collection<Entrada>
	 * @param platosFuertes Collection<PlatoFuerte>
	 * @param postres Collection<Postre>
	 * @param bebidas Collection<Bebida>
	 */
	public Restaurante(@JsonProperty(value="id") Long id, 
			@JsonProperty(value="name") String name, 
			@JsonProperty(value="paginaWeb") String pagina,
			@JsonProperty(value="entradas") Collection<Entrada> entradas,
			@JsonProperty(value="platosFuertes") Collection<PlatoFuerte> platosFuertes,
			@JsonProperty(value="postres") Collection<Postre> postres,
			@JsonProperty(value="bebidas") Collection<Bebida> bebidas) {
		
		this.id = id;
		this.name = name;
		this.pagina = pagina;
		this.bebidas = bebidas;
		this.entradas = entradas;
		this.platosFuertes = platosFuertes;
		this.postres = postres;
	}
	/**
	 * M�todo que obtiene el ID de un Restaurante.
	 * @return Long, ID del restaurante.
	 */
	public Long getId() {
		return id;
	}
	/**
	 * M�todo que establece el ID de un Restaurante.
	 * @param id Long, nuevo ID del Restaurante.
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * M�todo que obtiene el nombre de un Restaurante.
	 * @return String, nombre del Restaurante.
	 */
	public String getName() {
		return name;
	}
	/**
	 * M�todo que establece el nombre de un Restaurante.
	 * @param name String, nuevo nombre del Restaurante.
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * M�todo que obtiene la URL de la p�gina web del Restaurante.
	 * @return String, URL de la p�gina web del Restaurante.
	 */
	public String getPagina() {
		return pagina;
	}
	/**
	 * M�todo que establece la URL de la p�gina web del Restaurante.
	 * @param pagina String, URL de la p�gina web del Restaurante.
	 */
	public void setPagina(String pagina) {
		this.pagina = pagina;
	}
	/**
	 * M�todo que obtiene las Entradas que ofrece este Restaurante.
	 * @return Collection<Entrada>, Entradas que ofrece este Restaurante.
	 */
	public Collection<Entrada> getEntradas(){
		return entradas;
	}
	/**
	 * M�todo que establece las Entradas que ofrece este Restaurante.
	 * @param entradas Collection<Entrada>, nuevas Entradas que ofrece este Restaurante-
	 */
	public void SetEntradas(Collection<Entrada> entradas) {
		this.entradas = entradas;
	}
	/**
	 * M�todo que obtiene los Platos Fuertes que ofrece este Restaurante.
	 * @return Collection<PlatoFuerte>, Platos Fuertes que ofrece este Restaurante.
	 */
	public Collection<PlatoFuerte> getPlatosFuertes(){
		return platosFuertes;
	}
	/**
	 * M�todo que establece los Platos Fuertes que ofrece este Restaurante.
	 * @param platosFuertes Collection<PlatoFuerte>, nuevos Platos Fuertes que ofrece este Restaurante.
	 */
	public void SetPlatosFuertes(Collection<PlatoFuerte> platosFuertes) {
		this.platosFuertes = platosFuertes;
	}
	/**
	 * M�todo que obtiene las Bebidas que ofrece este Restaurante.
	 * @return Collection<Bebida>, Bebidas que ofrece este Restaurante.
	 */
	public Collection<Bebida> getBebidas(){
		return bebidas;
	}
	/**
	 * M�todo que establece las Bebidas que ofrece este Restaurante.
	 * @param bebidas Collection<Bebida>, nuevas Bebidas que ofrece este Restaurante.
	 */
	public void SetBebidas(Collection<Bebida> bebidas) {
		this.bebidas= bebidas;
	}
	/**
	 * M�todo que obtiene los Postres que ofrece este Restaurante.
	 * @return Collection<Postre>, Postres que ofrece el Restaurante.
	 */
	public Collection<Postre> getPostres(){
		return postres;
	}
	/**
	 * M�todo que establece los Postres que ofrece este Restaurante.
	 * @param postres Collection<Postre>, nuevos Postres que ofrece este Restaurante.
	 */
	public void SetPostres(Collection<Postre> postres) {
		this.postres= postres;
	}
}