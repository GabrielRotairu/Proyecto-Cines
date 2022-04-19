package modelo.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import modelo.Peliculas;
import modelo.Proyecciones;
import modelo.Salas;

public class ProyeccionesDao {

	public static void InsertarNuevaProyeccion(Proyecciones p) {

		try {
			EnlaceJDBC enlace = new EnlaceJDBC();
			String sql = "insert into proyecciones(fecha,hora,Pelicula,Sala) values('" + p.getFechaProyeccion() + "',"
					+ "'" + p.getHoraProyeccion() + "','" + p.getPelicula().getNombre() + "'," + "'"
					+ p.getSala().getNumeroSala() + "')";

			if (enlace.insertar(sql)) {
				System.out.println("------------------");
				System.out.println("Se ha insertado correctamente");
				System.out.println("------------------");

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public static List<Proyecciones> SeleccionarProyeccion() {
		List<Proyecciones> listaProyecciones = new ArrayList<Proyecciones>();
		ResultSet rs = null;
		try {
			EnlaceJDBC enlace = new EnlaceJDBC();
			String sql = "Select * from proyecciones";
			rs = enlace.seleccionRegistros(sql);
			while (rs.next()) {
			//	listaProyecciones.add(new Proyecciones(rs.getInt(1),LocalDate.parse(rs.getString(2)),LocalDateTime.parse(rs.getChar(3)),rs.getString(4),rs.getInt(5)));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return listaProyecciones;
			
	}

}
