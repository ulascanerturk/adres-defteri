package com.ulascan.adresdefteri.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kisiler")
public class Kisiler {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="isim")
	private String isim;
	
	@Column(name="soyisim")
	private String soyisim;
	
	@Column(name="adres")
	private String adres;
	
	@Column(name="email")
	private String email;
	
	@Column(name="telefon")
	private String telefon;
	
	public Kisiler() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String adi) {
		this.isim = adi;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyadi) {
		this.soyisim = soyadi;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	

}
