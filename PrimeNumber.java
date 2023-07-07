import java.util.Scanner;
class PrimeNumber{
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int count=0;
        
        if(number>1){
            for(int i=1;i<=number;i++){
                if(number%i ==0)
                count++;
            }
            if(count==2){
                System.out.println("It is a prime number");
            }
            else{
                System.out.println("It is a not a prime number");
            }
        }
        else{
            System.out.println("It is not a prime number");
        }
        
    }
}
