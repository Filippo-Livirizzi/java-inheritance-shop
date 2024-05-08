package org.lesson.java.inheritance;

/*
 * Creare la classe Prodotto che gestisce i prodotti dello shop. X
Un prodotto è caratterizzato da:
- codice (numero intero) X
- nomeX
- marcaX
- prezzo X
- iva X
Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
- il codice prodotto sia accessibile solo in lettura
- gli altri attributi siano accessibili sia in lettura che in scrittura
Lo shop gestisce diversi tipi di prodotto:
- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
- Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.
 */


import java.util.Random;
public class Prodotto  {
	private int codice;
	private String nome;
	private String marca;
	private double prezzo;
	private double iva;
	
//metodo per generare numeri random
	private int codeGenerator() {
		Random number = new Random();
		return number.nextInt(1001);
	}

//costruttore
public Prodotto (String nome, String marca, double prezzo, double iva ) {
	//inizializzazione
	this.nome = nome;
	this.marca = marca;
	this.iva = iva;
	this.prezzo = prezzo;
	this.codice = codeGenerator();
}

public int getCode() {
    return codice;
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

public class Smartphone extends Prodotto{
	private String IMEI;
	private double memoria;
	
	
	public  Smartphone(int codice, String nome, String marca, double prezzo, double iva, String imei, int memoria) {
		super(codice, marca, prezzo, iva, nome);
	
	}
}








