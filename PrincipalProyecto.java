package control;

import modelo.DAO.SalasDao;
import vista.Entradas;
import vista.Salidas;

public class PrincipalProyecto {

	public static void main(String[] args) {
		int opcion = 0;

		Salidas.EscribirMenu();
		opcion = Entradas.decirOpcion();
		AccionesController ac = new AccionesController(opcion);
		while (opcion != 0) {
			ac.decidirOpcion();
			Salidas.EscribirMenu();
			Entradas.decirOpcion();
			ac.setOpcion(opcion);

		}

	}

}
