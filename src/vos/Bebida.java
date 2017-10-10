/**-------------------------------------------------------------------
 * $Id$
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 *
 * Materia: Sistemas Transaccionales
 * Ejercicio: VideoAndes
 * Autor: Juan Felipe García - jf.garcia268@uniandes.edu.co
 * -------------------------------------------------------------------
 */
package vos;

import java.util.List;

import org.codehaus.jackson.annotate.*;

/**
 * Clase que representa una Bebida
 * @author dj.bautista10
 */
public class Bebida extends Producto{

	//// Atributos

	/**
	 * Booleano que define si una bebida es caliente
	 */
	@JsonProperty(value="esBebidaCaliente")
	private Boolean esCaliente;
	
	/**
	 * Booleano que define si una bebida ha sido producida naturalmente
	 */
	@JsonProperty(value="esNatural")
	private Boolean esNatural; 
	
	/**
	 * Boolean que define si una bebida va a acompa�ada de hielo
	 */
	@JsonProperty(value="conHielo")
	private Boolean conHielo;
	
	/**
	 * Descripci�n breve del sabor de la bebida
	 */
	@JsonProperty(value="sabor")
	private Sabor sabor;

	/**
	 * Metodo constructor de la clase Bebida
	 * <b>post: </b> Crea el video con los valores que entran como parametro
	 * @param id - Id del video.
	 * @param name - Nombre del video. name != null
	 * @param duration - Duracion en minutos del video.
	 */
	public Bebida(@JsonProperty(value="id")Long id,
			@JsonProperty(value="name")String name,
			@JsonProperty(value="costoDeProduccion")Double costoDeProduccion,
			@JsonProperty(value="descripcionEspaniol")String descripcionEspaniol, 
			@JsonProperty(value = "descripcionIngles")String descripcionIngles,
			@JsonProperty(value = "productosEquivalentes")List<ProductoBase> productosEquivalentes,
			@JsonProperty(value = "precio")Double precio,
			@JsonProperty(value = "tiposComida") List<TipoComida> tiposComida,
			@JsonProperty(value="esCaliente")Boolean esCaliente, 
			@JsonProperty(value="esNatural")Boolean esNatural, 
			@JsonProperty(value="conHielo")Boolean conHielo,
			@JsonProperty(value="sabor")Sabor sabor) {
		super(id, name, costoDeProduccion, descripcionEspaniol, descripcionIngles, productosEquivalentes, precio, tiposComida);
		this.esCaliente = esCaliente;
		this.esNatural = esNatural;
		this.conHielo = conHielo;
		this.esCaliente = esCaliente;
		this.sabor = sabor;
		
	}
	

	
	
	/**
	 * M�todo getter del atributo esCaliente 
	 * @return condici�n esCaliente de la bebida
	 */
	public Boolean getEsCaliente() {
		return esCaliente;
	}
	
	/**
	 * M�todo setter del atributo esCaliente <b> post: </b> El valor condicional de la bebida ha sido cambiado
	 * por el valor que entra como par�metro.
	 */
	public void setEsCaliente(Boolean esCaliente) {
		this.esCaliente = esCaliente;
	}
	
	/**
	 * M�todo getter del atributo esNatural 
	 * @return condici�n esNatural de la bebida
	 */
	public Boolean getEsNatural() {
		return esNatural;
	}
	
	
	/**
	 * M�todo setter del atributo esNatural <b> post: </b> El valor condicional de la bebida ha sido cambiado
	 * por el valor que entra como par�metro.
	 */
	public void setEsNatural(Boolean esNatural) {
		this.esNatural = esNatural;
	}
	
	/**
	 * M�todo getter del atributo helado 
	 * @return condici�n helado de la bebida
	 */
	public Boolean getConHielo() {
		return conHielo;
	}
	
	
	/**
	 * M�todo setter del atributo helado <b> post: </b> El valor condicional de la bebida ha sido cambiado
	 * por el valor que entra como par�metro.
	 */
	public void setConHielo(Boolean conHielo) {
		this.conHielo = conHielo;
	}
	
	/**
	 * Metodo getter del atributo sabor
	 * @return sabor de la bebida
	 */
	public Sabor getSabor() {
		return sabor;
	}

	/**
	 * Metodo setter del atributo sabor <b>post: </b> El sabor de la bebida ha sido
	 * cambiado con el valor que entra como parametro
	 * @param sabor de la bebida
	 */
	public void set(Sabor sabor) {
		this.sabor = sabor;
	}
	
}
