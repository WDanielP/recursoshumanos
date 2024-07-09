package com.distribuida.principal;



import org.springframework.context.support.ClassPathXmlApplicationContext;



import com.distribuida.dao.SalariosDAO;
import com.distribuida.dao.EmpleadosDAO;
import com.distribuida.entities.Salarios;


public class PrincipalSalarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

		//Patron de Ioc o Inversion de control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");//esete es el contenedor
		SalariosDAO facturadetalleDAO = context.getBean("salariosDAOImpl",SalariosDAO.class);//este en minuscula si no no funciona
		//CRUD CREEATE READ UPDATE Y DELETE
		EmpleadosDAO facturaDAO=context.getBean("empleadosDAOImpl",EmpleadosDAO.class);
		SalariosDAO libroDAO=context.getBean("salariosDAOImpl",SalariosDAO.class);
		//add
		Salarios salarios = new Salarios(0,"sa","234","123","34","89","65","43","34","44");
		salarios.setsalarios(SalariosDAO.findOne(2));
		facturadetalleDAO.add(salarios);
	
			
		//UPDATE ACTUALIZADO
		
 /*Facturadetalle facturadetalle2 = new Facturadetalle ();
	facturadetalle2.setFactura(facturaDAO.findOne(2));
	facturadetalle2.setLibro(libroDAO.findOne(2));
	facturadetalleDAO.up(facturadetalle2);
		*/
		//del BORRADO
		facturadetalleDAO.del(210);
		//findOne
		
		
	//	System.out.println("************DEL*******"+facturadetalleDAO.findOne(86));
		//findAll
		//List<Factura> Facturas= FacturaDAO.findAll();	
		facturadetalleDAO.findAll().forEach(item -> {System.out.println(item.toString());});
				
		context.close();
	}
	

}
