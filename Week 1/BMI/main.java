import java.util.Scanner;

import javax.print.DocFlavor.STRING;
public class main {
    //Exercise 2
    public static void main(String[] args){

        System.out.println("what is your height");
        Scanner scanner =  new Scanner(System.in);
        float height = scanner.nextFloat();
        System.out.println("What's your weight");
        float weight = scanner.nextFloat();

        IBM a = new IBM(height, weight);

        a.BMI();

    }
}
