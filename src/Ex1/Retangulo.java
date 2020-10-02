package Ex1;

public class Retangulo implements AreaCalculavel {
	
	private double altura;
	private double lado;

	@Override
	public double calculaArea() {
		return this.getAltura() * this.getLado();
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public Retangulo(double altura, double lado) {
		super();
		this.altura = altura;
		this.lado = lado;
	}
	
	
	
	
}
