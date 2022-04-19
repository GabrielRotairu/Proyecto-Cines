package modelo;

import java.time.LocalDate;

public class Peliculas {
	private String Nombre;
	private String Productora;
	private LocalDate fechaEstreno;
	private Salas salas;

	public Peliculas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Peliculas(String nombre, String productora, LocalDate fechaEstreno, Salas salas) {
		super();
		Nombre = nombre;
		Productora = productora;
		this.fechaEstreno = fechaEstreno;
		this.salas = salas;
	}

	

	public Peliculas(String nombre) {
		super();
		Nombre = nombre;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * @return the productora
	 */
	public String getProductora() {
		return Productora;
	}

	/**
	 * @param productora the productora to set
	 */
	public void setProductora(String productora) {
		Productora = productora;
	}

	/**
	 * @return the fechaEstreno
	 */
	public LocalDate getFechaEstreno() {
		return fechaEstreno;
	}

	/**
	 * @param fechaEstreno the fechaEstreno to set
	 */
	public void setFechaEstreno(LocalDate fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

	/**
	 * @return the salas
	 */
	public Salas getSalas() {
		return salas;
	}

	/**
	 * @param salas the salas to set
	 */
	public void setSalas(Salas salas) {
		this.salas = salas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nombre:");
		builder.append(Nombre);
		builder.append("\t Productora:");
		builder.append(Productora);
		builder.append("\t fechaEstreno:");
		builder.append(fechaEstreno);
		builder.append("\t salas:");
		builder.append(salas);
		builder.append("");
		return builder.toString();
	}

	public void setSalas1(Salas numeroSala) {
		this.salas = numeroSala;

	}

}
