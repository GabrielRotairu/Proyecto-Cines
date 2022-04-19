package modelo.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;
import modelo.Reserva;

public class ClientesDao {

	public static List<Cliente> SeleccionarClientes() {
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		ResultSet rs = null;
		try {
			EnlaceJDBC enlace = new EnlaceJDBC();
			String sql = "select * from clientes";
			rs = enlace.seleccionRegistros(sql);
			while (rs.next()) {
				listaClientes.add(
						new Cliente(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5),rs.getString(6)));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaClientes;
	}

	public static void InsertarNuevoCliente(Cliente Cliente) {
		ResultSet rs = null;
		try {
			EnlaceJDBC enlace = new EnlaceJDBC();
			String sql = "insert into clientes(nombre,apellidos,edad,email,telefono) values('" + Cliente.getNombre()
					+ "','" + Cliente.getApellido() + "'," + Cliente.getEdad() + ",'" + Cliente.getEmail() + "',"
					+ Cliente.getTelefono() + ")";
			if (enlace.insertar(sql)) {
				System.out
						.println("Se ha insertado correctamente: " + Cliente.getNombre() + " , " + Cliente.getApellido());
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




	
	
	
	

}
