
public enum Roshambo {
    ROCK,PAPER,SCISSOR;
    public String toString(){
        String value="";
        switch(this){
            case ROCK:
                value= "Rock";
                break;
            case PAPER:
                value= "Paper";
                break;
            case SCISSOR:
                 value= "Scissor";    
        }
        return value;
    }
}
