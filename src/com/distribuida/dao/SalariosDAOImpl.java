package com.distribuida.dao;

import org.springframework.stereotype.Repository;
import java.util.List;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.distribuida.entities.Salarios;
@Repository
public class SalariosDAOImpl implements SalariosDAO {

	//SELECT *FROM Factura --->>SQL
		//from Factura  --->>HQL
		//SELECT cl.* FROM Factura AS cl --->>> SQL
		//SELECT CL FROM Factura cl  ----HQL
		@Autowired
		private SessionFactory sessionFactory;
		@Override
		@Transactional
		////ACTUALIZACION
		public List<Salarios> findAll(){
			//
			Session session = sessionFactory.getCurrentSession();
			
			return session.createQuery("from Facturadetalle",Salarios.class).getResultList();
			
		}
		
		

	@Override
		@Transactional
		public Salarios findOne(int id) {
			// TODO Auto-generated method stub
			Session session =sessionFactory.getCurrentSession();
			return session.get(Salarios.class,id);
		}

	@Override
		@Transactional
		public void add(Salarios facturadetalle) {
		Session session=sessionFactory.getCurrentSession();	// TODO Auto-generated method stub
		session.saveOrUpdate(facturadetalle);}
		
		@Override
		@Transactional
		public void up(Salarios facturadetalle) {
			Session session=sessionFactory.getCurrentSession();	// TODO Auto-generated method stub
			session.saveOrUpdate(facturadetalle);
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
