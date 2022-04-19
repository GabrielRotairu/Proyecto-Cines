package modelo;

public class Reserva {
	private int id_reserva;
	private Peliculas pelicula;
	private Proyecciones proyeccion;
	private Cliente cliente;

	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reserva(int id_reserva, Peliculas pelicula, Proyecciones proyeccion, Cliente cliente) {
		super();
		this.id_reserva = id_reserva;
		this.pelicula = pelicula;
		this.proyeccion = proyeccion;
		this.cliente = cliente;
	}

	

	public Reserva(Peliculas pelicula, Proyecciones proyeccion, Cliente cliente) {
		super();
		this.pelicula = pelicula;
		this.proyeccion = proyeccion;
		this.cliente = cliente;
	}

	

	/**
	 * @return the id_reserva
	 */
	public int getId_reserva() {
		return id_reserva;
	}

	/**
	 * @param id_reserva the id_reserva to set
	 */
	public void setId_reserva(int id_reserva) {
		this.id_reserva = id_reserva;
	}

	/**
	 * @return the pelicula
	 */
	public Peliculas getPelicula() {
		return pelicula;
	}

	/**
	 * @param pelicula the pelicula to set
	 */
	public void setPelicula(Peliculas pelicula) {
		this.pelicula = pelicula;
	}

	/**
	 * @return the proyeccion
	 */
	public Proyecciones getProyeccion() {
		return proyeccion;
	}

	/**
	 * @param proyeccion the proyeccion to set
	 */
	public void setProyeccion(Proyecciones proyeccion) {
		this.proyeccion = proyeccion;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reserva [id_reserva=");
		builder.append(id_reserva);
		builder.append(", pelicula=");
		builder.append(pelicula);
		builder.append(", proyeccion=");
		builder.append(proyeccion);
		builder.append(", cliente=");
		builder.append(cliente);
		builder.append("]");
		return builder.toString();
	}

}
