package com.project.propiedadraiz.data;
import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.project.propiedadraiz.support.to.PropiedadTO;


public class IngresoPropiedadDAO {
	private MongoClient mongo;
	private DB db;
	private PropiedadTO propiedad;
	public IngresoPropiedadDAO(PropiedadTO propiedadIngresada){
		propiedad = propiedadIngresada;
		try {
			mongo = new MongoClient("localhost", 27017);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		db = mongo.getDB("propiedades");
	}
	
	public void crearPropiedad(){
		DBCollection prop = db.getCollection("propiedades");
		BasicDBObject document = new BasicDBObject();
		document.put("id", propiedad.getId());
		document.put("nombre", propiedad.getNombre());
		document.put("valor", propiedad.getValor());
		document.put("descripcion", propiedad.getDescripcion());
		document.put("ubicacion", propiedad.getUbicacion());
		document.put("administracion", propiedad.getAdministracion());
		document.put("predial", propiedad.getPredial());
		document.put("venta", propiedad.getVenta());
		prop.insert(document);
		System.out.println(propiedad.getNombre());
	}
}
