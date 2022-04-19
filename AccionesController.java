package control;

import modelo.DAO.ClientesDao;
import modelo.DAO.PeliculasDao;
import modelo.DAO.ProyeccionesDao;
import modelo.DAO.ReservaDao;
import modelo.DAO.SalasDao;
import vista.Entradas;
import vista.Salidas;

public class AccionesController {

	private int opcion;

	public AccionesController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccionesController(int opcion) {
		super();
		this.opcion = opcion;
	}

	/**
	 * @return the opcion
	 */
	public int getOpcion() {
		return opcion;
	}

	/**
	 * @param opcion the opcion to set
	 */
	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}

	public void decidirOpcion() {
		switch (opcion) {
		case 1:
			Salidas.mostrarListaSalas(SalasDao.MostrarSalas());
			break;
		case 2:
			SalasDao.insertarSala(Entradas.leerSala());
			;
			break;
		case 3:
			Salidas.MostrarPeliculas(PeliculasDao.seleccionarPeliculas());
			break;
		case 4:
			PeliculasDao.InsertarPelicula(Entradas.LeerPelicula());
			break;
		case 5:
			Salidas.MostrarClientes(ClientesDao.SeleccionarClientes());
			break;
		case 6:
			ClientesDao.InsertarNuevoCliente(Entradas.LeerCliente());
			break;
		case 7:
			ProyeccionesDao.InsertarNuevaProyeccion(Entradas.LeerProyeccion());
			break;
		case 8:
			Salidas.MostrarProyecciones(ProyeccionesDao.SeleccionarProyeccion());
			break;
		case 9:
			ReservaDao.insertarNuevaReserva(Entradas.HacerReserva());
			break;
		case 10:Salidas.MostrarReservas(ReservaDao.SeleccionarReserva()) ;break;
		}
	}

}
