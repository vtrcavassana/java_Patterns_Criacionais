package Singleton.ex3_2;

public class TestSingleton2 {
	public static void main(String args[]) {
		Deck deck = Deck.getInstance();
		deck.print();
	}
}