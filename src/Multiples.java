import java.util.*;
public class Multiples {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();
        for(int i = 1;i<13;i++){
            System.out.println(i + " multiple of "+num+" is " + (num*i));
        }
    }
}
