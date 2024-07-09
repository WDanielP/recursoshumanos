package com.distribuida.principal;



import org.springframework.context.support.ClassPathXmlApplicationContext;



import com.distribuida.dao.SalariosDAO;
import com.distribuida.dao.EmpleadosDAO;
import com.distribuida.entities.Empleados;
import com.distribuida.entities.Salarios;


public class PrincipalSalarios {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");//esete es el contenedor
		SalariosDAO salariosDAO = context.getBean("salariosDAOImpl",SalariosDAO.class);//este en minuscula si no no funciona
		//CRUD CREEATE READ UPDATE Y DELETE
		//add agregado
		Salarios salarios = new Salarios ();
		salariosDAO.add(salarios);
	
			
		//UPDATE ACTUALIZADO
		Salarios salarios1= new Salarios();
		//del BORRADO
		salariosDAO.del(2);
		//findOne
		
		
	//	System.out.println("************DEL*******"+SalariosDAO.findOne(2));
		//findAll
		//List<Salarios> Salarios= salariosDAO.findAll();	
		salariosDAO.findAll().forEach(item -> {System.out.println(item.toString());});
				
		context.close();
	}
	

}
