package org.lesson.java.inheritance;

public class Televisione extends Prodotto{
	private double dimensione;
	private boolean smart;
	
	public Televisione(String nome, String marca, double prezzo, double iva, String imei, int memoria) {
		super(nome, marca, prezzo, iva);
		this.dimensione = dimensione;
		this.smart = smart;
	}
	public double setDimensione (double dimensione) {
		return dimensione;
	}
	public double getDimensione () {
		return dimensione;
	}
	public boolean setSmart (boolean smart) {
		return smart;
	}
	public boolean getSmart () {
		return smart;
	}
}