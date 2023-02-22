import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //take input from user S,P,R
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Please enter any S,P or R");
        char userMove = inputObj.next().charAt(0);
        System.out.println("User gave this input:-" + userMove);

        //make computer to make there move
//        String chars = "SPR";
//        Random rnd = new Random();
//        char c = chars.charAt(rnd.nextInt(chars.length()));
//        System.out.println("computer choose:-" + c);

        char[] arr = {'S', 'P' ,'R'};
        Random random = new Random();
        int guessNumber = random.nextInt(3);
        char computerMove = arr[guessNumber];
        System.out.println("Computer move>>" + computerMove);


        //computer = user -> draw!!!
        if (userMove == computerMove) {
            System.out.println("Draw");
        }
        //user "S"
            //computer "R" -: Computer wins!!
            //user wins
        else if (userMove == 'S' && computerMove == 'R') {
            System.out.println("Computer Wins");
        }

        //user "P"
            //computer "R" -: User wins!!
            //computer wins!!
        else if (userMove == 'P' && computerMove == 'R') {
            System.out.println("Computer Wins");
        }
        //User "R"
            //computer "S" -: User wins!!
            //computer wins
          else {
            System.out.println("User Wins");
        }

    }
}