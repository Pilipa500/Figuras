package paquete;

public class Rectangulo implements IFigura{
	//
	int lado1;
	int lado2;
	
	//constructor
	public Rectangulo(int lado1, int lado2) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	//set y getter

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}
	@Override
	public double getArea() {
		double getArea=lado1 * lado2;
		return getArea;
	}
	
}
