/**-------------------------------------------------------------------
 * $Id$
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 *
 * Materia: Sistemas Transaccionales
 * Ejercicio: menuAndes
 * Autor: Juan Felipe García - jf.garcia268@uniandes.edu.co
 * -------------------------------------------------------------------
 */
package vos;

import java.util.Collection;

import org.codehaus.jackson.annotate.*;

/**
 * Clase que representa un men�
 * @author dj.bautista10
 */
public class Menu{

	//// Atributos

	/**
	 * Id del menu
	 */
	@JsonProperty(value="id")
	private Long id;

	/**
	 * Nombre del men�
	 */
	@JsonProperty(value="name")
	private String name;

	/**
	 * Costo de producci�n
	 */
	@JsonProperty(value="costoProduccion")
	private Double costoProduccion;
	/**
	 * Atributo que contiene la descripci�n en espa�ol de este Men�.
	 */
	@JsonProperty(value="descripcion")
	private String descripcion;
	/**
	 * Atributo que contiene la descripci�n en ingl�s de este Men�.
	 */
	@JsonProperty(value="description")
	private String description;
	/**
	 * Atributo que contiene el precio de este Men�.
	 */
	@JsonProperty(value="precio")
	private Double precio;
	/**
	 * Atributo que contiene la Entrada de este Men�.
	 */
	@JsonProperty(value="entrada")
	private Producto entrada; 
	/**
	 * Atributo que contiene el Plato Fuerte de este Men�.
	 */
	@JsonProperty(value="platoFuerte")
	private Producto platoFuerte;
	/**
	 * Atributo que contiene el Postre de este Men�.
	 */
	@JsonProperty(value="postre")
	private Producto postre;
	/**
	 * Atributo que contiene la Bebida de este Men�.
	 */
	@JsonProperty(value="bebida")
	private Producto bebida;


	/**
	 * M�todo constructor de la clase menu
	 * <b>post: </b> Crea el menu con los valores que entran como parametro
	 * @param id - Id del menu.
	 * @param name - Nombre del menu. name != null
	 * @param sabores - lista de String de sabores en minutos del menu.
	 */
	public Menu(@JsonProperty(value="id") Long id, 
			@JsonProperty(value="name") String name, 
			@JsonProperty(value = "costoProduccion") Double costoProduccion, 
			@JsonProperty(value="descripcion") String descripcion, 
			@JsonProperty(value = "description") String description, 
			@JsonProperty(value = "precio") Double precio,
			@JsonProperty(value="entrada") Producto entrada,
			@JsonProperty(value="platoFuerte") Producto platoFuerte,
			@JsonProperty(value="bebida") Producto bebida,
			@JsonProperty(value="postre") Producto postre){
		super();
		this.id = id;
		this.name = name;
		this.descripcion = descripcion;
		this.description = description;
		this.precio = precio;
		this.costoProduccion = costoProduccion;
		this.entrada = entrada;
		this.platoFuerte = platoFuerte;
		this.bebida = bebida;
		this.postre = postre;
	}


	/**
	 * Metodo getter del atributo id
	 * @return id del menu
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Metodo setter del atributo id <b>post: </b> El id del menu ha sido
	 * cambiado con el valor que entra como parametro
	 * @param id - Id del menu
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Metodo getter del atributo name
	 * @return nombre del menu
	 */
	public String getName() {
		return name;
	}

	/**
	 * Metodo setter del atributo name <b>post: </b> El nombre del menu ha sido
	 * cambiado con el valor que entra como parametro
	 * @param name - Id del menu
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * M�todo getter del atributo sabores
	 * @return colecci�n de sabores del menu 
	 */
	public  String getDescripcion() {
		return descripcion;
	}

	/**
	 * M�todo setter del atributo esCaliente <b> post: </b> El valor condicional de la bebida ha sido cambiado
	 * por el valor que entra como par�metro.
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion= descripcion;
	}



	/**
	 * M�todo getter del atributo sabores
	 * @return colecci�n de sabores del menu 
	 */
	public  String getdescription() {
		return description;
	}

	/**
	 * M�todo setter del atributo esCaliente <b> post: </b> El valor condicional de la bebida ha sido cambiado
	 * por el valor que entra como par�metro.
	 */
	public void setdescription(String description) {
		this.description= description;
	}
	/**
	 * M�todo que obtiene el Precio de este Men�.
	 * @return Double, Precio de este Men�.
	 */
	public Double getPrecio() {
		return precio;
	}
	/**
	 * M�todo que establece el Precio de este Men�.
	 * @param precio Double, nuevo Precio de este Men�.
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	/**
	 * M�todo que obtiene el Costo de Producci�n de este Men�.
	 * @return Double, Costo de Producci�n de este Men�.
	 */
	public Double getCostoProduccion() {
		return costoProduccion;
	}
	/**
	 * M�todo que establece el costo de producci�n de este Men�.
	 * @param costoProduccion Double, nuevo costo de producci�n de este Men�.
	 */
	public void setCostoProduccion(Double costoProduccion) {
		this.costoProduccion = costoProduccion;
	}
	/**
	 * M�todo que obtiene la Entrada de este Men�.
	 * @return Entrada, Entrada de este Men�.
	 */
	public Producto getEntrada() {
		return entrada;
	}
	/**
	 * M�todo que establece la Entrada de este Men�.
	 * @param entrada Entrada, nueva Entrada de este Men�.
	 */
	public void setEntrada(Producto entrada) {
		this.entrada = entrada;
	}
	/**
	 * M�todo que obtiene el Plato Fuerte de este Men�.
	 * @return PlatoFuerte, Plato Fuerte de este Men�.
	 */
	public Producto getPlatoFuerte() {
		return platoFuerte;
	}
	/**
	 * M�todo que establece el Plato Fuerte de este Men�.
	 * @param platoFuerte PlatoFuerte, nuevo PlatoFuerte de este Men�.
	 */
	public void setPlatoFuerte(Producto platoFuerte) {
		this.platoFuerte = platoFuerte;
	}
	/**
	 * M�todo que obtiene el Postre de este Men�.
	 * @return Postre, Postre de este Men�.
	 */
	public Producto getPostre() {
		return postre;
	}
	/**
	 * M�todo que establece el Postre de este Men�.
	 * @param postre Postre, nuevo postre de este Men�.
	 */
	public void setPostre(Producto postre) {
		this.postre = postre;
	}
	/**
	 * M�todo que obtiene la Bebida de este Men�.
	 * @return Bebida, Bebida de este Men�.
	 */
	public Producto getBebida() {
		return bebida;
	}
	/**
	 * M�todo que establece la Bebida de este Men�.
	 * @param bebida Bebida, nueva Bebida de este Men�.
	 */
	public void setBebida(Producto bebida) {
		this.bebida = bebida;
	}
}
