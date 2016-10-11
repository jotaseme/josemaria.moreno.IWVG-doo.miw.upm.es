package es.upm.miw.iwvg.doo.Models;


public class WasteStack extends CardStack{
	private static final long serialVersionUID = 1L;
	
	public WasteStack(){
		super();
	}

	@Override
	public boolean checkMove(CardStack fromStack, CardStack toStack) {
		if(fromStack.empty()){
			return false;	
		}else{
			return true;
		}
	}	
}
