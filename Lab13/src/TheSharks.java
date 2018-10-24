
import java.util.Random;

public class TheSharks extends Player{
	TheSharks() {
        playerName = "TheSharks";
        Random random = new Random();
        int value = random.nextInt(3);
        if (value == 0) {
            RoshamboValue = Roshambo.ROCK;
        } else if (value == 1) {
            RoshamboValue = Roshambo.PAPER;
        } else if (value == 2) {
            RoshamboValue = Roshambo.SCISSOR;
        }
    }

    @Override
    public Roshambo generateRoshambo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


	


