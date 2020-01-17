package designPatterns.singleton.demo;

public class MakeACaptain {

	private static MakeACaptain captain;

	private MakeACaptain() {};

	public static MakeACaptain getCaptain() {

		if (captain == null) {

			captain = new MakeACaptain();
			System.out.println("New Captain selected!.\n");

		} else {
			
			System.out.println("You already have a Captain!.\n");

		}
		
		return captain;
	}
}
