package com.distribuida.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name= "empleados")
public class Empleados {
	//@OneToOne
		//@ManyToOne
		//@OneToMany
		@Id
		@GeneratedValue(strategy =  GenerationType.IDENTITY)
		
	@Column(name="empleado_id")
	private int empleadoid;
		@Column(name="nombre")
	private String nombre;
		@Column(name="apellido")
	private String apellido;
		@Column(name="cedula")
	private String cedula;
		@Column(name="email")
	private String email;
		@Column(name="telefono")
	private String telefono;
		@Column(name="genero")
		private String genero;
		@Column(name="discapacidad")
		private String discapacidad;
		@Column(name="estado_civil")
		private String estadocivil;

		
	//@JoinColumn(name ="salarios_id")
	//@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})//persisten y detach viene asocado con una insercion de dats
	//private Salarios;
	//@JoinColumn(name ="departamento_id")
	//@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})//persisten y detach viene asocado con una insercion de dats
	//private Empleados empleados;
 public Empleados() {
		// TODO Auto-generated constructor stub
	}


public Empleados(int empleadoid, String nombre, String apellido, String cedula, String email, String telefono,
			String genero, String discapacidad, String estadocivil) {
		
		this.empleadoid = empleadoid;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.email = email;
		this.telefono = telefono;
		this.genero = genero;
		this.discapacidad = discapacidad;
		this.estadocivil = estadocivil;
	}


public int getEmpleado() {
	return empleado;
}


public void setEmpleado(int empleado) {
	this.empleadoid = empleado;
}
public int getEmpleadoid() {
	return empleadoid;
}


public void setEmpleadoid(int empleadoid) {
	this.empleadoid = empleadoid;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getApellido() {
	return apellido;
}


public void setApellido(String apellido) {
	this.apellido = apellido;
}


public String getCedula() {
	return cedula;
}


public void setCedula(String cedula) {
	this.cedula = cedula;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getTelefono() {
	return telefono;
}


public void setTelefono(String telefono) {
	this.telefono = telefono;
}


public String getGenero() {
	return genero;
}


public void setGenero(String genero) {
	this.genero = genero;
}


public String getDiscapacidad() {
	return discapacidad;
}


public void setDiscapacidad(String discapacidad) {
	this.discapacidad = discapacidad;
}


public String getEstadocivil() {
	return estadocivil;
}


public void setEstadocivil(String estadocivil) {
	this.estadocivil = estadocivil;
}


@Override
public String toString() {
	return "Empleados [empleadoid=" + empleadoid + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula="
			+ cedula + ", email=" + email + ", telefono=" + telefono + ", genero=" + genero + ", discapacidad="
			+ discapacidad + ", estadocivil=" + estadocivil + "]";
}
 

}
