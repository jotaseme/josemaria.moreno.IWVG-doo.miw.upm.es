package es.upm.miw.iwvg.doo.Models;


public class FoundationStack extends CardStack {

	private static final long serialVersionUID = 1L;
	private FoundationType foundationType;

	public FoundationStack(FoundationType foundationType) {

		this.foundationType = foundationType;
	}

	public FoundationType getFoundationType() {
		return foundationType;
	}

	@Override
	public boolean checkMove(CardStack from, CardStack to) {
		// TODO Auto-generated method stub
		return true;
	}
	
	

}
