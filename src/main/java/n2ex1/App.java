package n2ex1;

public class App {

	public static void main(String[] args) {
		
		TiendaZapatos tz1 = new TiendaZapatos(1);
		
		Pago pago = new Pago(122.45, Tipo.PAYPAL);
		
		tz1.pagarpedido(pago);

	}

}
