package modelo.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Salas;

public class SalasDao {

	public static void Filas() {
		int[] numeroSalas = { 1, 2, 3, 4, 5, 6 };
		String[] tipoSalas = { "3D", "2D", "IMAX", "RETRO", "VIP", "JUNIOR" };
		int[] aforoSalas = { 157, 320, 110, 104, 75, 186 };

		try {
			EnlaceJDBC enlaceBD = new EnlaceJDBC();

			for (int i = 0; i <= 35; i++) {

				String sqlInsert = "insert into salas values('" + numeroSalas[i] + "','" + tipoSalas[i] + "','"
						+ aforoSalas[i] + ")";
				enlaceBD.seleccionRegistros(sqlInsert);

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static List<Salas> MostrarSalas() {
		List<Salas> listaSalas = new ArrayList<Salas>();
		ResultSet rs = null;
		try {
			EnlaceJDBC enlaceBD = new EnlaceJDBC();
			String SqlQuery = "SELECT * FROM salas;";
			rs = enlaceBD.seleccionRegistros(SqlQuery);
			while (rs.next()) {
				listaSalas.add(new Salas(rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getInt(4)));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return listaSalas;

	}

	public static void insertarSala(Salas s) {
		try {
			EnlaceJDBC enlaceBD = new EnlaceJDBC();
			String sql = "insert into salas (numero_sala, tipo_sala, aforo,precio) values (" + s.getNumeroSala() + ",'"
					+ s.getTipoSala() + "'," + s.getAforo() + ","+s.getPrecio()+")";
			if (enlaceBD.insertar(sql))
				System.out.println("La inserción de " + s.getNumeroSala() + s.getTipoSala()+ " se ha realizado correctamente");
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}

	}

	public static int conseguirNumeroSala(int NumeroSala) {
		int codigo = 0;
		ResultSet rs = null;
		try {
			EnlaceJDBC enlace = new EnlaceJDBC();
			String sql = "select numero_sala from salas where numero_sala = '" + codigo;
			rs = enlace.seleccionRegistros(sql);
			if (rs.next()) {
				codigo = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return codigo;
	}

}
