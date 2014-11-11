package com.project.propiedadraiz.data;
import com.project.propiedadraiz.support.to.PropiedadTO;

public class IngresoPropiedad {

	
	PropiedadTO propiedadIngresada;
	public IngresoPropiedad(PropiedadTO propiedad){
		propiedadIngresada=propiedad;
		IngresarPropiedad();
	}
	private void IngresarPropiedad() {
		System.out.println("IngresarPropiedad");
		IngresoPropiedadDAO instance= new IngresoPropiedadDAO(propiedadIngresada);
		instance.crearPropiedad();
		
	}
}
