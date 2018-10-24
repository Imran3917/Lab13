
public class UserPlayer extends Player {


    @Override
    public Roshambo generateRoshambo() {
        char value = Validator.checkRoshamboChoice();
        switch (value) {
            case 'r':
                RoshamboValue = Roshambo.ROCK;
                break;
            case 'p':
                RoshamboValue = Roshambo.PAPER;
                break;
            case 's':
                RoshamboValue = Roshambo.SCISSOR;
        }
        return RoshamboValue;
    }

}




