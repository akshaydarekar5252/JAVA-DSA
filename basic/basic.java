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

//         int income = sc.nextInt();
//         int tax = 0;
//         if (income < 500000 ){
//             tax = 0 ;
            
//         }
//         else if (income >=500000 && income < 1000000) {
//             tax = (int) (income * 0.2);  // int is used for converting the double value in the integer value 
           
//         }else{
//             tax = (int) (income * 0.3);
           
//         }
//          System.out.println("Your tax is " + tax);






    //     int a = 20;
    //     int b = 30;
    //     int c = 40;

    //     if ( a >= b && a >= c) {
    //         System.out.println("a is greater number");
    //     }
    //     else if ( b >= c){
    //         System.out.println("b is greater number ");
    //     }
    //     else{
    //         System.out.println("c is greater ");
    //     }



        // int a = 5;

        // String type = (( a % 2 ) == 0 ) ? "even": "odd";   //ternary operator
        // System.out.println(type);

        // int marks = sc.nextInt();

        // String result = (marks >= 33) ? "pass" : "fail";
        // System.out.println(result);






    //    int a = sc.nextInt();
    //    if ( a > 0 ) {
    //     System.out.println("positive number ");
    //    }else{
    //     System.out.println("negative number ");
    //    }


    //   double temp = 103.5;

    //   if (temp > 100){
    //     System.out.println("you have fever");
    //   }else{
    //     System.out.println("you don't have fever");
    //   }









    // int week = sc.nextInt();

    // switch (week) {
    //     case 1:
    //         System.out.println("sunday");
    //         break;
    //     case 2:
    //         System.out.println("monday");
    //         break;
    //     case 3:
    //         System.out.println("tuesday");
    //         break;
    //     case 4:
    //         System.out.println("wednesday");
    //         break;
    //     case 5:
    //         System.out.println("thursday");
    //         break;
    //     case 6:
    //         System.out.println("friday");
    //         break;
    //     case 7:
    //         System.out.println("saturday");
    //         break;
    //     default:
    //         System.out.println("wrong week number ");
    //         break;
    // }



    //leap year finder 

//     int y = sc.nextInt();

//    if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)) {
//     System.out.println("Leap year");
//     } else {
//     System.out.println("Not a leap year");
//     }



        //break and continue statements 
        
        // for (int i = 1; i <= 5 ; i++){
        //     if (i == 3) {
        //         continue;                
        //     }
        //     System.out.println(i);
        // }

        //  for (int i = 1; i <= 5 ; i++){
        //     if (i == 3) {
        //        break;                
        //     }
        //     System.out.println(i);
        // }


        // Scanner sc = new Scanner(System.in);

        do {

            System.out.print("enter your number :");
            int n = sc.nextInt();

            if (n%10==0){
                System.out.println("the number was multiple of 10");
                continue;
            }
            System.out.println("number was :" + n);

        } while(true);





    }

}




