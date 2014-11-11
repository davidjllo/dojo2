package com.project.propiedadraiz.web.data;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.project.propiedadraiz.business.PropiedadSubmission;
import com.project.propiedadraiz.support.to.PropiedadTO;

@ManagedBean
@ViewScoped
public class Propiedad implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String id;
	private float valor;
	private String descripcion;
	private String ubicacion;
	private float administracion;
	private float predial;
	private String venta="venta";
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public float getAdministracion() {
		return administracion;
	}

	public void setAdministracion(float administracion) {
		this.administracion = administracion;
	}

	public float getPredial() {
		return predial;
	}

	public void setPredial(float predial) {
		this.predial = predial;
	}

	public String getVenta() {
		return venta;
	}

	public void setVenta(String venta) {
		this.venta = venta;
	}

	public void enviardata(){
		
		System.out.println(id+administracion+valor+ubicacion+nombre+venta);
		PropiedadTO propiedad = new PropiedadTO();
		propiedad.setAdministracion(administracion);
		propiedad.setDescripcion(descripcion);
		propiedad.setId(id);
		propiedad.setNombre(nombre);
		propiedad.setPredial(predial);
		propiedad.setUbicacion(ubicacion);
		propiedad.setValor(valor);
		propiedad.setVenta(venta);
				
		PropiedadSubmission prop= new PropiedadSubmission();
		prop.submission(propiedad);
		
	}
}
