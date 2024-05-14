package org.lesson.java.inheritance;

public class Smartphone extends Prodotto {
	private String imei;
	private  int memoria;
	
	public Smartphone (String nome, String marca, double prezzo, double iva, String imei, int memoria) {
		super(nome, marca, prezzo, iva);//parola chiave per richiamare oggetti della classe principale
		this.imei = imei;
		this.memoria = memoria;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	 
	
	
}