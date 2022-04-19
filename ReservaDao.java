package modelo.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;
import modelo.Peliculas;
import modelo.Proyecciones;
import modelo.Reserva;

public class ReservaDao {

	public static void insertarNuevaReserva(Reserva Reserva) {
		try {
			EnlaceJDBC enlace = new EnlaceJDBC();
			String sql = "insert into reservas(Cliente,Peliculas,Proyeccion) values("
					+ Reserva.getCliente().getId_Cliente() + ",'" + Reserva.getPelicula().getNombre() + "',"
					+ Reserva.getProyeccion().getId_proyeccion() + ")";
			if (enlace.insertar(sql)) {
				System.out.println("Se ha reservado correctamente ");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static List<Reserva> SeleccionarReserva() {
List<Reserva>listaReserva= new ArrayList<Reserva>();	
ResultSet rs= null;
try {
	EnlaceJDBC enlace= new EnlaceJDBC();
	String sql="SELECT reservas.Cliente,reservas.Peliculas,reservas.Proyeccion from reservas";
	rs=enlace.seleccionRegistros(sql);
	while(rs.next()) {
		listaReserva.add(new Reserva(new Peliculas(rs.getString(2)),new Proyecciones(rs.getInt(3)),new Cliente(rs.getInt(1))));
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return listaReserva;
	}

	
	
	
}
