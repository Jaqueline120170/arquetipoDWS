package servicios;

import java.io.IOException;
import java.sql.Connection;

public interface ConexionInterfaz {
	
	public Connection abrirConexion()throws IOException;
	public void cerrarConexion()throws IOException;
}