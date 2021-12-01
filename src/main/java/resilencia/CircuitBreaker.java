package resilencia;

public class CircuitBreaker {
	private int numero;

	public CircuitBreaker(int numero) {
		super();
		this.numero = numero;
	}

	public void close() {
		System.out.println("FIN DE INTENTOS");
	}

	public void open() {
		for (int i = 0; i < numero; i++) {
			halfOpen();
		}
		close();
	}

	public void halfOpen() {
		System.out.println("Esperando..");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}
}
