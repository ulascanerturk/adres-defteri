package com.ulascan.adresdefteri.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ulascan.adresdefteri.entity.Kisiler;

@Repository
public class KisilerDAOImpl implements KisilerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List <Kisiler> kisileriAl(){
		
		Session simdi = sessionFactory.getCurrentSession();
		
		Query<Kisiler> sorgu = simdi.createQuery("from Kisiler", Kisiler.class);
		
		List<Kisiler> kisiler = sorgu.getResultList();
		
		return kisiler;
	}

	@Override
	@Transactional
	public void kisiKaydet(Kisiler kisiler) {
		
		Session simdi = sessionFactory.getCurrentSession();
		
		simdi.saveOrUpdate(kisiler);
		
		
	}

	@Override
	@Transactional
	public Kisiler kisiAl(int id) {
		
		Session simdi = sessionFactory.getCurrentSession();
		
		Kisiler kisiler = simdi.get(Kisiler.class, id);
		
		return kisiler;
	}

	@Override
	@Transactional
	public void kisiSil(int id) {
		
		Session simdi = sessionFactory.getCurrentSession();
		
		Query sorgu = simdi.createQuery("delete from Kisiler where id=:kisiId");
		
		sorgu.setParameter("kisiId", id);
		
		sorgu.executeUpdate();
		
		
	}

}
