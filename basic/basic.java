import java.util.*;
public class basic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println(sum);

//         int age = 23;
//         if (age >= 18) {
//             System.out.println(" adult ");
//         }

//        else if (age >= 13 && age < 18 ) {
//             System.out.println("teenager");
//         }
        
//         else{
//             System.out.println("You are child ");
//         }

        int income = sc.nextInt();
        int tax = 0;
        if (income < 500000 ){
            tax = 0 ;
            
        }
        else if (income >=500000 && income < 1000000) {
            tax = (int) (income * 0.2);  // int is used for converting the double value in the integer value 
           
        }else{
            tax = (int) (income * 0.3);
           
        }
         System.out.println("Your tax is " + tax);
    }

}
