package com.distribuida.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Salarios;

@Repository
public interface SalariosDAO {


	public List<Salarios>findAll();
	
	public Salarios findOne(int id);
	public void add(Salarios salarios);
	public void up (Salarios salarios);
	public void del(int id);

}
