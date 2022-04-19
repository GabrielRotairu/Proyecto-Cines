package modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Proyecciones {
	private int id_proyeccion;
	private LocalDate fechaProyeccion;
	private LocalDateTime horaProyeccion;
	private Salas sala;
	private Peliculas pelicula;

	public Proyecciones() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Proyecciones(int id_proyeccion, LocalDate fechaProyeccion, LocalDateTime horaProyeccion, Salas sala,
			Peliculas pelicula) {
		super();
		this.id_proyeccion = id_proyeccion;
		this.fechaProyeccion = fechaProyeccion;
		this.horaProyeccion = horaProyeccion;
		this.sala = sala;
		this.pelicula = pelicula;
	}

	

	public Proyecciones(int id_proyeccion) {
		super();
		this.id_proyeccion = id_proyeccion;
	}

	/**
	 * @return the id_proyeccion
	 */
	public int getId_proyeccion() {
		return id_proyeccion;
	}

	/**
	 * @param id_proyeccion the id_proyeccion to set
	 */
	public void setId_proyeccion(int id_proyeccion) {
		this.id_proyeccion = id_proyeccion;
	}

	/**
	 * @return the fechaProyeccion
	 */
	public LocalDate getFechaProyeccion() {
		return fechaProyeccion;
	}

	/**
	 * @param fechaProyeccion the fechaProyeccion to set
	 */
	public void setFechaProyeccion(LocalDate fechaProyeccion) {
		this.fechaProyeccion = fechaProyeccion;
	}

	/**
	 * @return the horaProyeccion
	 */
	public LocalDateTime getHoraProyeccion() {
		return horaProyeccion;
	}

	/**
	 * @param horaProyeccion the horaProyeccion to set
	 */
	public void setHoraProyeccion(LocalDateTime horaProyeccion) {
		this.horaProyeccion = horaProyeccion;
	}

	/**
	 * @return the sala
	 */
	public Salas getSala() {
		return sala;
	}

	/**
	 * @param sala the sala to set
	 */
	public void setSala(Salas sala) {
		this.sala = sala;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Proyecciones [id_proyeccion=");
		builder.append(id_proyeccion);
		builder.append(", fechaProyeccion=");
		builder.append(fechaProyeccion);
		builder.append(", horaProyeccion=");
		builder.append(horaProyeccion);
		builder.append(", sala=");
		builder.append(sala);
		builder.append(", pelicula=");
		builder.append(pelicula);
		builder.append("]");
		return builder.toString();
	}

}
