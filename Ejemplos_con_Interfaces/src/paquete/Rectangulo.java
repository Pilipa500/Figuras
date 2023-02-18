package paquete;

public class Rectangulo implements IFigura{
	//
	private int base;
	private int altura;
	
	//constructor
	public Rectangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	//set y getter

	public int getLado1() {
		return base;
	}

	public void setLado1(int base) {
		this.base = base;
	}

	public int altura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	@Override
	public double getArea() {
		double getArea=base * altura;
		return getArea;
	}
	
}
