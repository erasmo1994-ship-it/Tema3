package Ejercicios;

public class Rectangulo {
	private int base;
	private int altura;

	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo() {
		base = 5;
		altura = 7;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

}
