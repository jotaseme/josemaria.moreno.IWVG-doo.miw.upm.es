package es.upm.miw.iwvg.doo.Controllers;

import es.upm.miw.iwvg.doo.Models.Game;

public abstract class Controller {
	protected Game game;

	protected Controller(Game game) {
		assert game != null;
		this.game = game;
	}
}
