package Ex1;

public class Circulo implements AreaCalculavel{
	
	private double raio;

	@Override
	public double calculaArea() {
		
		return 3.14 * (this.getRaio() * this.getRaio());
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}
	
	

}
