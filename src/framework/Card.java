public class Card {
	private int number;
	private String symbol;
	
	Card(int num, String sym) {
		number = num;
		symbol = sym;
	}
	
	Card() {
		number = 0;
		symbol = "";
	}
	
	@Override
	public boolean equals(Object o) {
		
		if(o == this) return true;
		
		if(!(o instanceof Card)) return false;
		
		return ((Card) o).getNumber() == number && ((Card) o).getSymbol().equals(symbol);
	}
	
	public int getNumber() { return number; }
	public String getSymbol() { return symbol; }
	
	public void setNumber(int num) { number = num; }
	public void setSymbol(String sym) { symbol = sym; }
}