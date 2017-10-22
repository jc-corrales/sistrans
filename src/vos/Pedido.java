package vos;

import java.time.LocalDateTime;


import org.codehaus.jackson.annotate.*;

public class Pedido {
	/**
	 * Atributo que contiene el ID de este pedido.
	 */
	@JsonProperty(value = "id")
	private Long id;
	/**
	 * Atributo que contiene el cliente due�o de este pedido.
	 */
	@JsonProperty(value = "cliente")
	private Cliente cliente;
	/**
	 * Atributo que contiene el producto pedido.
	 */
	@JsonProperty(value = "producto")
	private Producto producto; 
	/**
	 * Atributo que contiene la fecha de este pedido.
	 */
	@JsonProperty(value = "fecha")
	private LocalDateTime fecha;
	
	/**
	 * Atributo que contiene si este pedido ya ha sido servido o no.
	 */
	@JsonProperty(value = "servido")
	private Boolean servido;
	
	/**
	 * Atributo que contiene la orden a la que est� asociada este pedido.
	 */
	@JsonProperty(value = "orden")
	private Orden orden;
	
	/**
	 * M�todo constructor de la clase Pedido.
	 * @param id Long, ID del pedido.
	 * @param cliente Cliente, Cliente due�o del pedido.
	 * @param producto Producto, producto ordenado.
	 * @param fecha LocalDateTime, fecha en que se hizo el pedido.
	 * @param servido Boolean, Booleano que determina si el pedido ya ha sido entregado o no.
	 * @param restaurante Restaurante, restaurante due�o del pedido.
	 */
	public Pedido(@JsonProperty(value = "id") Long id, 
			@JsonProperty(value = "cliente") Cliente cliente, 
			@JsonProperty(value = "producto") Producto producto,
			@JsonProperty(value = "fecha") LocalDateTime fecha,
			@JsonProperty(value = "servido") Boolean servido
			) {
		this.id = id;
		this.cliente = cliente;
		this.producto = producto;
		this.fecha = fecha; 
		this.servido = servido;
	}
	/**
	 * M�todo que obtiene el ID del pedido.
	 * @return
	 */
	public Long getId() {
		return this.id;
	}
	/**
	 * M�todo que establece el ID del pedido.
	 * @param id Long, nuevo ID del pedido.
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * M�todo que obtiene el cliente due�o de este pedido.
	 * @return Cliente, cliente del Pedido.
	 */
	public Cliente getCliente() {
		return this.cliente;
	}
	/**
	 * M�todo que obtiene el Producto pedido en este Pedido.
	 * @return Producto, producto del pedido.
	 */
	public Producto getProducto() {
		return this.producto;
	}
	/**
	 * M�todo que obtiene la fecha de este Pedido.
	 * @return LocalDateTime, fecha del Pedido.
	 */
	public LocalDateTime getFecha() {
		return this.fecha;
	}
	/**
	 * M�todo que obtiene un booleano que determina si el pedido ha sido entregado o no.
	 * @return Boolean, booleano que determina si el pedido ha sido entregado o no.
	 */
	public Boolean getServido() {
		return this.servido;
	}
	/**
	 * M�todo que establece el Cliente de este Pedido.
	 * @param cliente Cliente, nuevo cliente due�o de este Pedido.
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente; 
	}
	/**
	 * M�todo que establece el Producto en este Pedido.
	 * @param producto Producto, nuevo Producto del Pedido.
	 */
	public void setProducto(Producto producto) {
		this.producto = producto; 
	}
	/**
	 * M�todo que establece la fecha de este Pedido.
	 * @param fecha LocalDateTime, nueva fecha de este Pedido.
	 */
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha; 
	}
	/**
	 * M�todo que establece si este pedido ha sido servido o no.
	 * @param servido Boolean, 
	 */
	public void setServido(Boolean servido) {
		this.servido = servido; 
	}
	/**
	 * M�todo que obtiene el Restaurante de este pedido.
	 * @return Restaurante.
	 */
}
