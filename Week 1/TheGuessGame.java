import java.util.Scanner;
import java.util.Random;
public class TheGuessGame {
    public static void main(String args[]){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int x = random.nextInt(20)+1;
        System.out.println("guess the number game(between 1 and 20)");
        System.out.println("You get 5 tries");
        
    int result = 0;

        for(int i = 0; i < 5;i++){
         
           // System.out.println("-- " + x);
            int input = Integer.valueOf(scanner.nextLine());
            result = input;
           // System.out.println("-- " + input);
            if(input > x){
                System.out.println("your guess is to high");
            } else if(x > input){
                System.out.println("your guess is to low");
            } else{

                
                
                break;
            }
        }

        if (result == x){
            System.out.println("You win");
        } else{
            System.out.println("You lose");
        }


    }
    
}
