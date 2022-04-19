package vista;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Cliente;
import modelo.Peliculas;
import modelo.Proyecciones;
import modelo.Reserva;
import modelo.Salas;
import modelo.DAO.EnlaceJDBC;

public class Salidas {

	public static void EscribirMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("------------Menú de Opciones-------------- \n");
		sb.append("Eliga una de las opciones: \n");
		sb.append("\n");
		sb.append("1. Mostrar Salas \n");
		sb.append("2. Insertar Configuración Sala \n");
		sb.append("3. Ver listado de Peliculas \n");
		sb.append("4. Insertar Nueva Pelicula \n");
		sb.append("5. Mostrar Listado de Clientes \n");
		sb.append("6. Insertar Nuevo Cleinte \n");
		sb.append("7. Insertar Proyecciones \n");
		sb.append("8. Mostrar Proyeccion \n");
		sb.append("9. Hacer Reserva \n");
		sb.append("10. Ver Reservas \n");

		sb.append("0. Salir \n ");
		sb.append("------------------------------------------- \n");
		System.out.println(sb.toString());

	}

	public static void mostrarListaSalas(List<Salas> listaSalas) {
		System.out.println("-----------------------------SALAS----------------------------------  \n");

		listaSalas.forEach(x -> System.out.printf(" Numero Sala:%d | Tipo: %s | Aforo: %d | Precio: %d %n",
				x.getNumeroSala(), x.getTipoSala(), x.getAforo(), x.getPrecio()));
		System.out.println("--------------------------------------------------------------------");
		System.out.println();
	}

	public static void MostrarPeliculas(List<Peliculas> listaPeliculas) {
		System.out.println("---------------CARTELERA---------------  \n");

		listaPeliculas.forEach(x -> System.out.printf("Nombre: %s |Fecha Estreno %s | Productora: %s|  Sala: %d %n %n",
				x.getNombre(), x.getFechaEstreno(), x.getProductora(), x.getSalas().getNumeroSala()));
		System.out.println("-------------------------------------------------------");
		System.out.println();
	}

	public static void MostrarClientes(List<Cliente> listaClientes) {
		System.out.println("-------------------CLIENTES------------------ \n");
		listaClientes
				.forEach(x -> System.out.printf("Nombre: %s | Apellido: %s | Edad: %d | Email: %s | Teléfono: %d %n %n",
						x.getNombre(), x.getApellido(), x.getEdad(), x.getEmail(), x.getTelefono()));
		System.out.println("--------------------------------------------- ");
		System.out.println();
	}

	public static void MostrarProyecciones(List<Proyecciones> listaProyecciones) {
		System.out.println("------------------------PROYECCIONES-------------------- \n");
		listaProyecciones.forEach(x -> System.out.printf(
				" Proyeccion: %d | " + "Fecha: %s | Hora: %s | Nombre Pelicula: %s | Numero Sala: %d %n",
				x.getId_proyeccion(), x.getFechaProyeccion(), x.getHoraProyeccion(), x.getPelicula().getNombre(),
				x.getSala().getNumeroSala()));
		System.out.println("-------------------------------------------------------- ");
	}

	public static void MostrarReservas(List<Reserva> listaReserva) {
System.out.println("------------------RESERVAS-------------------");		
listaReserva.forEach(x-> System.out.printf("Cliente: %d | Película: %s | Proyección: %d  %n",x.getCliente().getId_Cliente(),x.getPelicula().getNombre(),x.getProyeccion().getId_proyeccion()));
	}

	

}
