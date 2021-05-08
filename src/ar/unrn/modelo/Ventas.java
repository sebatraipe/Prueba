package ar.unrn.modelo;

import java.time.LocalDate;

public class Ventas {

	private LocalDate fecha;
	private Integer litrosCargados;
	private float montoFacturado;

	public Ventas(LocalDate fecha, Integer litrosCargados, float montoFacturado) {
		this.fecha = fecha;
		this.litrosCargados = litrosCargados;
		this.montoFacturado = montoFacturado;
	}

	public LocalDate obtenerFecha() {
		return fecha;
	}

	public Integer obtenerLitrosCargados() {
		return litrosCargados;
	}

	public float obtenerMontoFacturado() {
		return montoFacturado;
	}
}