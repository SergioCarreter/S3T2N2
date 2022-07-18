package n2ex1;

import java.util.ArrayList;

public class TiendaZapatos {
	
	private int numTienda;
	ArrayList<Pago> pagos;
	
	public TiendaZapatos(int numtienda) {
		this.numTienda = numTienda;
		pagos = new ArrayList<>();
	}
	
	public void a�adePago( Pago pago ) {
		pagos.add(pago);
	}
	
	public void pagarpedido( Pago pago) {
		a�adePago(pago);
		
		Callback callback = () -> {
			System.out.println("Pago recibido");
		};
		
		pago.ejecutarConCallback(callback);
		
	}

}
