package com.distribuida.principal;

import java.util.Date;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.EmpleadosDAO;
import com.distribuida.dao.EmpleadosDAO;
import com.distribuida.entities.Empleados;

public class PrincipalEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Patron de Ioc o Inversion de control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");//esete es el contenedor
		EmpleadosDAO empleadosDAO = context.getBean("empleadosDAOImpl",EmpleadosDAO.class);//este en minuscula si no no funciona
		//CRUD CREEATE READ UPDATE Y DELETE
		EmpleadosDAO empleadosDAO=context.getBean("empleadosDAOImpl",empleadosDAO.class);
		//add
		Empleados empleados = new Empleados ();
		empleados.setEmpleados(empleadosDAO.findOne(2));
		empleadosDAO.add(empleados);
		
		
		//UPDATE ACTUALIZADO
		
	//	Empleados empleados2 = new Empleados ();
	//	empleados2.setEmpleados(empleadosDAO.findOne(3));
		//empleadosDAO.up(empleados2);
		
		//del BORRADO
	//	empleadosDAO.del(86);
		//findOne
		
		
		System.out.println("************DEL*******"+empleadosDAO.findOne(86));
		//findAll
		//List<Empleados> Empleados= EmpleadosDAO.findAll();	
		empleadosDAO.findAll().forEach(item -> {System.out.println(item.toString());});
				
		context.close();
	}

}
