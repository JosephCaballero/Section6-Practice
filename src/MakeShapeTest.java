import java.util.*;
public class MakeShapeTest {
    public static void main(String[]args){
     MakeShape ms = new MakeShape();
     Scanner sc = new Scanner(System.in);
     System.out.println("Please enter two numbers: ");
     //ms.createTriangle(sc.nextInt(),sc.nextInt());

     ms.createRectangle(sc.nextInt());
    }
}
