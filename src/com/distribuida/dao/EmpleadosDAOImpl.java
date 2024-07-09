package com.distribuida.dao;

import org.springframework.stereotype.Repository;
import java.util.List;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.distribuida.entities.Empleados;

@Repository

public class EmpleadosDAOImpl implements EmpleadosDAO {
	

	//SELECT *FROM Factura --->>SQL
	//from Factura  --->>HQL
	//SELECT cl.* FROM Factura AS cl --->>> SQL
	//SELECT CL FROM Factura cl  ----HQL
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	////ACTUALIZACION
	public List<Empleados> findAll(){
		//
		Session session = sessionFactory.getCurrentSession();
		
		return session.createQuery("from Empleados",Empleados.class).getResultList();
		
	}
	
	

	@Override
	@Transactional
	public Empleados findOne(int id) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.getCurrentSession();
		return session.get(Empleados.class,id);
	}

	@Override
	@Transactional
	public void add(Empleados empleados) {
	Session session=sessionFactory.getCurrentSession();	// TODO Auto-generated method stub
	session.saveOrUpdate(empleados);
	
	}

	@Override
	@Transactional
	public void up(Empleados empleados) {
		Session session=sessionFactory.getCurrentSession();	// TODO Auto-generated method stub
		session.saveOrUpdate(empleados);
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public void del(int id) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(findOne(id));
		// TODO Auto-generated method stub

	}
}
