package vista;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import modelo.Cliente;
import modelo.Peliculas;
import modelo.Proyecciones;
import modelo.Reserva;
import modelo.Salas;

public class Entradas {
	static Scanner scan = new Scanner(System.in);
	static LocalDate fecha;
	static LocalDateTime hora;

	public static int decirOpcion() {
		return scan.nextInt();
	}

	public static Salas leerSala() {
		Salas s = new Salas();
		System.out.println("Dime el nº de la sala que quieres crear::");
		s.setNumeroSala(scan.nextInt());
		System.out.println("Dime el tipo de sala que quieres crear:");
		s.setTipoSala(scan.next());
		System.out.println("Dime el aforo de la sala que quieres crear:");
		s.setAforo(scan.nextInt());
		System.out.println("Dime el precio que le vas a poner:");
		s.setPrecio(scan.nextInt());
		return s;
	}

	public static Peliculas LeerPelicula() {

		SimpleDateFormat dtc = new SimpleDateFormat("yyyy-MM-dd");

		Peliculas p = new Peliculas();
		System.out.println("Dime el título de la pelicula:");
		p.setNombre(scan.next());
		System.out.println("Dime quien es la productora de esta pelicula:");
		p.setProductora(scan.next());
		System.out.println("Dime qué dia se estrena (año/mes/dia):");
		p.setFechaEstreno(fecha.of(scan.nextInt(), scan.nextInt(), scan.nextInt()));
		System.out.println("Dime qué sala la proyecta:");
		p.setSalas(new Salas(scan.nextInt()));
		return p;
	}

	public static Cliente LeerCliente() {
		Cliente c = new Cliente();
		System.out.println("Dime tu nombre:");
		c.setNombre(scan.next());
		System.out.println("Dime tu apeliido");
		c.setApellido(scan.next());
		System.out.println("Dime tu edad:");
		c.setEdad(scan.nextInt());
		System.out.println("Dime tu Correo Electronico:");
		c.setEmail(scan.next());
		System.out.println("Dime tu telefono:");
		c.setTelefono(scan.nextInt());

		return c;
	}

	public static Proyecciones LeerProyeccion() {
		Proyecciones p = new Proyecciones();
		System.out.println("Dime la fecha de la proyección: ");
		p.setFechaProyeccion(fecha.of(scan.nextInt(), scan.nextInt(), scan.nextInt()));
		System.out.println("Dime la Hora de la proyección: ");
		System.out.println("Dime el nombre de la pelicula: ");
		p.setPelicula(new Peliculas(scan.next()));
		System.out.println("Dime en qué sala se va a proyectar: ");
		p.setSala(new Salas(scan.nextInt()));
		return p;
	}

	public static Reserva HacerReserva() {
		Reserva r= new Reserva();
		System.out.println("Dime tu id de cliente: ");
r.setCliente(new Cliente(scan.nextInt()));
		System.out.println("Dime que pelicula vas a querer ver:");
		r.setPelicula(new Peliculas(scan.next()));
		System.out.println("Que proyección vas a ver?");
		r.setProyeccion(new Proyecciones(scan.nextInt()));
		return r;
	}

}
