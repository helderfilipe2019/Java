package designPatterns.creationalPatterns.singleton;

public class TestSingleton {

	public static void main(String[] args) {

		System.out.println("***Singleton Pattern Demo***\n");
		System.out.println("Trying to make a Captain.\n");
		MakeACaptain captain1 = MakeACaptain.getCaptain();
		System.out.println("Trying to make another Captain.\n");
		MakeACaptain captain2 = MakeACaptain.getCaptain();
		if (captain1 == captain2) {
			System.out.println("Captain-1 and Captain-2 are the same (instance).");
		}
	}

}
