
public class PlayerOne extends Player {
	
	public PlayerOne () {
		
	}
	
	public PlayerOne (String name) {
		setTurnChoice(Roshambo.ROCK);
		setName(name);
	}
	
	@Override
	public Roshambo generateRoshambo() {
		setTurnChoice(Roshambo.ROCK);
		return getTurnChoice();
	}

}