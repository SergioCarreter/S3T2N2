package n2ex1;

public abstract class Tarea {

	public void ejecutarConCallback(Callback callback) {
		execute();
		callback.call();
	}
	
	public abstract void execute();

}
