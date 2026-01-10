import java.util.Scanner;

public class whileloop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range");
        int range = sc.nextInt();
        int counter = 1;
        System.out.println("Your range is");
        while (counter <= range) {
            System.out.println(counter);
            counter++;
        }
        
    }
}
