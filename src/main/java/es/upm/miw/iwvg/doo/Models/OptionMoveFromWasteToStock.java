package es.upm.miw.iwvg.doo.Models;

public class OptionMoveFromWasteToStock extends Option {
	String option;
	public OptionMoveFromWasteToStock(Game game) {
		super(game);
		option = "2. Mover de descarte a baraja";
	}

	@Override
	public void getMovement() {
		
	}

	@Override
	public String getOpcion() {
		return option;
	}

}
