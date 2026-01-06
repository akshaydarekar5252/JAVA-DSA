import java.util.*;
public class basic {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println(sum);

        int age = 23;
        if (age >= 18) {
            System.out.println("You can Vote ");
        }

        if (age > 13 && age < 18 ) {
            System.out.println("teenager");
        }
        
        else{
            System.out.println("You are child ");
        }
    }

}