package com.project.propiedadraiz.business;

import com.project.propiedadraiz.data.IngresoPropiedad;
import com.project.propiedadraiz.support.to.PropiedadTO;

public class PropiedadSubmission {
	
	public void submission(PropiedadTO propiedad) {
		
		IngresoPropiedad nuevaProp = new IngresoPropiedad(propiedad);
		nuevaProp.getClass();
		
	}
}
