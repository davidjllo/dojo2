package com.project.propiedadraiz.support.to;

public class PropiedadTO {
	/* Valor se manejara en Millones y el predial y adminsitracion en miles de pesos */
private String nombre;
private String id;

private float valor;
private String descripcion;
private String ubicacion;
private float administracion;
private float predial;
private String venta;

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
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
public double getPredial() {
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

	
}
