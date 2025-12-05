package Ejercicios;

public class Circunferencia {
	private float radio;
	private final float Pi = (float) 3.1416;

	public Circunferencia(float radio) {
		super();
		this.radio = radio;
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	public float getPi() {
		return Pi;
	}

	public float calcularDiametro() {
		float diametro = 2 * radio;
		return diametro;
	}
	public float calcularArea() {
		float area = (float)Math.pow(radio, 2);
		return area;
	}
	public float calcularLongitud() {
		float longitud = 2 * Pi * radio;
		return longitud;
		
	}

	@Override
	public String toString() {
		return "Circunferencia [radio=" + radio + ", calcularDiametro()=" + calcularDiametro() + ", calcularArea()="
				+ calcularArea() + ", calcularLongitud()=" + calcularLongitud() + "]";
	}
	
}