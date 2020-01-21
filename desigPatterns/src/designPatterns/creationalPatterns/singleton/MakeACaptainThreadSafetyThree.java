package designPatterns.creationalPatterns.singleton;

public class MakeACaptainThreadSafetyThree {

	private static MakeACaptainThreadSafetyThree captain;

	private MakeACaptainThreadSafetyThree() {};

	// Standard method
	// Nested class is referenced after getCaptain() is called
	private static class SingletonHelper {

		private static final MakeACaptainThreadSafetyThree captain = new MakeACaptainThreadSafetyThree();
	}

	public static MakeACaptainThreadSafetyThree getCaptain() {
		return SingletonHelper.captain;
	}

}
