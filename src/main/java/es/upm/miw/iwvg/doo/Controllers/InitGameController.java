package es.upm.miw.iwvg.doo.Controllers;

import java.util.ArrayList;
import java.util.Collections;

import es.upm.miw.iwvg.doo.Models.Card;
import es.upm.miw.iwvg.doo.Models.CardType;
import es.upm.miw.iwvg.doo.Models.FoundationStack;
import es.upm.miw.iwvg.doo.Models.FoundationType;
import es.upm.miw.iwvg.doo.Models.StockStack;
import es.upm.miw.iwvg.doo.Models.TableauStack;
import es.upm.miw.iwvg.doo.Models.WasteStack;

public class InitGameController {

	private StockStack stockStack;
	private WasteStack wasteStack;
	private ArrayList<TableauStack> tableaus;
	private ArrayList<FoundationStack> foundations;

	public InitGameController() {

		stockStack = new StockStack();
		wasteStack = new WasteStack();

		tableaus = new ArrayList<TableauStack>();

		stacksInizialization(stockStack, tableaus);

		foundations = new ArrayList<FoundationStack>();
		
		for (FoundationType foundationType:FoundationType.values()) {
			foundations.add(new FoundationStack(foundationType));
		}
	}

	public void stacksInizialization(StockStack stockStack, ArrayList<TableauStack> tableauStack) {

		for (CardType cardType : CardType.values()) {
			for (int i = Card.MIN_VALUE; i <= Card.MAX_VALUE; i++) {
				stockStack.push(new Card(i, cardType));
			}
		}
		Collections.shuffle(stockStack);

		for (int i = 0; i < StockStack.NUM_TABLEAU_STACKS; i++) {
			tableauStack.add(new TableauStack());
			for (int j = 0; j < i + 1; j++) {
				tableauStack.get(i).push(stockStack.pop());
			}
			tableauStack.get(i).peek().setHidden(false);
		}

	}

	public ArrayList<TableauStack> getTableau() {
		return this.tableaus;

	}
	
	public StockStack getStockStack() {
		return this.stockStack;

	}
	
	public WasteStack getWasteStack(){
		return this.wasteStack;
		
	}
	
	public ArrayList<FoundationStack> getFoundation() {
		return this.foundations;

	}
	

}
