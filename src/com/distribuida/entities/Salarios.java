package com.distribuida.entities;

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
@Table(name= "salarios")
public class Salarios {
	//@OneToOne
			//@ManyToOne
			//@OneToMany
			@Id
			@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name ="salario_id")
	private int salario_id;
	@Column(name="empleado_id")
	private int empleado_id;
	@Column(name="salario")
	private Double salario;
	@Column(name="quincena")
	private Double quincena;
	@Column(name="utilidades")
	private Double utilidades;
	@Column(name="aporteiess")
	private Double aporteiess;
	@Column(name="alimentacion")
	private Double alimentacion;
	@Column(name="transporte")
	private Double transporte;
	@Column(name="prestamos")
	private Double prestamos;
		
		
		
		
	 public Salarios() {
			// TODO Auto-generated constructor stub
		}




	public Salarios(int salario_id, int empleado_id, Double salario, Double quincena, Double utilidades,
			Double aporteiess, Double alimentacion, Double transporte, Double prestamos) {
		
		this.salario_id = salario_id;
		this.empleado_id = empleado_id;
		this.salario = salario;
		this.quincena = quincena;
		this.utilidades = utilidades;
		this.aporteiess = aporteiess;
		this.alimentacion = alimentacion;
		this.transporte = transporte;
		this.prestamos = prestamos;
	}




	public int getSalario_id() {
		return salario_id;
	}




	public void setSalario_id(int salario_id) {
		this.salario_id = salario_id;
	}




	public int getEmpleado_id() {
		return empleado_id;
	}




	public void setEmpleado_id(int empleado_id) {
		this.empleado_id = empleado_id;
	}




	public Double getSalario() {
		return salario;
	}




	public void setSalario(Double salario) {
		this.salario = salario;
	}




	public Double getQuincena() {
		return quincena;
	}




	public void setQuincena(Double quincena) {
		this.quincena = quincena;
	}




	public Double getUtilidades() {
		return utilidades;
	}




	public void setUtilidades(Double utilidades) {
		this.utilidades = utilidades;
	}




	public Double getAporteiess() {
		return aporteiess;
	}




	public void setAporteiess(Double aporteiess) {
		this.aporteiess = aporteiess;
	}




	public Double getAlimentacion() {
		return alimentacion;
	}




	public void setAlimentacion(Double alimentacion) {
		this.alimentacion = alimentacion;
	}




	public Double getTransporte() {
		return transporte;
	}




	public void setTransporte(Double transporte) {
		this.transporte = transporte;
	}




	public Double getPrestamos() {
		return prestamos;
	}




	public void setPrestamos(Double prestamos) {
		this.prestamos = prestamos;
	}




	@Override
	public String toString() {
		return "Salarios [salario_id=" + salario_id + ", empleado_id=" + empleado_id + ", salario=" + salario
				+ ", quincena=" + quincena + ", utilidades=" + utilidades + ", aporteiess=" + aporteiess
				+ ", alimentacion=" + alimentacion + ", transporte=" + transporte + ", prestamos=" + prestamos + "]";
	}
	
	 
}

