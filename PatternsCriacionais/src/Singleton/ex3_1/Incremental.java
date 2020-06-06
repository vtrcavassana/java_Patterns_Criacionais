package Singleton.ex3_1;

public class Incremental {
	private static int count = 0;
	private static int num;

	private static Incremental inc = null;
	
	private Incremental() {}

	public static synchronized Incremental getInstance() {
		if (inc == null) {
			inc = new Incremental();
		}
		num = ++count;
		return inc;
	}
	
	public String toString() {
		return "Incrementando: " + num;
	}
}