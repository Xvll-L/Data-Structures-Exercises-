import java.util.ArrayList;
import java.util.Scanner;



public class acrostic {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        while (true){
            Scanner scan = new Scanner(System.in);
            String value = scan.nextLine();
            if(value.equals("")){
                break;
                
            strings.add(value.charAt(0));
            }
        }

        for(String i: strings){
            System.out.println(i);
        }
    }
    
}
