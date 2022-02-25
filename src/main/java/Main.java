/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
       Main newObject = new Main();
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter your name: ");
       String input = scanner.next();
       newObject.sendMessage(input);
       scanner.close();
    }

    public void sendMessage(String string){
        if (equals(string)){
            System.out.println("Hello!");
        }
    }

    public boolean equals(String arg) {
        String compare = arg.toUpperCase();
        if ((compare.equals("ALICE")) || (compare.equals("BOB"))){
            return true;
        }else return false;

    }
}
