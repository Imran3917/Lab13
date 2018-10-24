
import java.util.Scanner;

public class Validator {
	static Scanner scanner=new Scanner(System.in);
    public static char checkUserChoice(){
        char op=scanner.next().toLowerCase().charAt(0);
        while(op!='j' && op!='s'){
            System.out.print("Invailed choice..\nSelect (j/s)");
            op=scanner.next().toLowerCase().charAt(0);
        }
        return op;
    }
    
     public static char checkRoshamboChoice(){
        char op=scanner.next().toLowerCase().charAt(0);
        while(op!='r' && op!='s'&& op!='p'){
            System.out.print("Invailed choice..\nSelect (R/P/S)");
            op=scanner.next().toLowerCase().charAt(0);
        }
        return op;
    }
     
}



