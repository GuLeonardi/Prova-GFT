package Ex1;

public class Quadrado implements AreaCalculavel {
	
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		return this.getLado() * this.getLado();
	}

	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}
	
	
}
