package com.distribuida.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.distribuida.entities.Empleados;
@Repository
public interface EmpleadosDAO {

	public List<Empleados>findAll();
	
	
	public Empleados findOne(int id);
	public void add(Empleados empleados);
	public void up (Empleados empleados);
	public void del(int id);
}
