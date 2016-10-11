package es.upm.miw.iwvg.doo.Models;

import java.util.ArrayList;

import es.upm.miw.iwvg.doo.Controllers.Controller;

public abstract class Option extends Controller{
	
	public Option(Game game) {
		super(game);
	}
	
	public void getMovement(){		
	}

	public String getOpcion(){
		return null;		
	}
	
	public ArrayList<Option> getOptionList(){
		return null;
	}

}
