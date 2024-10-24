package controladores;

import java.io.IOException;
import java.sql.Connection;
import servicios.ConexionInterfaz;
import servicios.ConexionImplementacion;


public class Inicio {
	
	

	//Método principal de acceso a la aplicacion
	public static void main(String[] args) throws IOException {
		
		ConexionInterfaz cbd =  new ConexionImplementacion();
		Connection conexion = cbd.abrirConexion();
		  cbd.cerrarConexion();
	}
	}