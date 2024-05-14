package org.lesson.java.inheritance;



public class Prodotto extends Shop  {

	protected String nome;
	private String marca;
	private double prezzo;
	private double iva;
	
	

//costruttore
public  Prodotto (String nome, String marca, double prezzo, double iva ) {
	//inizializzazione
	this.nome = nome;
	this.marca = marca;
	this.iva = iva;
	this.prezzo = prezzo;
	
}



// Metodi getter e setter per gli altri attributi
public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getMarca() {
    return marca;
}

public void setMarca(String descrizione) {
    this.marca = marca;
}

public double getPrezzo() {
    return prezzo;
}

public void setPrezzo(double prezzo) {
    this.prezzo = prezzo;
}

public double getPrezzoBase() {
    return prezzo;
}

public double getPrezzoIva() {
	return prezzo * (1+iva);
}


public double getIva() {
    return iva;
}

public void setIva(double iva) {
    this.iva = iva;
}
}




