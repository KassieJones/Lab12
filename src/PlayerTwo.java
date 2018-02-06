import java.util.Random;

public class PlayerTwo extends Player {
	
	public PlayerTwo() {
	}
	
	public PlayerTwo(String name) {
		setName(name);
		setTurnChoice(generateRoshambo());
	}
	
	@Override
	public Roshambo generateRoshambo() {
		Random rand = new Random();
		int choice = rand.nextInt(3) + 1;
		if (choice == 1) {
			setTurnChoice(Roshambo.ROCK);
		}
		else if (choice == 2) {
			setTurnChoice(Roshambo.PAPER);
		}
		else {
			setTurnChoice(Roshambo.SCISSORS);
		}
		return getTurnChoice();
	}

}