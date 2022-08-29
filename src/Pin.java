import java.util.*;
public class Pin {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int pin = 621;
        System.out.println("Please enter the correct pin: ");
        int guess = sc.nextInt();
        if(guess==pin){
            System.out.println("Correct pin");
            sc.close();


        }
        while(guess!=pin){


            System.out.println("Please re-enter the correct pin");
            guess = sc.nextInt();
            if(guess==pin){
                System.out.println("Correct pin");
                break;


            }

        }


    }
}
