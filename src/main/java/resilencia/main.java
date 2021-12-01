package resilencia;

public class main {
	public static void main(String[] args) {

		CircuitBreaker cb=new CircuitBreaker(5);
		
		cb.open();

	}
}
