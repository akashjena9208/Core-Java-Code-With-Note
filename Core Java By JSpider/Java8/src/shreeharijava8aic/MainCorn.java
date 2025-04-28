package shreeharijava8aic;

class Popcorn {
	void taste() {
		System.out.println("Tastes Blande");
	}
}

public class MainCorn {
	public static void main(String[] args) {
		Popcorn normal = new Popcorn();
		normal.taste();

		Popcorn saltpopcorn = new Popcorn() {

			@Override
			void taste() {
				System.out.println("Salt Popcorn");
			}
		};
		
		saltpopcorn.taste();

	}

}
