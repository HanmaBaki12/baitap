
package battap2808;
import java.util.Random;
import java.util.Scanner;   
public class Battap2808 {
        public static void main(String[] args) {
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);
        String check;
        int n;
        do{
            System.out.println("Enter Data (Yes or No):");
            check = keyboard.next();
            n = rand.nextInt(100-1+1)+1;
            if(n%2==0){
                System.out.println(n+ " la so chan!");
            } else {
                System.out.println(n+ " la so le!");
            }
        } while(check.equals("yes"));
    }
}
