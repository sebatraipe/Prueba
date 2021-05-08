package ar.unrn.bd;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ar.unrn.modelo.RepositorioVentasRealizadas;
import ar.unrn.modelo.Ventas;

public class JdbcVentasRealizadas implements RepositorioVentasRealizadas {

	private Connection dbConn;

	private Connection setupBaseDeDatos() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/participantes?useSSL=false";
		String user = "root";
		String password = "1234";
		return DriverManager.getConnection(url, user, password);
	}

	@Override
	public void registrarNuevaVenta(Ventas venta) {
		try {
			this.dbConn = setupBaseDeDatos();
			PreparedStatement st = dbConn
					.prepareStatement("insert into ventas(fecha, litrosCargados, montoFacturado)values(?,?,?)");
			st.setDate(1, Date.valueOf(venta.obtenerFecha()));
			st.setInt(2, venta.obtenerLitrosCargados());
			st.setFloat(3, venta.obtenerMontoFacturado());

		} catch (SQLException e) {
			throw new RuntimeException("Error. " + e.getMessage());
		}
	}
}