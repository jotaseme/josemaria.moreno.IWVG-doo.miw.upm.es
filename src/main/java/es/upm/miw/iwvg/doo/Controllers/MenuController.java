package es.upm.miw.iwvg.doo.Controllers;

import java.util.ArrayList;

import es.upm.miw.iwvg.doo.Utils.IO;
import es.upm.miw.iwvg.doo.Utils.LimitedIntDialog;
import es.upm.miw.iwvg.doo.Views.MenuView;

public class MenuController {
	
	MenuView menuView = new MenuView();
	IO io = new IO();
	
	
	public int optionSelector(){
		return menuView.optionSelector(); 
	}
	
	public void renderOptions(){
		menuView.renderMenu();
		
		
		
	}
	

	

}
