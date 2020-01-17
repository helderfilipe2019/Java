package desigPatterns.singleton.demo.threadSafety;

public class MakeACaptainThreadSafetyOne {

	private static MakeACaptainThreadSafetyOne captain;

	private MakeACaptainThreadSafetyOne() {};

	// pay for the performance
	public static synchronized MakeACaptainThreadSafetyOne getCaptain() {

		if (captain == null) {

			captain = new MakeACaptainThreadSafetyOne();
			System.out.println("New Captain selected!.\n");

		} else {

			System.out.println("You already have a Captain!.\n");

		}

		return captain;
	}

}
