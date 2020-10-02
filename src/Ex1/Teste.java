package Ex1;

public class Teste {

	public static void main(String[] args) {
		
		Circulo cir = new Circulo(5);
		Quadrado qua = new Quadrado(4);
		Retangulo ret = new Retangulo(4, 8);
		
		System.out.println(cir.calculaArea() + " " + qua.calculaArea() + " " + ret.calculaArea());	}
	
}

