import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.*;
import itinerarioModel.Itinerario;
import itinerarioModel.ItinerarioModelFactory;
import itinerarioModel.Vuelo;

public class Main {

	public static void main(String[] args) {
		Itinerario itinerario = ItinerarioModelFactory.eINSTANCE.createItinerario();
		itinerario.setPasajero("Juan Pablo Peñuela");

		Vuelo vuelo1 = ItinerarioModelFactory.eINSTANCE.createVuelo();
		vuelo1.setNombre("AA001");
		vuelo1.setOrigen("Armenia");
		vuelo1.setDestino("Bogotá");

		Vuelo vuelo2 = ItinerarioModelFactory.eINSTANCE.createVuelo();
		vuelo2.setNombre("AA002");
		vuelo2.setOrigen("Bogotá");
		vuelo2.setDestino("Barcelona");

		itinerario.getVuelos().add(vuelo1);
		itinerario.getVuelos().add(vuelo2);
		System.out.print(vuelo1);
		System.out.print(vuelo2);

	}
	
}
