package Ejercicios;

public class CuentaBancaria {
	public double dinero;
	public String nombrePropietario;
	public char divisa;
	
	private final double euroADolar = 0.86;
	private final double dolarAEuro = 0.86;
	private final double libraAEuro = 1.14;
	private final double euroALibra = 1.14;
	
	
	public CuentaBancaria(double dinero, String nombrePropietario, char divisa) {
	
		this.dinero = dinero;
		this.nombrePropietario = nombrePropietario;
		this.divisa = divisa;
		
	}
	public double getDinero() {
		return dinero;
	}
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	public String getNombrePropietario() {
		return nombrePropietario;
	}
	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}
	public char getDivisa() {
		return divisa;
	}
	public void setDivisa(char divisa) {
		this.divisa = divisa;
	}
	
	@Override
	public String toString() {
		return "CuentaBancaria [dinero=" + dinero + ", nombrePropietario=" + nombrePropietario + ", divisa=" + divisa
				+ "]";
	}
	
}
