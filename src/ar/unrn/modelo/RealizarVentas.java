package ar.unrn.modelo;

public class RealizarVentas {

	private Combustible combustible;
	private RepositorioVentasRealizadas repo;

	public RealizarVentas(Combustible combustible, RepositorioVentasRealizadas repo) {
		this.combustible = combustible;
		this.repo = repo;
	}

	public void realizarCompra() {
//		repo.registrarNuevaVenta(new Ventas(LocalDate.now(), combustible.obtenerLitrosCargados(), 0));
	}

}
