package Singleton.ex3_1;

public class TestSingleton {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Incremental inc = Incremental.getInstance();
			System.out.println(inc);
		}
	}
}