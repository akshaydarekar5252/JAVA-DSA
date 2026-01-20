import java.util.*;

public class set {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.println("Enter a Number :");
            number = sc.nextInt();
            if (number %2 == 0) {
                evenSum+= number;
                                
            }else{
                oddSum+= number;
            }
            System.out.println("Do you want to continue ? Press 1 for yes or 0 for no");
            choice = sc.nextInt();
        } while(choice == 1);

        System.out.println(evenSum +" this is even sum");
        System.out.println(oddSum +" this is odd sum");
    }
}
