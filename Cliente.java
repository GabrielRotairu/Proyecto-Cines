package modelo;

public class Cliente {
	private int id_Cliente;
	private String Nombre;
	private String Apellido;
	private int Edad;
	private int Telefono;
	private String email;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Cliente(int Id_Cliente, String nombre, String apellido, int edad, int telefono, String email) {
		super();
		id_Cliente = Id_Cliente;
		Nombre = nombre;
		Apellido = apellido;
		Edad = edad;
		Telefono = telefono;
		this.email = email;
	}


	public Cliente(String nombre, String apellido) {
		super();
		Nombre = nombre;
		Apellido = apellido;
	
	}
	



	public Cliente(int id_Cliente) {
		super();
		this.id_Cliente = id_Cliente;
	}


	/**
	 * @return the id_Cliente
	 */
	public int getId_Cliente() {
		return id_Cliente;
	}


	/**
	 * @param id_Cliente the id_Cliente to set
	 */
	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
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
	 * @return the apellido
	 */
	public String getApellido() {
		return Apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return Edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		Edad = edad;
	}

	/**
	 * @return the telefono
	 */
	public int getTelefono() {
		return Telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		Telefono = telefono;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [Nombre=");
		builder.append(Nombre);
		builder.append(", Apellido=");
		builder.append(Apellido);
		builder.append(", Edad=");
		builder.append(Edad);
		builder.append(", Telefono=");
		builder.append(Telefono);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

}
