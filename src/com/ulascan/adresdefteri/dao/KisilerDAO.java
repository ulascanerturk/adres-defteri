package com.ulascan.adresdefteri.dao;

import java.util.List;

import com.ulascan.adresdefteri.entity.Kisiler;

public interface KisilerDAO {
	
	public List<Kisiler> kisileriAl();

	public void kisiKaydet(Kisiler kisiler);

	public Kisiler kisiAl(int id);

	public void kisiSil(int id);

}
