package pandora;

public class Calculadora {
	public double SomaInteiros(double a, double b) {
		return a + b;
	}
	
	public double subtraInteiros(double a, double b) {
        return a - b;
    }
	
	public double multiplicaInteiros(double a, double b) {
        return a * b;
    }
	
	public double dividiInteiros(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Impossível dividir por zero");
        }
        return a / b;
    }
	


}
