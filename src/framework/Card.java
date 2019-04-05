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
	
	public int getNumber() { return number; }
	public String getSymbol() { return symbol; }
	
	public void setNumber(int num) { number = num; }
	public void setSymbol(String sym) { symbol = sym; }
}