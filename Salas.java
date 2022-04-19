package modelo;

public class Salas {
	private int numeroSala;
	private String tipoSala;
	private int Aforo;
	private int Precio;

	public Salas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salas(int numeroSala, String tipoSala, int aforo, int precio) {
		super();
		this.numeroSala = numeroSala;
		this.tipoSala = tipoSala;
		Aforo = aforo;
		Precio = precio;
	}

	public Salas(int numeroSala) {
		super();
		this.numeroSala = numeroSala;
	}

	/**
	 * @return the numeroSala
	 */
	public int getNumeroSala() {
		return numeroSala;
	}

	/**
	 * @param numeroSala the numeroSala to set
	 */
	public void setNumeroSala(int numeroSala) {
		this.numeroSala = numeroSala;
	}

	/**
	 * @return the tipoSala
	 */
	public String getTipoSala() {
		return tipoSala;
	}

	/**
	 * @param tipoSala the tipoSala to set
	 */
	public void setTipoSala(String tipoSala) {
		this.tipoSala = tipoSala;
	}

	/**
	 * @return the aforo
	 */
	public int getAforo() {
		return Aforo;
	}

	/**
	 * @param aforo the aforo to set
	 */
	public void setAforo(int aforo) {
		Aforo = aforo;
	}

	public int getPrecio() {
		return Precio;
	}

	public void setPrecio(int precio) {
		Precio = precio;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("numeroSala:");
		builder.append(numeroSala);
		builder.append("\t  tipoSala:");
		builder.append(tipoSala);
		builder.append("\t Aforo:");
		builder.append(Aforo);
		builder.append("\t Precio:");
		builder.append(Precio);
		return builder.toString();
	}

}
