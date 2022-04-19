package modelo.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import modelo.Peliculas;
import modelo.Salas;

public class PeliculasDao {

	public static List<Peliculas> seleccionarPeliculas() {
		List<Peliculas> listaPeliculas = new ArrayList<Peliculas>();
		ResultSet rs = null;
		try {
			EnlaceJDBC enlace = new EnlaceJDBC();
			String sql = "Select * from peliculas";
			rs = enlace.seleccionRegistros(sql);
			while (rs.next()) {
				listaPeliculas.add(new Peliculas(rs.getString(1), rs.getString(2), LocalDate.parse(rs.getString(3)),
						new Salas(rs.getInt(4))));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return listaPeliculas;
	}

	public static void InsertarPelicula(Peliculas Peliculas) {
		int sala = 0;

		try {
			EnlaceJDBC enlace = new EnlaceJDBC();
			String sql = "insert into peliculas(nombre,productora,fecha_estreno,Sala) values('" + Peliculas.getNombre()
					+ "'," + "'" + Peliculas.getProductora() + "','" + Peliculas.getFechaEstreno() + "'," + "'"
					+ Peliculas.getSalas().getNumeroSala() + "')";

			if (enlace.insertar(sql)) {
				System.out.println("------------------");
				System.out.println("Se ha insertado correctamente");
				System.out.println("------------------");

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
