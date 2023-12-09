package telran.reflection.sportsman;

public class Runner implements Sportsman {
	int distance;

	public Runner(String distanceStr) {
		distance = Integer.parseInt(distanceStr);
	}

	@Override
	public void action() {
		System.out.printf("I'm running some %s distance", distance > 40 ? "Marathon" : "Distance" + "km ");

	}

}
