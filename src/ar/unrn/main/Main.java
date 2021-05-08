package ar.unrn.main;

import java.time.LocalDate;

import ar.unrn.ui.UI;

public class Main {

	public static void main(String[] args) {

		System.out.println(LocalDate.now().getDayOfWeek());

//		Combustible combustibleSuper = new CombustibleSuper("Super", 25);

		UI ui = new UI();
		ui.setVisible(true);

	}

}
