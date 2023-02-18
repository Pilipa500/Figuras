package paquete;

public class Programa {

	public static void main(String[] args) {
		// Crear un array que contenga Figuras de diferentes tipos.
		// Recorrer el array para mostrar la figura con mayor area de todas.
		IFigura[] figuras = new IFigura[3];

		figuras[0] = new Rectangulo(3, 5);
		figuras[1] = new Circulo(2);
		figuras[2] = new Rectangulo(8, 2);

		IFigura figuraMayorArea = figuras[0];

		for (int i = 1; i < figuras.length; i++) {
			if (figuras[i].getArea() > figuraMayorArea.getArea()) {
				figuraMayorArea = figuras[i];
			}
		}
		System.out.println("La figura con mayor area es: " + figuraMayorArea.getClass().getSimpleName()
				+ " y su area es " + figuraMayorArea.getArea());
	}

}
