package org.lesson.java.inheritance;

public class Cuffie extends Prodotto{
	private String colore;
	private boolean cablate;
	
	public Cuffie(String nome, String marca, double prezzo, double iva, String imei, int memoria) {
		super(nome, marca, prezzo, iva);
		this.colore = colore;
		this.cablate = cablate;
	}
	public String setColore (String colore) {
		return colore;
	}
	public String getColore () {
		return colore;
	}
	public boolean setCablate(boolean cablate) {
		return cablate;
	}
	public boolean getCablate () {
		return cablate;
	}
}