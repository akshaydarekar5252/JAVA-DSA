public class forloop {
    public static void main(String args[]){
        // for ( int i = 1; i <= 4; i++){
        //     System.out.println("****");
        // }

        // int i = 1;

        // while (i<=4) {
        //     System.out.println("****");  
        //     i++;          
        // }
     
        


        //------------>>>   print reverse of a number 

        int n = 12345;

        while(n > 0){
            int lastDigit = n % 10;  //--------->>  for the last digit of the number (remender)
            System.out.print(lastDigit);
            n = n / 10 ;    //--------->> for removing the last number 

        }

        

        




    }
}
