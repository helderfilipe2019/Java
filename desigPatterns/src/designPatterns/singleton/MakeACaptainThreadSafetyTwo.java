package designPatterns.singleton;

public class MakeACaptainThreadSafetyTwo {
	
	//Early initialization
	private static MakeACaptainThreadSafetyTwo captain = new MakeACaptainThreadSafetyTwo();
	
	private MakeACaptainThreadSafetyTwo() { };

	public static MakeACaptainThreadSafetyTwo getCaptain() {
		
	return captain;
	
	}

}
