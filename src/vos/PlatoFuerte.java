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

public class PlatoFuerte extends Producto
{
	/**
	 * Atributo que contiene la lista de acompa�amientos de este plato fuerte.
	 */
	@JsonProperty(value = "acompaniamientos")
	private List<Entrada> acompaniamientos;


	/**
	 * M�todo constructo de la clase PlatoFuerteVos.
	 * @param acompaniamientos
	 * @param id
	 * @param nombre
	 * @param costoDeProduccion
	 * @param descripcionEspaniol
	 * @param descripcionIngles
	 * @param idProductosEquivalentes
	 * @param precio
	 * @param tiposComida
	 */
	public PlatoFuerte(@JsonProperty(value="acompaniamientos")List<Entrada> acompaniamientos,
			@JsonProperty(value="id")Long id, @JsonProperty(value="nombre")String nombre, 
			@JsonProperty(value="costoDeProduccion")Double costoDeProduccion, 
			@JsonProperty(value="descripcionEspaniol")String descripcionEspaniol, 
			@JsonProperty(value = "descripcionIngles")String descripcionIngles,
			@JsonProperty(value = "productosEquivalentes")List<ProductoBase> productosEquivalentes,
			@JsonProperty(value = "precio")Double precio,
			@JsonProperty(value = "tiposComida")List<TipoComida> tiposComida)
	{
		super(id, nombre, costoDeProduccion, descripcionEspaniol, descripcionIngles, productosEquivalentes, precio, tiposComida);
		this.acompaniamientos = acompaniamientos;

	}
	/**
	 * M�todo que obtiene los acompa�amientos de este plato fuerte.
	 * @return List<EntradaVos>, lista de acompa�amientos.
	 */
	public List<Entrada> getAcompaniamientos()
	{
		return this.acompaniamientos;
	}
	/**
	 * M�todo que establece los acompa�amientos de este plato fuerte.
	 * @param acompaniamientos List<EntradaVos>, lista de acompa�amientos nuevos.
	 */
	public void setAcompaniamientos(List<Entrada> acompaniamientos)
	{
		this.acompaniamientos = acompaniamientos;
	}
}
