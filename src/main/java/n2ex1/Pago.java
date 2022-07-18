package n2ex1;

public class Pago extends Tarea{
	
	double cantidad;
	Tipo tipo;
	
	public Pago(double cantidad, Tipo tipo) {
		this.cantidad = cantidad;
		this.tipo = tipo;
	}

	@Override
	public void execute() {
		
		switch (tipo) {
		case TARJETA:
			System.out.println("Pagando el pedido con importe: " + cantidad + " mediante TARJETA");
			break;
		case PAYPAL:
			System.out.println("Pagando el pedido con importe: " + cantidad + " mediante PAYPAL");
			break;
		case TRANSFERENCIA:
			System.out.println("Pagando el pedido con importe: " + cantidad + " mediante TRANSFERENCIA");
			break;
		}
		System.out.println("Llamando al Callback");
	}

}
