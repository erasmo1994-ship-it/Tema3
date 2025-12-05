package Ejercicios;

public class Ejercicio6 {
	private String nombreU;
	private String dni;
	private String domicilio;
	private int dinero;

	public Ejercicio6(String nombreU, String dni, String domicilio, int dinero) {

		this.nombreU = nombreU;
		this.dni = dni;
		this.domicilio = domicilio;
		this.dinero = dinero;
	}

	public Ejercicio6(String nombreU, String dni, String domicilio) {
		this.nombreU = nombreU;
		this.dni = dni;
		this.domicilio = domicilio;
		dinero = 0;
	}

	public String getNombreU() {
		return nombreU;
	}

	public void setNombreU(String nombreU) {
		this.nombreU = nombreU;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public boolean calcularCantidad(int dineroIngresar) {
		if (dineroIngresar < 0) {
			System.out.println("Error");

		} else {
			dinero = dinero + dineroIngresar;
			return true;
		}
		return false;

	}
public boolean sacarDinero1 ( int dineroSacar) {
	if(dineroSacar > 0) {
		System.out.println("No puede sacar esa cantidad");
		return false;
	}else if(dineroSacar < 0) {
		System.out.println("No puede sacar una cantidad negativa");
		return false;
	}else {
		dinero = dinero - dineroSacar;
		return true;
	}
}
@Override
	public String toString() {
		return "Ejercicio6 [nombreU=" + nombreU + ", dni=" + dni + ", domicilio=" + domicilio + ", dinero=" + dinero
				+ "]";
	}

public boolean ingresarDinero(int dineroIngresar) {
	return false;
}

public boolean sacarDinero(int dineroIngresar) {
	// TODO Auto-generated method stub
	return false;
}

}
