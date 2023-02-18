package paquete;

public class Circulo implements IFigura {
	
	private double radio;
	
	
	//constructor

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	//getter y setters


	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double getArea() {
		double getArea=IFigura.PI*Math.pow(radio, 2);
		return getArea;
	}

}
